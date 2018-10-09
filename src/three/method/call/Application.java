package three.method.call;

public class Application {
    public static void main(String[] args) {
        MethodCallDemo mcDemo = new MethodCallDemo();
        double x = 12;
        System.out.println("PRIMITIVE BEFORE: " + x);
        mcDemo.changeX(x);
        System.out.println("PRIMITIVE AFTER: " + x);

        Man man = new Man("Johny", 23);
        System.out.println("OBJECT BEFORE: " + man.toString());
        mcDemo.changeMan(man);
        System.out.println("OBJECT AFTER: " + man.toString());

    }
}
