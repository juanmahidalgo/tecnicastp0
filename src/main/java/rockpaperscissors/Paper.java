package rockpaperscissors;

import rockpaperscissors.Paper;
import rockpaperscissors.Rock;
import rockpaperscissors.Scissors;

public class Paper {

	public Paper(){
	
	}
	public Object vs(Rock rock){
		return this;
	}
	public Object vs(Scissors scissors){
		return scissors;
	}
	public Object vs(Paper paper){
		return this;
	}
}