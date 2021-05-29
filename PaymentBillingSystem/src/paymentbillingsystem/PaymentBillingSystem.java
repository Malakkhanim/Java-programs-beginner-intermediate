package paymentbillingsystem;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class PaymentBillingSystem {
        private Scanner scan= null;
	private int code=0;   /* declarations */
        private int usage=0;
        private int w=1;
	private String fName=null;
	private String lName=null;
	private String address=null;
	private String contact=null;
	PaymentBillingSystem(Scanner scan)
	{
		this.scan=scan;
	}
	
	public void registration()
	{
		System.out.println("Please enter your first name : ");
		fName= scan.next();
		System.out.println("Please enter your last name : ");
		lName= scan.next();
		System.out.println("Please enter your address : ");
		address= scan.next();
		System.out.println("Please enter your contact : ");
		contact= scan.next();
		Random random= new Random();
		code=random.nextInt(100000);
		System.out.println("Your subscription code is "+code);
		usage =random.nextInt(1500);
                System.out.println("Your unit of usage : "+ usage );
		System.out.println("---------------------------------------");
		System.out.println("Your registration successfully completed...");
                generateBill();
	}
	public void login()
	{       
           /* data of the users name and ids(subscription codes) */
           ArrayList<String> namesId = new ArrayList<String>();
           namesId.add("Melek Rustamova");
           namesId.add("Elnare Elekberova");
           namesId.add("Memmedli Konul");
           ArrayList<Integer> usages= new ArrayList<Integer>(); /* arraylist for usages(kv)*/
           usages.add(1122);
           usages.add(540);
           usages.add(1232);
            /* integer arr[] for user's codes*/
            Integer arr[] = { 1222, 12134, 1123, 141, 1512, 26, 217, 128, 129, 21012 };
                for (int i = 0; i < arr.length; i++) {
                    System.out.println("Enter your subscription code : ");
		    int newId=scan.nextInt();
                    arr[i] = newId;
		    System.out.println();
                if(newId==1222 || newId==1512 || newId==26){
                    System.out.println("Welcome, wait for your bill...");
                    System.out.println("------------------Bill-----------------");
                    System.out.println("Name -->                "+namesId.get(0));
                    System.out.println("Unit -->                    "+usages.get(0)+" kv");
                    System.out.printf("Total amount(azn) that you paid --------->"+usages.get(0)*0.07+" azn");
                    System.out.println();
		            System.out.println("---------Thank-you-come-again----------");
                }
                else if(newId==12134 || newId==217 || newId==21012){
                    System.out.println("Welcome, wait for your bill...");
                    System.out.println("------------------Bill-----------------");
                    System.out.println("Name -->                "+namesId.get(1));
                    System.out.println("Unit -->                    "+usages.get(1)+" kv");
                    System.out.printf("Total amount(azn) that you paid -->"+usages.get(1)*0.07+" azn");
                    System.out.println();
		            System.out.println("---------Thank-you-come-again----------");
                }
                else if ( newId==1123 || newId==141 || newId==128 || newId==129) {
                    System.out.println("Welcome, wait for your bill...");
                    System.out.println("------------------Bill-----------------");
                    System.out.println("Name -->                "+namesId.get(2));
                    System.out.println("Unit -->                    "+usages.get(2)+" kv");
                    System.out.printf("Total amount(azn) that you paid -->"+usages.get(2)*0.07+" azn");
                    System.out.println();
		            System.out.println("---------Thank-you-come-again----------");
                }
                else {
                    System.out.println("Try Again or Make an account");
                }
            break;   
        }
	}
	private void generateBill()
	{
            System.out.printf("Please enter your subscription code : ", code);
            int newId=scan.nextInt();
            if (newId==code ){
             System.out.println("Please enter 1 for payment:");
             int j=scan.nextInt();
             if(j==1){ 
                System.out.println("Total amount(azn) that you must pay -->"+usage*0.07+" azn");
                System.out.println("Enter your money: ");
                float money;
                 money = scan.nextFloat();
                if(money==usage*0.07){
                    
               
		System.out.println("------------------Bill-----------------");
		System.out.println();
		System.out.println("Name -->                              "+fName+lName);
		System.out.println("Address -->                           "+address);
		System.out.println("Contact -->                           "+contact);
		System.out.println("Unit -->                              "+usage+" kv");
                System.out.println("Total amount(azn) you paid -->"+usage*0.07+" azn");
                System.out.println();
		System.out.println("---------Thank-you-come-again----------");
                }
                else if (money<usage*0.07){
                    System.out.println("------------------Bill-----------------");
		System.out.println();
		System.out.println("Name -->                              "+fName+lName);
		System.out.println("Address -->                           "+address);
		System.out.println("Contact -->                           "+contact);
		System.out.println("Unit -->                              "+usage+" kv");
                System.out.println("Total amount(azn) you paid -->"+money+" azn");
                float newDebt;
                    newDebt = (float) ((usage*0.07)-money);
                System.out.println("Your debt:"+ newDebt);
                System.out.println();
		System.out.println("---------Thank-you-come-again----------");
                }
                else if (money>usage*0.07){
                    System.out.println("------------------Bill-----------------");
		System.out.println();
		System.out.println("Name -->                              "+fName+lName);
		System.out.println("Address -->                           "+address);
		System.out.println("Contact -->                           "+contact);
		System.out.println("Unit -->                              "+usage+" kv");
                System.out.println("Total amount(azn) you paid -->"+money+" azn");
                float newMoney;
                    newMoney = (float) (money-(usage*0.07));
                System.out.println("Take your money:"+newMoney );
                System.out.println();
		System.out.println("---------Thank-you-come-again----------");
                }
                
                }
                else {
                    System.out.println("Name -->                           "+fName+lName);
		System.out.println("Address -->                            "+address);
		System.out.println("Contact -->                            "+contact);
		System.out.println("Unit -->                               "+usage);
                System.out.println("Total amount(azn) that you must pay -->"+usage*0.07+" azn");
                }   
            }
            else {
                System.out.println("Try Again!");	
	}
}
}
        

