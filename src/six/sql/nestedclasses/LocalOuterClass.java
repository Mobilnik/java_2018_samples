package six.sql.nestedclasses;

public class LocalOuterClass {
    String hello = "hello";

    void doSomething() {
        //не рекомендую к использованию
        class LocalClass {
            private void doSmth() {
                System.out.println(hello);
                //или
                //System.out.println(LocalOuterClass.this.hello);
            }
        }
        LocalClass lc = new LocalClass();
        lc.doSmth();
    }
}

class LocalDemoClass {
    public static void main(String[] args) {
        LocalOuterClass loc = new LocalOuterClass();
        loc.doSomething();
    }
}
