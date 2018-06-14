import java.util.Random;
public class RandomValue {
	public int getRandomValue(int max) {
		Random random = new Random();
        return random.nextInt((max - 1) + 1) + 1;
	}
	public boolean checkValidDice(int diceSides) {
		if(diceSides == 2 || diceSides == 4 || diceSides == 6)
			return true;
		return false;
	}
	public int rollOut (int max) {
		switch(max) {
		   case 2 :
			  return this.getRandomValue(max);
		   case 4 :
			   return this.getRandomValue(max);
		   case 6 :
			   return this.getRandomValue(max);
		}
		return 0;
	}
}
