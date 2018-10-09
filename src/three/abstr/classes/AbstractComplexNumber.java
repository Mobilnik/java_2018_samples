package three.abstr.classes;

public abstract class AbstractComplexNumber {
    protected double re;
    protected double im;

/*    public AbstractComplexNumber() {
    }*/

    public AbstractComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    /**
     * @param anotherNumber a number to add to current number
     * @return complex number representing operation result
     */
    abstract AbstractComplexNumber add(AbstractComplexNumber anotherNumber);

    /**
     * @param anotherNumber a number to subtract from current number
     * @return complex number representing operation result (this minus another)
     */
    abstract AbstractComplexNumber subtract(AbstractComplexNumber anotherNumber);

    /**
     * @param anotherNumber a number of times to take current number
     * @return complex number representing operation result
     */
    abstract AbstractComplexNumber multiply(AbstractComplexNumber anotherNumber);

    /**
     * @param anotherNumber a number to divide by
     * @return complex number representing operation result (this divided by another)
     */
    abstract AbstractComplexNumber divide(AbstractComplexNumber anotherNumber);

    /**
     * @return result of current complex number negating
     */
    abstract AbstractComplexNumber negate();

    /**
     * @return modulus value for current complex number
     */
    abstract double calculateModulus();

    /**
     * @return argument value for current complex number
     */
    abstract double calculateArgument();
}
