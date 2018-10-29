package six.sql.nestedclasses;

public class StaticOuterClass {
    //не привязан к конкретному объекту StaticOuterClass
    static class StaticNestedClass {
        void doNested() {
            System.out.println("Hello from nested");
        }

        static void doStaticNested() {
            System.out.println("Hello from static nested");
        }
    }
}


class DemoStaticOuter {
    public static void main(String[] args) {
        //Не нужно создавать объект внешнего класса.
        StaticOuterClass.StaticNestedClass nestedClass = new StaticOuterClass.StaticNestedClass();
        nestedClass.doNested();
        StaticOuterClass.StaticNestedClass.doStaticNested();
    }
}