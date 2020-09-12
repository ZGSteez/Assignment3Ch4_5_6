import java.util.Scanner;
// 4.03
public class Puzzle1089Tester {
    public static void main(String[] args) {

        Puzzle1089 newPuzzle = new Puzzle1089();

        int userNumber = newPuzzle.getNumber();
        newPuzzle.setNumber(userNumber);
        System.out.println("Input: " + newPuzzle.returnNum());

        int firstReversedNumber = newPuzzle.returnReversed();
        System.out.println("Reversed: " + firstReversedNumber);

        int difference = userNumber - firstReversedNumber;
        System.out.println("Difference: " + difference);

        newPuzzle.setNumber(difference);
        int secondReversedNumber = newPuzzle.returnReversed();
        System.out.println("Reversed: " + secondReversedNumber);

        System.out.println("Sum: " + (secondReversedNumber+difference));




    }
}
