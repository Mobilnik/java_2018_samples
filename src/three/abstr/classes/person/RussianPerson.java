package three.abstr.classes.person;

public class RussianPerson extends AbstractPerson {
    public RussianPerson(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("Здравствуйте! Меня зовут "
                + name + ".");
    }
}
