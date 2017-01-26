import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FunWithArrays {

    public static void main(String[] args) {

        PrimeTester test = new PrimeTester();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the  lower limit of number range to test:");
        test.setLowerLimit(input.nextInt());
        System.out.println("Enter the upper limit of the number range to test:");
        test.setUpperLimit(input.nextInt());

        test.testForPrime();


    }

}
