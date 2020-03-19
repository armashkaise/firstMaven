import kz.hyrogano.framework.RunTestUtil;

public class Main {
    public static void main(String[] args) throws Throwable {
        RunTestUtil.runTestsForPackage("ru.hyrogano");

//       List<String> strings = new MySuperList<>();
//       prepareItIfNeeded(strings);
//        for (String string : strings) {
//            System.out.println(string);
//        }
//
//        Human human = new Human();
//        prepareItIfNeeded(human);
//        System.out.println(human);
    }

//    private static void prepareItIfNeeded(Object object) {
//        Class<?> aClass = object.getClass();
//        Class<?>[] interfaces = aClass.getInterfaces();
//        for (Class<?> anInterface : interfaces) {
//            if (anInterface == PrepareIt.class){
//                PrepareIt prepareItArray = (PrepareIt) object;
//                prepareItArray.init();
//            }
//        }
//    }
}
