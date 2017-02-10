// This program generates number randomly between 0 - 9
public class randomNumGenerator{
	public static void main(String[] args){
		double randomNum = Math.random();
		randomNum *= 10;
		int randomInt = (int)randomNum;
		System.out.println("The random number from 0-9 is "
			+ randomInt);
	}
}