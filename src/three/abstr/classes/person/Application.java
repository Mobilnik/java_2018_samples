package three.abstr.classes.person;

public class Application {
    public static void main(String[] args) {
        AbstractPerson john =
                new EnglishPerson("John");
        AbstractPerson sergey =
                new RussianPerson("Сергей");

        john.sayHello();
        sergey.sayHello();
        john.handShake();
        sergey.handShake();
    }
}
