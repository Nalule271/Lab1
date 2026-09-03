public class Main {
    public class SnippetA {
    public static void main(String[] args) {

        final int MAX_RETAKES = 3;

        System.out.println("Retakes allowed: " + MAX_RETAKES);

        // MAX_RETAKES cannot be changed because it is final

        System.out.println("Retakes allowed: " + MAX_RETAKES);
    }
}
}
