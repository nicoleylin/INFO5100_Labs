import java.util.Scanner;
public class main {
    public static void main(String[] args){
        //call a class and build a new object of WeightGrades class
        WeightGrades obj = new WeightGrades();
        System.out.print("Enter the total points: ");
        //call a private attribute: total points
        double totalPoints = obj.getTotalPoints();
        System.out.print("Enter the earned points: ");
        //call a private attribute: earned points
        double earnedPoints = obj.getEarnedPoints();
        System.out.print("Enter the assigned percentage: ");
        //call a private attribute: percentage
        double percent = obj.getPercentage();
        //call a public method in weightgrades class to calculate the result
        obj.weightGrades(totalPoints, earnedPoints, percent);

    }

}
