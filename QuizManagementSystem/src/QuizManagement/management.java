
package QuizManagement;
import java.util.Scanner;
public class management {
    public static void main(String[] args) {
                Scanner scan= new Scanner(System.in);
                QuizManagement quizmanagement = new QuizManagement(scan);
		System.out.println("Welcome to the Online Quiz Management System!");
		System.out.printf("Please write 0 for sign up or  1 for sign in your account : ");
		int number=scan.nextInt();
		if(number==0)
		{
			quizmanagement.registration();
		}
                else {
                    System.out.println("Please login your account!");
		        quizmanagement.login();
	}
    }
    
}
