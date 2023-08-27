import java.util.*;
public class BinarySearch {
    public static String binarySearch(int[] numbers, int searchElement){
        int right = numbers.length - 1;
        int left = 0;
        while(right>=left){

            int mid = (right+left)/2;
//            System.out.println(mid+ " "+left+ " "+right);
            if(numbers[mid]==searchElement)
                return "Found";
            else if (searchElement > numbers[mid]) {
                left = mid+1;

            }
            else{
                right = mid - 1;
            }


        }
        return "Not Found";
    }
    //Recursive Way
    public static String binarySearch1(int []numbers, int searchElement, int lower, int upper){
        if(lower <= upper) {
            int mid = (upper + lower) / 2;
            if (numbers[mid] == searchElement)
                return "Found";
            else if (searchElement > numbers[mid])
                return binarySearch1(numbers, searchElement, mid + 1, upper);
            else
                return binarySearch1(numbers, searchElement, lower, mid - 1);
        }
        else {
            return "Not Found";
        }
    }
    public static void main(String[] args) {
        int[] numbers;
        int noOfElements, searchElement;
        String Result;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How Many Number you want to insert : ");
        noOfElements = sc.nextInt();
        numbers = new int[noOfElements];
        System.out.println("Enter the Numbers : ");
        for (int i = 0; i < noOfElements; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter the element what you need to search : ");
        searchElement = sc.nextInt();
//        Result = binarySearch(numbers,searchElement);
        Result = binarySearch1(numbers,searchElement,0,numbers.length+1);
        System.out.println(Result);

        sc.close();
    }
}
