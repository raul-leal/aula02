public class ComparacaoStrings {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";
        String c = new String("Hello");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));
    }
}
