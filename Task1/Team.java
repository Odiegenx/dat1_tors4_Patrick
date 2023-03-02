import java.util.ArrayList;

//// 1.b
	public class Team{
			//// 1.c/1.d
			private String teamName;
			private int teamRank;
			//// 1.e
			private ArrayList<String> group = new ArrayList<>();
		
			//// 1.f
			//// The constuctor
		public Team(String teamName_){
		this.teamName = teamName_;


			}

			//// 1.h
			public void setRank(int input_){
				this.teamRank = input_;
			}

			//// 1.j
			@Override
			public String toString(){
			String s =	"Hold: " + this.teamName + " Rank: " + this.teamRank;
			return s;
	}
	
}