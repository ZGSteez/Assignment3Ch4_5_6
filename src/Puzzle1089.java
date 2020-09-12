import java.util.Scanner;
import java.lang.*;
// 4.03


public class Puzzle1089 {
    Scanner scanner = new Scanner(System.in);
    private int userNumber = 999;

    public Puzzle1089() {
    }

    public Puzzle1089(int number) {
        userNumber = number;
    }

    public int returnNum() {
        return userNumber;
    }

    public int getNumber() {
        int number = 0;

        if (scanner.hasNextInt()){
            while (number < 100 && scanner.hasNextInt()) {
                System.out.println("Enter a number at least 3 digits long");
                //   if (scanner.hasNextInt()){
                if (scanner.hasNextInt()) {


                    number = scanner.nextInt();
                }

                else
                {
                    System.out.println("Error: Not a number");
                    System.exit(0);
                }
                // }

                //  else {
                //     System.out.println("Error: Not an integer");
                //break;

                //}
            }
            if (number > 999) {
                int lastThreeDigits = 0;
                for (int i = 0; i < 3; i++) {

                    int temp = number % 10;
                    number /= 10;
                    lastThreeDigits += (temp * Math.pow(10, i));

                }
                return lastThreeDigits;

            } else {
                return number;

            }

        }

        else {
            System.out.println("Error: Not an integer");
        }

//        while (number < 100 && scanner.hasNextInt()) {
//            System.out.println("Enter a number at least 3 digits long");
//         //   if (scanner.hasNextInt()){
//            if (number < 100) {
//
//
//                number = scanner.nextInt();
//            }
//           // }
//
//          //  else {
//           //     System.out.println("Error: Not an integer");
//                //break;
//
//            //}
//        }
//        if (number > 999) {
//            int lastThreeDigits = 0;
//            for (int i = 0; i < 3; i++) {
//
//                int temp = number % 10;
//                number /= 10;
//                lastThreeDigits += (temp * Math.pow(10, i));
//
//            }
//            return lastThreeDigits;
//
//        } else {
//            return number;
//
//        }

        return 0;
    }


    public int returnReversed() {
        int flippedNumber = 0;
        for (int i = 2; i >= 0; i--) {
            int temp = userNumber % 10;
            userNumber /= 10;
            flippedNumber += temp * Math.pow(10, i);
        }
        return flippedNumber;
    }


    public void setNumber(int number) {
        userNumber = number;
    }


}
//
//    Write a program that reads a number from the user and does the following: Discard
//        all but the last three digits. Reverse the digits, subtract the original from the reversed
//        (discarding any minus sign), reverse the digits of the difference, and add the difference
//        and the reversed difference. Then print the sum. For example:
//        Input: 371
//        Reversed: 173
//        Difference: 198
//        Reversed: 891
//        Sum: 1089
//        This procedure is sometimes called the “1089 puzzle” because the final result is 1089
//        in most cases.