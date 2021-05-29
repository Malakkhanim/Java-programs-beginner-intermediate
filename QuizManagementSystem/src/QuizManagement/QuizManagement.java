package QuizManagement;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class QuizManagement {
        Scanner scan= null;  /* declarations */
	private String firstName=null;
	private String lastName=null;
        private int code=0;
        QuizManagement(Scanner scan)
	{
		this.scan=scan;
	}
		public void registration()
	{
		System.out.println("Please enter your first name : ");
		firstName= scan.next();
		System.out.println("Please enter your last name : ");
		lastName= scan.next();
		Random random= new Random();
		code=random.nextInt(100000);
		System.out.println("Your code is "+code);
		System.out.println("-------------------------------------------");
		System.out.println("Your registration successfully completed...");
                generateTest();
	}   
               public void login()
	{       
           /* data of the users name and codes */
           ArrayList<String> namesId = new ArrayList<>();
           namesId.add("Rehimova Aytekin");
           namesId.add("Rustemli Sevda");
           namesId.add("Bagiyev Emin");
           namesId.add("Memmedli Aytac");
           Integer arr[] = { 262, 134, 13, 11 };
                for (int i = 0; i < arr.length; i++) {
                    System.out.println("Enter your code : ");
		     int newCode=scan.nextInt();
                     arr[i] = newCode;
		     System.out.println();
                       if(newCode==262 || newCode==134 || newCode==13 || newCode==11){
                           System.out.println("Let's begin");
                           generateTest();
                       }
                       else {
                           System.out.println("Looks like you don't have an account");
                           registration();
                       }
                       break;
                  }  
        }
           private void generateTest(){
               System.out.println("Write your grade (9): ");
               int grades=scan.nextInt();
               int begin=0;
               if( grades==9){
                   System.out.println("Wait...");
                   System.out.println("1) What's the answer of (12x – 3) – (8x + 5) = 32?\nA)10\nB)12\nC)14");
                   String ans_1="A";
                   String ans_2="B";
                   String ans_3="C";
                   System.out.printf("Please enter answer:");
                   String a = scan.next();
                   System.out.println("-------------------------------------------------------");
                   if(ans_1.equals(a) || a.equals("a")){
                       System.out.println("Your first answer is correct");
                       begin=begin+1;
                   }
                   else{
                       System.out.println("Your first answer is incorrect");
                   }
                   
                   System.out.println("2) What's the square root of 16?\nA)16\nB)4\nC)256");
                   String anss_1="A";
                   String anss_2="B";
                   String anss_3="C";
                   System.out.printf("Please enter answer:");
                   String b=scan.next();
                   System.out.println("-------------------------------------------------------");
                   if(b.equals(anss_2) || b.equals("b")){
                       System.out.println("Your second answer is correct");
                       begin=begin+1;
                   }
                   else{
                       System.out.println("Your second answer is incorrect");
                       begin+=0;
                   }
                   System.out.println("3) What's the addition of 1/4+3/4?\nA)0.5\nB)1\nC)0.75");
                   String anssw_1="A";
                   String anssw_2="B" ;
                   String anssw_3="C";
                   System.out.printf("Please enter answer:");
                   String c=scan.next();
                   System.out.println("-------------------------------------------------------");
                   if(c.equals(anssw_2) || c.equals("b")){
                     System.out.println("Your third answer is correct");
                     begin+=1;
                   }
                   else{
                       begin+=0;
                       System.out.println("Your third answer is incorrect");
                   }
                   System.out.println("4) What's the opposite of 2?\nA)-2\nB)2\nC)0.5");
                   String answ1="A";
                   String answ2="B";
                   String answ3="C";
                   System.out.printf("Please enter answer:");
                   String d=scan.next();
                   System.out.println("-------------------------------------------------------");
                   if(d.equals(answ1) || d.equals("a")){
                       System.out.println("Your fourth answer is correct");
                       begin+=1;
                   }
                   else{
                       System.out.println("Your fourth answer is incorrect");
                       begin+=0;
                   }
                    System.out.println("5)Which number is the biggest one?\nA)-6\nB)-8\nC)-5");
                   String anssw1="A";
                   String anssw2="B";
                   String anssw3="C";
                   System.out.printf("Please enter answer:");
                   String e=scan.next();
                   System.out.println("-------------------------------------------------------");
                   if(e.equals(anssw3) || e.equals("c")){
                       System.out.println("Your fifth answer is correct");
                       begin+=1;
                   }
                   else{
                       begin+=0;
                       System.out.println("Your fifth answer is incorrect");
                   }
                   System.out.printf("YOUR SCORE IS :");
                   System.out.println(begin);
                   if(begin==4 || begin==5){
                       System.out.println("Your point is 5");
                   }
                   else if(begin==3){
                       System.out.println("Your point is 4");
                   }
                   else if (begin==2){
                       System.out.println("Your point is 3");
                   }
                   else{
                       System.out.println("Your point is 2");
                   }}
               else {
                   System.out.println("Choose your grade correctly!(9)");
               }       
              
           }
}

      
