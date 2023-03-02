import java.util.Scanner;	// imports the Scanner


//// 2.a
public class Main{
			
		Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		//// 2.b
		String messageForUser = "Please type your name.";	// I use a varible to make it easier to understand what happening
		//// 2.c
		Scanner scan = new Scanner(System.in);
		int retirementAge = 67;
		int yearsToRetirement;





		//// 2.b
		System.out.println(messageForUser);
		
		//// 2.d
		String name = scan.nextLine();
		//// 2.e
		System.out.println("Hello "+name+" nice to meet you, now Please type your age");
		//// 2.f
		int age = scan.nextInt();
		//// 2.g
		System.out.println("Your entered age is "+age);

		//// 2.h
		yearsToRetirement = retirementAge - age;
		if(yearsToRetirement < 0){					
			System.out.println("Congrats, you should already be retired");
		}else{
			System.out.println("You have "+yearsToRetirement+" years left before retirement");
		}


	}





}