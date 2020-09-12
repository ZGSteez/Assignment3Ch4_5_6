import java.util.Scanner;

public class DataSet {

    private double sum = 0;
    private int counter = 0;
    private double average;
    public double standardDeviation;

    Scanner scanner = new Scanner(System.in);

    public void add(double value) {
        double newNumber = 0;
        double checker = 123456789;
        System.out.println("Enter some floating point numbers. To get the standard deviation, enter 123456789 to stop.");
        while (newNumber != checker) {
            newNumber = scanner.nextDouble();
            if (newNumber != checker) {
                sum += newNumber;
                counter++;
            }

        }

    }

    public void getAverage() {

        average = sum / counter;
        //return average;


    }

    public double getStandardDeviation() {
        standardDeviation = Math.sqrt(((average * average) - (average * average / counter)) / (counter - 1));
        return standardDeviation;
    }


    public double returnAvg() {
        return average;
    }

    public void showResults(){
        System.out.println("Sum: " + sum);
        System.out.println("Counter: " + counter);
        System.out.println("Average : " + average);
        System.out.println("Standard Deviation: " + standardDeviation);
    }

}
