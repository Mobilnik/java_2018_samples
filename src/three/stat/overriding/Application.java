package three.stat.overriding;

public class Application {
    public static void main(String []args){
        A aa = new A();
        A ab = new B();
        B bb = new B();
        aa.printLetter();
        ab.printLetter();
        bb.printLetter();
    }
}
