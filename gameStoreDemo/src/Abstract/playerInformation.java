package Abstract;

import Games.gameNames;
import gameShop.Players;

@SuppressWarnings("unused")
public class playerInformation extends gameNames {
	
	public Players playeradd1(Players players) {
		
		Players player1 = new Players(1, "Burak", "Olgun", 1995, "aaa@gmail.com",
				"Turkey", "Baltimore");
		return player1;
		}
	
	public Players playeradd2(Players players) {
		
		Players player2 = new Players(2, "Donald", "Trump", 1885, "bbb@gmail.com",
				"USA", "Texas");
		return player2;
	
		}

	public Players playeradd3(Players players) {
	
	Players player3 = new Players(3, "Joe", "Biden", 1775, "zzz@gmail.com",
			"Mexico", "Sivas");
	return player3;
	}

}
