import java.util.*;

public class Main {

    static void main(String[] args) {
//        MultiplicationTable();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 2 numbers to begin: ");
//        // Receive user input
//        int input1 = sc.nextInt();
//        int input2 = sc.nextInt();
//        //Make sure user input is pos
//        input1 = Math.abs(input1);
//        input2 = Math.abs(input2);
//
//        System.out.println(GCD(input1, input2));;
//        sc.close();
        System.out.println(FutureTuition());
    }

    /* ----------------------------------------------------------------------- Task - 1
    Write a program that uses nested for loops to print a multiplication table.
     */
    static void MultiplicationTable() {
//        int[] numsArray = IntStream.range(1, 145).toArray();
//        System.out.println(numsArray);
        for (int i = 1; i <= 12; i++) {
            String line = "";
            for (int x = 1; x <= 12; x++) {
                line = String.format("%s %d", line, x * i);
            }
            System.out.println(line);
        }
    }

    /* ----------------------------------------------------------------------- Task - 2
    Write a program that prompts the user to enter two positive integers, and find their greatest common divisor (GCD).
     */
    static int GCD(int n1, int n2) {
        if (n2 == 0) return n1;

        return  GCD(n2, n1 % n2);

    }

    /* ----------------------------------------------------------------------- Task - 3
    Suppose the tuition for a university is $10,000 for the current year and increases by 7 percent every year.
    In how many years will the tuition be doubled?
     */

    static int FutureTuition() {
        double tuition = 10_000;
        double doubledTuition = tuition * 2;
        final double INCREASE_BY_YEAR = .07;
        int years = 0;

        while(tuition <= doubledTuition){
            years++;
            tuition += tuition * INCREASE_BY_YEAR;
        }
        return years;
    }
}
