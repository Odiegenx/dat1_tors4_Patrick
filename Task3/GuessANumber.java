import java.util.Random;
import java.util.Scanner;  


public class GuessANumber {
	private static int rnd_number;
    private static int tries;
	
    public static void main(String[] args) {
        tries=0;       // initializing the variable tries with 1.
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
		System.out.println( "Can you guess what it is?...");
        makeAGuess();
 	}



    private static void makeAGuess(){
        // Create a Scanner object
        Scanner scan = new Scanner(System.in);   	 
    	// Read user input
        
    	if (scan.hasNextDouble()){
            int number = scan.nextInt();
                if(number == rnd_number){
                                tries++;
                                System.out.println("Holy Moly you guessed the random Number!!("+rnd_number+") and it took you "+tries+" tries!");
                }else if(number != rnd_number){
                                System.out.println("Sadly you did not guess correctly,");
                                    if(number < rnd_number){
                                        System.out.println("but the random number you are trying to guess is higher than "+number+" which you guessed on. Try again!");
                                        tries++;    // counts the tries
                                        makeAGuess();
                                    }else{
                                        System.out.println("but the random number you are trying to guess is lower than "+number+" which you guessed on. Try again!");
                                        tries++;    // counts the tries
                                        makeAGuess();
                                    }  
                
                }               

        }else{
            System.out.println("you did not enter a number! try again!");
            makeAGuess();
        }

    }
   

}