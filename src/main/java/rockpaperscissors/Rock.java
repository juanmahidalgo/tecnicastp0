package rockpaperscissors;

import rockpaperscissors.Paper;
import rockpaperscissors.Scissors;

public class Rock {

	public Rock(){
	
	}
	public Object vs(Scissors scissors){
		return this;
	}
	public Object vs(Paper paper){
		return paper;
	}
	public Object vs(Rock rock){
		return this;
	}
}

