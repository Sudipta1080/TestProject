import java.util.*;
import java.lang.Math.*;
public class PrimeNumberCheck {
    public String checkPrimeNumber(int number){
        int f=0;
        for(int i=2;i < Math.sqrt(number); i++){
            if(number%i==0){
                f=1;
                break;
            }

        }
        if(f==0)
            return " Number is Prime...";
        else
            return " Number is Not Prime ";
    }

    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        number = sc.nextInt();
        String Result = new PrimeNumberCheck().checkPrimeNumber(number);
        System.out.println(Result);
        sc.close();
    }
}
