import java.util.Scanner;

public class main {

 public static void main(String[] args) {
	
//Changing the value of two numbers we received from the user
	 
Scanner scanner = new Scanner(System.in);

int number3;

System.out.println("Please enter first number...");
int number1 = scanner.nextInt();

System.out.println("Please enter second number...");
int number2 = scanner.nextInt();

number3 = number1;
number1 = number2;
number2 = number3;

System.out.println("First Number: " + number1 + " Second Number: " + number2);






 

	
	
 }
}
