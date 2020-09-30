import java.util.Scanner;

public class CreditLimitCalculator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

	{
		int account = 1, balance, charges, credits, creditLimit, newBal;
		
	while (account != 0)
		{
			System.out.println();
			System.out.print("Enter account number: ");
			account = input.nextInt();
			
			System.out.println();
			System.out.print("Enter balance at the beginning of the month: ");
			balance = input.nextInt();
			
			System.out.println();
			System.out.print("Enter total of all items charged by the customer this month: ");
			charges = input.nextInt();
			
			System.out.println();
			System.out.print("Enter total of all credits applied to the account this month: ");
			credits = input.nextInt();
			
			System.out.println();
			System.out.print("Enter allowed credit limit: ");
			creditLimit = input.nextInt();
			
			newBal = balance + charges - credits;
			System.out.println("New balance: " + newBal);
			
				if ( newBal > creditLimit)
				{
					System.out.println("Credit limit exceeded!");
					break;
				}
		}
		}
	}

}