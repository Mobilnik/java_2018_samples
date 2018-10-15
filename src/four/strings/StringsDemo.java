package four.strings;

public class StringsDemo {
    public static void main(String[] args) {
        String sNull = null;
        String s = "abcdefgh";
        String s2 = "ijklmnop";

        System.out.println(s.substring(0, 3));//abc

        System.out.println(s.charAt(2));//c

        System.out.println(s.contains("bcd"));//true
        System.out.println(s.contains("zzz"));//false

        System.out.println(s + s2); //abcdefghijklmnop

        System.out.println(s.indexOf("cd"));//2
        System.out.println(s.indexOf('c')); //2

        System.out.println("def" == "def");
       // System.out.println(new String("def") == "def");
       // System.out.println(new String("def") == new String("def"));
       // System.out.println(new String("def").equals(new String("def")));
    }
}
