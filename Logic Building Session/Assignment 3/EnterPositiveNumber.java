import java.util.Scanner;
class EnterPositiveNumber {
	
	public static int askForPositiveNumber() {
		Scanner sc = new Scanner(System.in);
		int num;
		do{
			System.out.println("Enter a positive number :");
			num = sc.nextInt();
		}while(num <= 0);
		sc.close();
		return num;
	}
	public static void main(String[] args) {
		
		
		int result = askForPositiveNumber();
		
		System.out.println("You entered positive number: "+result);
	}
}