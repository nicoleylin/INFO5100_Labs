import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ExtendWeightGrades obj = new ExtendWeightGrades();

        System.out.println("User's input total grades: ");
        int[] total = obj.getTotalGrades();

        System.out.println("User's input earned grades: ");
        int[] earned = obj.getEarnedGrades();

        System.out.println("User's input percentage: ");
        int[] per = obj.getPercentage();

        obj.totalGrade(total, earned, per);

    }

}