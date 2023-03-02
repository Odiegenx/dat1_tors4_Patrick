import java.util.ArrayList;
import java.util.Scanner; 

	//// 4.a
public class GameMenu{

	//// 4.b
		private ArrayList<String> actions = new ArrayList<>();
	//// 4.c
		GameMenu(ArrayList<String> input_){
	//// 4.d
				this.actions = input_;			
			}

	//// 4.h
	public void displayMenu(){
		for(int i = 0; i < this.actions.size(); i++){ 
			System.out.println(actions.get(i));
			}
		/*for (String s: actions){						 // Wanted to get both a normal and enchanced for loop to work.
			System.out.println(s);
		}*/

	} 
	
	//// 5.a
	public String getAction(){

		//// 5.b // Create a Scanner object
        Scanner scan = new Scanner(System.in);   	 
    	// Read user input
    	//// 5.a
    	System.out.println("Type a number to choose an action");
    	displayMenu();

    	String choice = scan.nextLine();
    	//// 5.c
    	return choice;

    }

	

}

	