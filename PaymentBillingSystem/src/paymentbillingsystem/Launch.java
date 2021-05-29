package paymentbillingsystem;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Rustamova Malakkhanim
 */
public class Launch {


	public static void main(String [] args)
	{
          
            Integer[] options = {1,2};
            int n = (Integer)JOptionPane.showInputDialog(null, "If you want to make an account press 1, if you already have an account press 2:", 
                "Welcome", JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
 		Scanner scan= new Scanner(System.in);
		PaymentBillingSystem paymentbillingSystem = new PaymentBillingSystem(scan);
		
		if(n==1)
		{
			paymentbillingSystem.registration();
		}
                else if(n==2) {System.out.println("Please login your account!");
		paymentbillingSystem.login();
	        }
                
}
}