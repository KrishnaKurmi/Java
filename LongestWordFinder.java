import java.util.Scanner;
// using StingBuilder
public class LongestWordFinder{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        StringBuilder currentWord = new StringBuilder();
        String longestWord = "";
        
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            
            if (ch != ' ' && ch != '\t') {
                currentWord.append(ch);
            } 
            else {
                if (currentWord.length() > longestWord.length()) {
                    longestWord = currentWord.toString();
                }
                currentWord.setLength(0);
            }
        }
        
        if (currentWord.length() > longestWord.length()) {
            longestWord = currentWord.toString();
        }
        
        System.out.println("The longest word is: " + longestWord);
    }
}
