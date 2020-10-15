package MeMe;
import java.util.ArrayList;

public class TestGame {

	public static void main(String[] args) {
		ArrayList<Game> gameArr= new ArrayList<Game>();
		gameArr.add(new Battleground());
		gameArr.add(new Overwatch());
		gameArr.add(new LOL());
		for (Game game : gameArr) {
			game.CheckPay(game.monthlyPayment);	
		}
		for (Game game : gameArr) {
			if(game instanceof LOL) {
				System.out.println("이 게임의 원형은 협곡이다");
				LOL lol = (LOL)game;
			}
			else if(game instanceof Battleground) {
				Battleground bg = (Battleground)game;
				System.out.println("이것은 배그였다");
			}
			else if(game instanceof Overwatch) {
				Overwatch bg = (Overwatch)game;
				System.out.print("고");
				for(int i=0;i<100;i++) {
					System.out.print("오");
				}
				System.out.println("급 시계였던 것");
			}
		}
	}

}
