import java.util.ArrayList;
import java.util.Scanner; 

    //// 4.e
    public class Main{


        public static void main(String[] args) {
            //// 4.f
            ArrayList<String> actions = new ArrayList<>();
            //// 4.g
            GameMenu actionChoices = new GameMenu(actions);
            actions.add("1) Start game");
            actions.add("2) Resume game");
            actions.add("3) Pause game");
            actions.add("4) End Game");
            //// 4.g
            //GameMenu actionChoices = new GameMenu(actions);
            
            /*System.out.println(actions+ " This was just a test");*/
            //// 4.i


            //// 5.d
            String userChoice = actionChoices.getAction();	// <---

            System.out.println(userChoice);					// <---
            //// 5.g
            doAction(Integer.parseInt(userChoice));			// <---
/////////////Not part of the assigment, just wanted to get it to work like this///            
            /*actionChoices.displayMenu();					// <---if you want to try my other method, enable these and disable those above
            runDoAction();*/								// <---if you want to try my other method, enable these and disable those above
//////////////////////////////////////////////////////////////////////////////////
/*

i keep getting this error when i enter a letter.

Exception in thread "main" java.lang.NumberFormatException: For input string: "d"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        at java.base/java.lang.Integer.parseInt(Integer.java:665)
        at java.base/java.lang.Integer.parseInt(Integer.java:781)
        at Main.main(Main.java:29)
and could not find the error... so decided to do it an other way.
that can be seen below and abit futher up.
*/            
        }


        //// 5.e
        public static void doAction(int action_){

            int action = action_;
            switch(action){
            case 1:
            System.out.println("Starting the game now");
            break;
            case 2:
            System.out.println("Fetching previously saved game data");
            break;
            case 3:
            System.out.println("Game paused");
            break;
            case 4:
            System.out.println("Ending game");
            break;
            default:
            System.out.println("You did not enter a number from the menu!");
            System.out.println("-----------------------------------------");
            }
        }

//////////////////////////////////IGNORE! Not part of the assignment, just wanted to make it work like this///

///// Basicly does the same as the doAction function, it just takes the input and gives the answer in one go
////  and is also capable of calling itself and going again, incase you miss type.
//// basicly the same as the of the other tasks.

        public static void runDoAction(){   
        Scanner scan = new Scanner(System.in);
        
        if (scan.hasNextDouble()){
            int number = scan.nextInt();       
                if(number == 1 || number == 2 || number == 3 || number == 4){
                    switch(number){ 
                    case 1:
                    System.out.println("Starting the game now");
                    break;
                    case 2:
                    System.out.println("Fetching previously saved game data");
                    break;
                    case 3:
                    System.out.println("Game paused");
                    break;
                    case 4:
                    System.out.println("Ending game");
                    break;
                    }
                }else{
                System.out.println("You did not enter a number from the menu! try again!");
                System.out.println("----------------------------------------------------");
                runDoAction();  
                }
        }else{
            System.out.println("You did not enter a number from the menu! try again!");
            System.out.println("----------------------------------------------------");
            runDoAction();
        }

    }
///////////////////////////////////IGNORE!!//////////////////////////////////////////////////////////////////////

}