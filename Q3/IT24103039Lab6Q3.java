import java.util.Scanner;
   public class IT24103039Lab6Q3 {
	public static void main(String[] args) {

	//Defining the variables
	int num,count=0;
	double sumOfSquares=0,rms,squareOfNum;

	//Creating a new Scanner class
	Scanner input=new Scanner(System.in);

	//Telling user to input the number to find rms
	System.out.println("Enter a positive number (Terminate input with -99)");

	//Entering in to while loop to get inputs
	while(true)
	{
	  System.out.print("Enter a number : ");
	  num=input.nextInt();

	//Terminate when -99 is entered
	if(num==-99)
	{
	  break;
		}

	//Check for negative inputs
	if(num<0)
	{
	  System.out.print("Invalid input. Please enter a positive integer or -99 to terminate");
System.out.print("\n");
continue;
	}

	//Calculate the square of the number and addit tosumOfSquares
	sumOfSquares += num * num;
	count++;
	}

	//Creating a blank space
	System.out.println("");

	//Calculate the root mean square
	if(count>0)
	{
	   rms=Math.sqrt(sumOfSquares/count);
	   System.out.println("The Root Mean Square (RMS) is: " +rms);
	 }

	}
}


	 
	
