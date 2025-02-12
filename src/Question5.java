public class Question5 {
    public static void main(String[] args) {
        String str = "  Hello, Java  ";
        String multiLine = "   Line1\n   Line2\n   Line3   ";


        System.out.println("Repeat: " + "Java ".repeat(3));

        System.out.println("Strip: '" + str.strip() + "'");

        System.out.println("Trim: '" + str.trim() + "'");

        System.out.println("Is Blank: " + "   ".isBlank());

        System.out.println("Indented:\n" + str.indent(5));

        String transformed = str.transform(s -> s.toUpperCase());
        System.out.println("Transformed: " + transformed);

        System.out.println("Strip Indent:\n" + multiLine.stripIndent());

        String escaped = "Hello\\nJava";
        System.out.println("Translated Escapes: " + escaped.translateEscapes());

        String tripleQuoteString = """
                This is a 
                multi-line string
                in Java""";
        System.out.println("Triple Quotes:\n" + tripleQuoteString);

        String formattedStr = "My name is %s and I love %s.".formatted("Rohit", "Java");
        System.out.println("Formatted: " + formattedStr);
    }
}
