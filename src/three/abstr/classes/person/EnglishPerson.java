package three.abstr.classes.person;

public class EnglishPerson extends AbstractPerson {

    public EnglishPerson(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("Hello sir! My name is " +
                name + ".");
    }
}
