import java.util.Random;
import java.util.Scanner;
public class gessingnum {
    public static void main(String args[])
    {
        int num;
        Scanner in= new Scanner(System.in);
        Random rand= new Random();
        int rand_int1= rand.nextInt(10);
        System.out.println("Enter a number:");
        num = in.nextInt();
        System.out.println("Entered number:"+num);
        System.out.println("Random number:"+rand_int1);


        if(rand_int1==num){
            System.out.println("You won!");

        }

        else {
            System.out.println("You lose!");
        }
    }
}