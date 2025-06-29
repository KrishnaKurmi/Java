public class SpecialNum {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        int sum = isSpecial(num);
        if(num==sum)
            System.out.println(num+" is a Special Number.");
        else
            System.out.println(num+" is not a Special Number.");
    }
    public static int isSpecial(int num){
        int dig,s=0,p=1;
        while(num>0){
            dig = num%10;
            p*=dig;
            s+=dig;
            num/=10;
        }
        return s+p;
    }
}
