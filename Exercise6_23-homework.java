import java.util.Scanner;
import java.lang.Math;
class minimum3{
    public static Float minimumThree(Float a, Float b, Float c){
        Float min = Math.min(a, Math.min(b, c));
        return min;
    }
    public static void main(String[] args){        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        Float a = sc.nextFloat();
        System.out.println("Enter the second number");
        Float b = sc.nextFloat();
        System.out.println("Enter the third number");
        Float c = sc.nextFloat();
        System.out.println("Minimum of "+ a + ", " + b + " and "
            + c + " = " + minimumThree(a,b,c));
    }
}

