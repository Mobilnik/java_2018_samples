package eleven.reflections;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;

public class TestClass {
    private int intField;
    double doubleField;
    protected String stringField;
    public Object objectField;

    public TestClass(int intField, double doubleField, String stringField, Object objectField) {
        this.intField = intField;
        this.doubleField = doubleField;
        this.stringField = stringField;
        this.objectField = objectField;
    }

    private void voidMethod(String stringToPrint) {
        System.out.println("Hello, I'm a void method. My arg is " + stringToPrint);
    }

    public String stringMethod() {
        return "";
    }

    @Override
    public String toString() {
        return "TestClass{" +
                "intField=" + intField +
                ", doubleField=" + doubleField +
                ", stringField='" + stringField + '\'' +
                ", objectField=" + objectField +
                '}';
    }
}

class ReflectionsDemo {
    public static void main(String[] args) {
        classNamesDemo();
        Class firstClassInstance = TestClass.class;
        try {
            Class secondClassInstance = Class.forName("eleven.reflections.TestClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println();


        //Играемся с конструкторами
        Arrays.stream(firstClassInstance.getDeclaredConstructors())
                .forEach(constructor -> System.out.println("Constructor: " + constructor.getName()));
        Constructor constructor =
                null;
        try {
            constructor = firstClassInstance.getDeclaredConstructor(int.class, double.class, String.class, Object.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        TestClass testClass = null;
        try {
            testClass = (TestClass) constructor.newInstance(1, 2.50, "MyClass", new Object());
            System.out.println(testClass.toString());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println();

        //делаем грязь. Поля
        try {
            Field privateIntField = firstClassInstance.getDeclaredField("intField");
            //privateIntField.setAccessible(true);
            privateIntField.setInt(testClass, 1234567);
            System.out.println(testClass.toString());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println();

        //делаем грязь - 2. Методы
        try {
            Method privateVoidMethod = firstClassInstance.getDeclaredMethod("voidMethod", String.class);
            System.out.println(privateVoidMethod.getReturnType());
            //privateVoidMethod.setAccessible(true);
            privateVoidMethod.invoke(testClass, "123");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    static void classNamesDemo() {
        System.out.println("/*** Class names demo ***\\");
//primitive
        System.out.println("name:" + int.class.getName());
        System.out.println("canonical name:" + int.class.getCanonicalName());
        System.out.println("simple name:" + int.class.getSimpleName());

        System.out.println();

//class
        System.out.println("name:" + String.class.getName());
        System.out.println("canonical name:" + String.class.getCanonicalName());
        System.out.println("simple name:" + String.class.getSimpleName());

        System.out.println();

//inner class
        System.out.println("name:" + HashMap.SimpleEntry.class.getName());
        System.out.println("canonical name:" + HashMap.SimpleEntry.class.getCanonicalName());
        System.out.println("simple name:" + HashMap.SimpleEntry.class.getSimpleName());

        System.out.println();

//anonymous inner class
        System.out.println("name:" + new Serializable() {
        }.getClass().getName());
        System.out.println("canonical name:" + new Serializable() {
        }.getClass().getCanonicalName());
        System.out.println("simple name:" + new Serializable() {
        }.getClass().getSimpleName());
        System.out.println("/*** Class names demo end ***\\");
        System.out.println();
    }
}