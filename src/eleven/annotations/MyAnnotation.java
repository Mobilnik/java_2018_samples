package eleven.annotations;

import java.lang.annotation.*;

@Target(ElementType.METHOD) //по умолчанию - все
@Documented // в javadoc
@Retention(RetentionPolicy.RUNTIME) // по умолчанию - CLASS
public @interface MyAnnotation {

    boolean allowed() default false;
}
