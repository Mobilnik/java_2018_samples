package four.exceptions;

import java.io.IOException;

public class Demo1 {

    public static void main(String[] args) {
        exceptionDemo(); //раскомментить секцию throws
    }

    public static void exceptionDemo()
                /*throws Exception *//*Можем напугать о том, чего нет*/
                /*throws NullPointerException*/ /*Можем предупредить о непроверяемом исключении*/{
        //Throwable
        //Exception, Error

        //Throwable и Exception и все их наследники
        // (за исключением наследников Error-а и RuntimeException-а) — checked

        //Error и RuntimeException и все их наследники — unchecked

        //ключевые слова: throws, throw, try, catch, finally
        throw new NullPointerException();// OK
        //throw new Exception();//Ошибка компиляции. Обязаны декларировать проверяемое исключение в сигнатуре.
        //Нужно предупредить в throws о том, что бросаем или о большем.
    }
}
