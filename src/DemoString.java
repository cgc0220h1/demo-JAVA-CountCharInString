import java.util.Scanner;

public class DemoString {
    public static int countChar(String str, char character) {
        int count = 0;
        for (int index  = 0; index < str.length(); index++) {
            if (character == str.charAt(index)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any string / word you want: ");
        String str = scanner.nextLine();
        System.out.println("Now enter a character. I will find it for you");
        System.out.print("Enter character: ");
        char input = scanner.next().charAt(0);
        int result = countChar(str, input);
        System.out.printf("There is %d character '%c' in the string", result, input);
    }
}
