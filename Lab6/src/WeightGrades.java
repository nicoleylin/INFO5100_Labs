import java.util.Scanner;

public class WeightGrades{
    Scanner input = new Scanner(System.in);
    //create private attributes
    private static double weight_grades;
    private double total_points;
    private double earned_points;
    private double percentage;

    //for each private attribute, create a public method to get a value from user input
    public double getTotalPoints(){
        total_points = input.nextDouble();
        return total_points;

    }

    public double getEarnedPoints(){
        earned_points = input.nextDouble();
        return earned_points;
    }

    public double getPercentage(){
        percentage = input.nextDouble();
        return percentage;
    }
    //create a public method to calculate the weight grades based on the attributes
    public static void weightGrades(double totalPoints, double earnedPoints, double percent){
        weight_grades = (earnedPoints / totalPoints) * (percent / 100) * 100;
        System.out.printf("The weight grade is %.3f", weight_grades);

    }
}

