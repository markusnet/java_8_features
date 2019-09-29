package FunctionalInterfaceEx;

public class ConverterEx {
    public static void main(String[] args) {
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer converted = converter.convert("123");
        System.out.println(converted);    // 123

        //Или по другому

        Converter<String, Integer> converterOther = Integer::valueOf;
        Integer convertedOther = converterOther.convert("123");
        System.out.println(convertedOther);   // 123
    }
}
