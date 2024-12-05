import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Palindrome ob = new Palindrome();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        boolean bool= ob.checkPalindrome(n);

        if(bool==true)
        System.out.println(n+" is a Palindorme"); 
        else
        System.out.println(n+" is not a Palindorme");
    }

    static boolean checkPalindrome(int n){
        int num=n;
        int m=0;
        while(num>0){
            m= m*10+num%10;
            num/=10;
        }
        if(m==n)
        return true;
        return false;
    }
}
