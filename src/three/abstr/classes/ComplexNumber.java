package three.abstr.classes;

public class ComplexNumber extends AbstractComplexNumber {

    /*
    public ComplexNumber() {
        super(); // не обязательно
        re = 0;
        im = 0;
    }*/


    public ComplexNumber(double re, double im) {
        super(re, im);
    }

    @Override
    AbstractComplexNumber add(AbstractComplexNumber anotherNumber) {
        return new ComplexNumber(this.re + anotherNumber.re, this.im + anotherNumber.im);
    }

    @Override
    AbstractComplexNumber subtract(AbstractComplexNumber anotherNumber) {
        return null;
    }

    @Override
    AbstractComplexNumber multiply(AbstractComplexNumber anotherNumber) {
        return null;
    }

    @Override
    AbstractComplexNumber divide(AbstractComplexNumber anotherNumber) {
        return null;
    }

    @Override
    AbstractComplexNumber negate() {
        return null;
    }

    @Override
    double calculateModulus() {
        return 0;
    }

    @Override
    double calculateArgument() {
        return 0;
    }

    @Override
    public String toString() {
        return "ComplexNumber{" +
                "re=" + re +
                ", im=" + im +
                '}';
    }
}
