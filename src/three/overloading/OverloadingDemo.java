package three.overloading;

public class OverloadingDemo {

    public void printDoublesSum(double d1, double d2) {
        System.out.println("Called three.method for 2 doubles");
        System.out.println(d1 + d2);
    }

    public void printDoublesSum(double d1, double d2, double d3) {
        System.out.println("Called three.method for 3 doubles");
        System.out.println(d1 + d2 + d3);
    }

    public void printDoublesSum(double... doubles) {
        System.out.println("Called three.method for vararg");
        double sum = 0;
        for (int i = 0; i < doubles.length; ++i) {
            sum += doubles[i];
        }
        System.out.println(sum);
    }

   /* public void printDoublesSum(double[] doubles) {
        System.out.println("Called three.method for vararg");
        double sum = 0;
        for (double d : doubles) {
            sum += d;
        }
        System.out.println(sum);
    }*/
}
