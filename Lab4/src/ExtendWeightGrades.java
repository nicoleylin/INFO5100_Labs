import java.util.Scanner;

public class ExtendWeightGrades{
    Scanner scanner = new Scanner(System.in);

    //create private attributes
    private static double totalWeightGrade=0; // adding a new attribute to store the total weight grade in the class
    private double total;
    private double earned;
    private double per;

    //for each private attribute, create a public method to get a value from user input
    public int[] getTotalGrades(){
        String total = scanner.nextLine();    // reading input as string
        String[] splittotal = total.split("\\s+");           // spliting string totalgrades
        int[] integertotal = new int[splittotal.length];


        for(int i=0; i<splittotal.length; i++) {
            String stringtotal = splittotal[i];
            integertotal[i] = Integer.parseInt(stringtotal); // storing values as Integer
        }
        return integertotal;
    }

    public int[] getEarnedGrades(){
        String earned = scanner.nextLine();                 // reading input as string

        String[] splitearned = earned.split("\\s+");           // spliting earnedgrades
        int[] integerearned = new int[splitearned.length];


        for(int i=0; i<splitearned.length; i++) {
            String stringearned = splitearned[i];
            integerearned[i] = Integer.parseInt(stringearned); // storing values as Integer
        }
        return integerearned;


    }

    public int[] getPercentage(){

        String per = scanner.nextLine();                 // reading input as string

        String[] splitper = per.split("\\s+");           // spliting percentage
        int[] integerper = new int[splitper.length];

        int sum = 0; //
        for(int i=0; i<splitper.length; i++) {
            String stringper = splitper[i];
            integerper[i] = Integer.parseInt(stringper); // storing values as Integer
            sum += integerper[i];    // check if the percentage is if out of 100
            if(sum > 100){
                System.out.println("the percentage is out of 100, please input proper percentages.");
            }

        }
        return integerper;

    }

    //create a public method to calculate the total weight grades based on the attributes and printout the final letter grade
    public static void totalGrade(int[] integertotal, int[] integerearned, int[] integerper){
        for(int i=0; i<integertotal.length;i++){
            totalWeightGrade += ((double) integerearned[i] / (double) integertotal[i]) * integerper[i]; // iteration through the three arrays to get total assginment's total weight grade
        }

        if(totalWeightGrade >= 90 && totalWeightGrade <= 100){
            System.out.println("Total Grade = " + totalWeightGrade+" which is an A ");
        }
        else if(totalWeightGrade >= 80 && totalWeightGrade <= 89.9999){
            System.out.println("Total Grade = " + totalWeightGrade+" which is a B ");
        }
        else if(totalWeightGrade >= 70 && totalWeightGrade < 80){
            System.out.println("Total Grade = " + totalWeightGrade+" which is a C ");
        }
        else if(totalWeightGrade >= 60 && totalWeightGrade < 70){
            System.out.println("Total Grade = " + totalWeightGrade+" which is a D ");
        }
        else{
            System.out.println("Total Grade = " + totalWeightGrade+" which is a F ");
        }


    }
}