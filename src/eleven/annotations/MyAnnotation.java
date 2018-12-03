package eleven.annotations;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Documented // в javadoc
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

    boolean allowed() default false;
}
