import java.util.Scanner;

public class PaintEstimator {
	public static void main(String[] args) {
		//establish scanner and variables
        Scanner scnr = new Scanner(System.in);
        double wallHeight;
        double wallWidth;
        double wallArea;
        double gallonsNeeded;
        int cansNeeded;
        
        final int SQUARE_FEET_PER_GALLON = 350;
        final double GALLONS_PER_CAN = 1.0;

        //get user input
        System.out.println("Enter wall height (feet):");
        wallHeight = scnr.nextDouble();
        System.out.println("Enter wall width (feet):");
        wallWidth = scnr.nextDouble();

        //Wall Area calculations and print
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        //Gallions needed calculations and printed
        gallonsNeeded = wallArea / SQUARE_FEET_PER_GALLON;
        System.out.println("Paint needed: " + gallonsNeeded + " gallons");

        //Cans needed calculations and printing
        cansNeeded = (int)Math.ceil(gallonsNeeded / GALLONS_PER_CAN);   //Round cans up to the nearest can
        System.out.println("Cans needed: " + cansNeeded + " can(s)");
    }
}