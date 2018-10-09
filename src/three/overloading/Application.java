package three.overloading;

public class Application {
    public static void main(String[] args) {
        double d1 = 1, d2 = 2, d3 = 3, d4 = 4, d5 = 5;
        OverloadingDemo demo = new OverloadingDemo();
        demo.printDoublesSum(d1, d2, d3);
        demo.printDoublesSum(new double[]{d1, d2, d3, d4});
        demo.printDoublesSum(d1, d2, d3, d4);
    }
}
