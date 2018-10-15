package four.wrappers;

public class WrappersDemo {

    public static void main(String[] args) {
        Integer i1 = new Integer(1);
        int i2 = new Integer(2);
        Integer i3 = 3;
        //int iNull = null;
        Integer iNull2 = null;

        Integer parsedInt = Integer.parseInt("1231");
        //Integer parsedInt2 = Integer.parseInt("123.2");

        Integer maxInt = Integer.MAX_VALUE;
        Integer minInt = Integer.MIN_VALUE;

        testMethod(maxInt);
    }

    private static void testMethod(Integer i){
        System.out.println(i);
    }
}
