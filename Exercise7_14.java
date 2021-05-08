import java.util.Scanner;
public class product {
    public static void main( String[] args){
        int[] arr={2,4,6,8};
        System.out.printf("product of %d, %d, %d is %d\n",2,4,5, product(2,4,5));
    }
    
    public static int product(int... arr){
        int prod=1;
        for(int i=0;i<arr.length;i++) prod*=arr[i];
        return prod;
    }
}
