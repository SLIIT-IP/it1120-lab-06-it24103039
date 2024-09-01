import java.util.Scanner;
  public class IT24103039Lab6Q2C {
	public static void main(String[] args) {
	
	//Create an object called input to Scanner class
	Scanner input=new Scanner(System.in);

	//Defining variable
	int num=1;
	 int number1=0, number2=0, number3=0, number4=0, number5=0, number6=0, number7=0, 	 number8=0, number9=0, number10=0;

	System.out.println("Please enter 10 numbers:");

	//Going for while loop
	while(num<=10)
	{
	   System.out.print("Enter the number " +num+ ": ");

		if (num==1)
	         {
	     	   number1 = input.nextInt();
			}
		else if (num==2)
		 {
		   number2 = input.nextInt();
			}
		else if (num==3)
		 {
		   number3 = input.nextInt();
			}
		else if (num==4)
		{
		    number4 = input.nextInt();
		         }
		else if (num==5)
		{
		    number5 = input.nextInt();
			  }
		else if (num==6)
		{
		     number6 = input.nextInt();
			   }
		else if (num==7)
		{
		     number7 = input.nextInt();
			   }
		else if (num==8)
		{
		     number8 = input.nextInt();
			   }
		else if (num==9)
		{
		     number9 = input.nextInt();
			   }
		else if (num==10)
		{
		     number10 = input.nextInt();
			   }
		num++;
	
	}   //Ending the while loop

	//Creating a space in between
	System.out.println("");

	//Printing the saved outputs
	System.out.println("Entered numbers are:");
	System.out.print(number1 + " " + number2 + " " + number3 + " " + number4 + " " + number5 + " " + number6 + " "+ number7 + " " + number8 + " " + number9 + " " + number10);

	
//Finding out the sum and averge
int sum=number1+number2+number3+number4+number5+number6+number7+number8+number9+number10;
double average = sum/10.0;

//Displaying sum and average 
System.out.println("");
System.out.println("Sum of the numbers:" +sum);
System.out.println("Average of the numbers:" +average);
	}
}