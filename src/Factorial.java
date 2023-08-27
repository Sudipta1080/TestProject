import java.util.*;

public class Factorial implements FactorialInterface{


    @Override
    public int factorial(int fact) {
        if(fact >= 0) {
            if (fact > 1) {
                return fact * factorial(fact - 1);
            } else {
                return 1;
            }
        }
        else{
            if(fact <= -1){
                return fact*factorial(fact+1);
            }
            else{
                return 1;
            }
        }
    }

    public static void main(String[] args) {
        int number, result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        number = sc.nextInt();

        result = new Factorial().factorial(number);
        System.out.println("Factorial is : "+result );
    }
}
