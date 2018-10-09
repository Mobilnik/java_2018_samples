package three.abstr.classes;

public class Application {
    public static void main(String[] args) {
        AbstractComplexNumber z1 = new ComplexNumber(1, 1);
        AbstractComplexNumber z2 = new ComplexNumber(3, 2);

        System.out.println(z1.add(z2).toString());
    }
}
