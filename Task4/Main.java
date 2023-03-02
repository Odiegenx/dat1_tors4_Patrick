import java.util.ArrayList;


	//// 4.e
	public class Main{

		public static void main(String[] args) {
			//// 4.f
			ArrayList<String> actions = new ArrayList<>();

			actions.add("1) Start game");
			actions.add("2) Resume game");
			actions.add("3) Pause game");
			actions.add("4) End Game");
			//// 4.g
			GameMenu actionChoices = new GameMenu(actions);
			
			System.out.println(actions+ " This was just a test");
			//// 4.i

			actionChoices.displayMenu();

		}


	}