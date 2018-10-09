package three.abstr.classes.person;

public abstract class AbstractPerson {
    protected String name;

    public AbstractPerson(String name) {
        this.name = name;
    }

    public void handShake(){
        System.out.println("Shaking hand");
    }

    public abstract void sayHello();
}
