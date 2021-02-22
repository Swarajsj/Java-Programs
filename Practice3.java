import java.util.Scanner;

public class Practice3 {

    public static void main(String args[]) {

        // A shopping mall is providing discounts on shopping in all four sections.
        // The sections are 'B', 'M', 'G', and 'W'.
        // The discount of 20% is applicable in the boys('B') section, 30% in men('M')
        // section, 40% in the girls('G') section and 45% in the women(W) section.
        // Write a program that takes price as input and displays the final price after
        // discount. Use switch case.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price :");
        int price = sc.nextInt();
        System.out.println("Enter the Category :");
        char choice = sc.next().charAt(0);
        switch (choice) {

            case 'B':
                System.out.println("You have selected Boys section !!");
                System.out.println("Final price after discount of Boys selection is : ");
                System.out.println(price - 0.2 * price);
                break;
            case 'M':
                System.out.println("You have selected Mens section !!");
                System.out.println("Final price after discount of Mens selection is : ");
                System.out.println(price - 0.3 * price);
                break;
            case 'G':
                System.out.println("You have selected Girls section !!");
                System.out.println("Final price after discount of Girls selection is : ");
                System.out.println(price - 0.4 * price);
                break;
            case 'W':
                System.out.println("You have selected Womens section !!");
                System.out.println("Final price after discount of Womens selection is: ");
                System.out.println(price - 0.45 * price);
                break;
            default:
                System.out.println("Invalid Category");
                break;

        }
    }
}
