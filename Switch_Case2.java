import java.util.Scanner;

class Switch_Case2 {

    public static void main(String args[]) {

        int price = 0;

        // movie tickets
        // prime
        // (1-5)150 each
        // (6-10) 5 tickets for 150 , restfor 100 each
        // 10+ 100 each
        // classic
        // 140 each
        // do while loop

        Scanner sc = new Scanner(System.in); // Scanner class used to take input from user
        char choice;
        do {
            System.out.println("Press p , P for Prime or c , C for Classic ");
            choice = sc.next().charAt(0);
        } while (choice != 'p' && choice != 'P' && choice != 'c' && choice != 'C');

        System.out.println("Please enter number of tickets :- ");
        int num = sc.nextInt();

        switch (Character.toLowerCase(choice)) {
            case 'p':
                System.out.println("You have selected Prime !!");
                if (num >= 1 && num <= 5) {
                    price = num * 150;
                } else if (num > 5 && num <= 10) {
                    price = (5 * 150) + (num - 5) * 100;
                } else if (num > 10) {
                    price = num * 100;
                }
                break;

            case 'c':
                System.out.println("You have selected Classic !!");
                price = num * 100;
                break;

            default:
                break;
        }
        System.out.println("Price is :- " + price);

    }
}