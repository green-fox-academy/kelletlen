public class TakesLonger {
    public static void main(String[] args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        String missingPart = "always takes longer than ";

        StringBuilder sb = new StringBuilder(quote);
        System.out.println(sb);
        sb.insert(21, missingPart);
        System.out.println(sb);



    }
}
