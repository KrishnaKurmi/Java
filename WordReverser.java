import java.util.Scanner;
public class WordReverser {
    static String reverseWords(String str){
        String []arr = str.split(" ");
        int len = arr.length;
        StringBuilder sb=new StringBuilder();
        for(int i=len-1;i>=0;i--){
            sb.append(arr[i]);
            sb.append(' ');
        }
        str= sb.toString();
        return str;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Sentence : ");
        String str=sc.nextLine();
        // System.out.println(str);
        System.out.println("-----------------------------");
        str=reverseWords(str);
        System.out.println("Reversed : "+str);
    }
}
