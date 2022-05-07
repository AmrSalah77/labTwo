import java.util.Scanner;

class Main{
    public static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args){
        int number;
        System.out.println("Enter number");
        number = scanner.nextInt();
        even_odd numberCheck = new even_odd();
        int n = numberCheck.checkEven_or_odd(number);
        if(n == 2)
            System.out.println("Even");
        else if (n == 1)
            System.out.println("odd");
        else
            System.out.println("Neutral");
    }
}

public class even_odd {
    // neutral:0,odd:1,even:2
    int checkEven_or_odd (int num){
        if (num == 0)
            return 0;
        if  (num%2==0)
            return 2;
        return 1;
    }
}

