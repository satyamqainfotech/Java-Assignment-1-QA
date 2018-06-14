import java.util.Scanner;
public class DiceToss {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many times you roll a dice");
		int numberOfRolls = sc.nextInt();
		while(numberOfRolls != 0) {
			System.out.println("Enter the total no of your dice sides");
			int diceSides = sc.nextInt();
			RandomValue dice = new RandomValue();
			if(dice.checkValidDice(diceSides)) {
				int value = dice.rollOut(diceSides);
				System.out.println("The no cameout is " + value);
			}
			else
				System.out.println("Dice is not valid retry");
			numberOfRolls-- ;
		}
		
	}
}
