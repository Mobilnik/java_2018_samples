package eleven.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DemoAnnotatedClass {

    @MyAnnotation(allowed = true)
    public void printHello() {
        System.out.println("Hello");
    }
}

class Demo {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        DemoAnnotatedClass annotatedClass = new DemoAnnotatedClass();
        callPrintHelloAnnotated(annotatedClass);
    }

    static void callPrintHelloAnnotated(DemoAnnotatedClass annotatedClass) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class clazz = annotatedClass.getClass();
        Method method = clazz.getDeclaredMethod("printHello");
        Annotation annotation = method.getAnnotation(MyAnnotation.class);

        if (((MyAnnotation) annotation).allowed()){
            method.invoke(annotatedClass);
        }
    }
}