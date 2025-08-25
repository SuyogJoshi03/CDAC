import java.util.Scanner;
class AgeChecker {
	public static String checkAgeCategory(int age) {
		if(age < 18) {
			return "You are a minor.";
		}
		else if ( age >= 18 && age < 40){
			return "You are an adult.";
		}
		else {
			return "You are a senior.";
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your age: ");
		int age = sc.nextInt();
		
		String result = checkAgeCategory(age);
		
		System.out.println(result);
		sc.close();
	}
}