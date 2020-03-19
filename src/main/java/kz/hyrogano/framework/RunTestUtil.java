package kz.hyrogano.framework;

import com.google.common.reflect.Reflection;
import kz.hyrogano.Testable;
import kz.hyrogano.test.annotations.TestableClass;
import org.reflections.Reflections;
import org.reflections.scanners.TypeAnnotationsScanner;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Set;

public final class RunTestUtil {
    private RunTestUtil() {
    }

    public static void runTestsForPackage(String packageAsString) throws Throwable{
        Reflections reflections = new Reflections(packageAsString);
        Set<Class<?>> classes = reflections.getTypesAnnotatedWith(TestableClass.class, true);

        for (Class<?> aClass : classes) {
            Constructor<?> constructor = aClass.getConstructor(null);
            Object possibleTestContainerObjects = constructor.newInstance();
            for (Method method : aClass.getMethods()) {
                System.out.println(method.getName());
                if (method.getName().endsWith("Test"))
                    method.invoke(possibleTestContainerObjects);
            }
        }

    }
}
