package extra;

public class GenRanNum {
	public static int generateRandomNumber() {
		double randomDouble = Math.random()*10000;
		int random = (int) randomDouble;
		return random;
	}
}
