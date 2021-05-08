//Exercise 7.20 on book
import java.util.Scanner;
public class Exercise7_20_homework
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double[][] sales = new double[6][5];
        for(int i = 0; i < 6; i++)
            for(int j = 0; j < 5; j++)
                sales[i][j] = 0.0;
        System.out.println("Enter data: [Enter -1 to exit]");
        System.out.print("Salesperson number: ");
        int s = sc.nextInt();
        System.out.print("Product number: ");
        int p = sc.nextInt();
        System.out.print("Total dollar value of above product sold: ");
        int v = sc.nextInt();
        while(s != -1)
        {
            sales[p - 1][s - 1] += v;   //-1 because indexing starts at 0
            System.out.println("Enter data: [Enter -1 to exit]");
            System.out.print("Salesperson number: ");
            s = sc.nextInt();
            System.out.print("Product number: ");
            p = sc.nextInt();
            System.out.print("Total dollar value of above product sold: ");
            v = sc.nextInt();
        }
        for(int i = 0; i < 5; i++)
            for(int j = 0; j < 4; j++)
                sales[i][4] += sales[i][j]; //row-wise totals
        for(int j = 0; j < 4; j++)
            for(int i = 0; i < 5; i++)
                sales[5][j] += sales[i][j]; //column-wise totals
        for(int i = 0; i < 5; i++)
            sales[5][4] += sales[i][4];     //grand total
        
        System.out.println("");
        System.out.printf("      %10d%10d%10d%10d%10s\n", 1, 2, 3, 4, "Total");
        int i, j;
        for(i = 0; i < 5; i++)
        {
            System.out.printf("%5d", i + 1);
            for(j = 0; j < 5; j++)
                System.out.printf("%10.2f", sales[i][j]);
            System.out.println();
        }
        System.out.printf("%s", "Total");
        for(j = 0; j < 5; j++)
            System.out.printf("%10.2f", sales[5][j]);
        System.out.println();
    }
}