package ReferenceMetodAndConstructor;

import FunctionalInterfaceEx.Converter;
import interface_by_default.Formula;

import static java.lang.Math.sqrt;

public class Something {
    String startsWith(String s) {
        return String.valueOf(s.charAt(0));
    }

    public static void main(String[] args) {
        Something something = new Something();
        Converter<String, String> converter = something::startsWith;
        String converted = converter.convert("Java");
        System.out.println(converted);    // "J"


        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("Peter", "Parker");
        System.out.println(person);


        final int num = 1;
        Converter<Integer, String> stringConverter = (from) -> String.valueOf(from + num);

        stringConverter.convert(2);     // 3


        int num1 = 1;
        Converter<Integer, String> stringConverter1 = (from) -> String.valueOf(from + num);

        stringConverter1.convert(2);     // 3


        //Error

//        int num = 1;
//        Converter<Integer, String> stringConverter = (from) -> String.valueOf(from + num);
//        num = 3;

        Formula formula = (a) -> sqrt( a * 100);
    }
}
