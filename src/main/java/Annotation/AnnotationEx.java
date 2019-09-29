package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class AnnotationEx {

    public static void main(String[] args) {
        //OLD
//        @Hints({@Hint("hint1"), @Hint("hint2")})
//        class Person {}

        @Hint("hint1")
        @Hint("hint2")
        class Person {}

        Hint hint = Person.class.getAnnotation(Hint.class);
        System.out.println(hint);                   // null

//        Hints hints1 = Person.class.getAnnotation(Hints.class);
//        System.out.println(hints1.value().length);  // 2

        Hint[] hints2 = Person.class.getAnnotationsByType(Hint.class);
        System.out.println(hints2.length);          // 2


    }
}
