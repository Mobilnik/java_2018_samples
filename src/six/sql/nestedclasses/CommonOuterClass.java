package six.sql.nestedclasses;

public class CommonOuterClass {

    private void doSmth() {
        System.out.println("Outer: I'm doin' smth.");
    }

    public class CommonInnerClass {
        private void doSmthOuter() {
            System.out.println("Triggering action of the outer class");
            doSmth();
            //или
            CommonOuterClass.this.doSmth();
        }

        private void doSmthInner() {
            System.out.println("Inner: I'm doin' smth.");
        }
    }

    //можно даже наследовать
    public class CommonInnerClassChild extends CommonInnerClass {

    }
}

class Demo {
    public static void main(String[] args) {
        CommonOuterClass outer = new CommonOuterClass();
        CommonOuterClass.CommonInnerClass innerClass = outer.new CommonInnerClass();
    }
}
