package three.method.call;

public class MethodCallDemo {

    public void changeX(double x){
        x *= 3;
    }

    public void changeMan(Man man){
        man.setName("Jack");
        man.setAge(55);
    }
}
