import java.util.Scanner;
// 5.13
public class Atm {

    private final int PIN = 1234;
    Scanner scanner = new Scanner(System.in);
    public void askForPin(){
        int counter = 0;
        int enteredPIN = 0;
        System.out.println("Enter your PIN number");


        while (enteredPIN != PIN && counter < 3){
            enteredPIN = scanner.nextInt();
            if (enteredPIN == PIN){
                System.out.println("Your PIN is correct");
            }
            else
            {
                counter++;
            }

            if (counter < 3 && enteredPIN != PIN){
                System.out.println("Your PIN is incorrect");
            }

            if (counter == 3)
            {
                System.out.println("Your bank card is blocked");
                break;
            }
        }
    }
}
//    When you use an automated teller machine (ATM) with your bank card, you need to
//    use a personal identification number (PIN) to access your account. If a user fails
//        more than three times when entering the PIN, the machine will block the card.
//        Assume that the user’s PIN is “1234” and write a program that asks the user for the
//        PIN no more than three times, and does the following:
//        • If the user enters the right number, print a message
//        saying, “Your PIN is correct”, and end the program.
//        • If the user enters a wrong number, print a message
//        saying, “Your PIN is incorrect” and, if you have asked
//        for the PIN less than three times, ask for it again.
//        • If the user enters a wrong number three times, print a
//        message saying “Your bank card is blocked” and end
//        the program.