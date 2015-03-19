package rockpaperscissors;

import rockpaperscissors.Paper;
import rockpaperscissors.Rock;
import rockpaperscissors.Scissors;

public class Scissors {

	public Scissors(){
	
	}
	public Object vs(Paper paper){
		return this;
	}
	public Object vs(Rock rock){
		return rock;
	}
	public Object vs(Scissors scissors){
		return this;
	}
	
}
