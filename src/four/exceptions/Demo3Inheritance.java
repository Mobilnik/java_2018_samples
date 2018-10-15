package four.exceptions;

public class Demo3Inheritance {
}

class A {
    void doSomething() throws Exception /*throws NullPointerException *//*- нельзя */
        /*throws Throwable *//*- можно */ {

    }
}

class B extends A {
    @Override
    void doSomething() throws Exception {

    }
}
