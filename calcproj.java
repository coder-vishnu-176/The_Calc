import java.util.Scanner;
public class calcproj
{
    public static void main(String[] args)
    {
        int a,b,choice;
        do
        {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t---MENU---");
        System.out.println("\t1.Addition");
        System.out.println("\t2.Subtraction");
        System.out.println("\t3.Multiplication");
        System.out.println("\t4.Division");
        System.out.println("\t5.Exit");
        System.out.print("Enter Your Choice:");
        choice = sc.nextInt();



            if (choice >= 1 && choice <= 4)
            {
                System.out.print("Enter the value of a: ");
                a = sc.nextInt();
                System.out.print("Enter the value of b:");
                b = sc.nextInt();

                switch (choice)
                {
                    case 1:
                        System.out.println("The sum is: " + (a + b));
                        break;
                    case 2:
                        System.out.println("The difference is: " + (a - b));
                        break;
                    case 3:
                        System.out.println("The product is: " + (a * b));
                        break;
                    case 4:
                        if (b != 0)
                            System.out.println("The division is: " + (a / b));
                        else
                            System.out.println("Division by zero is not allowed");
                        break;
                }

            }
            else if (choice == 5)
            {
                System.out.println("Exiting...Thankyou!!!");
            }
            else
            {
                System.out.println("Invalid choice");
            }

        }while (choice != 5) ;
    }
}