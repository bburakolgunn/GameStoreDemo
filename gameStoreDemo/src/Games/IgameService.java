package Games;

import gameShop.gameStudio;

public interface IgameService {

	void savegame(gameStudio GameStudio);
	
	void updategame(gameStudio GameStudio);
	
	void delgame(gameStudio GameStudio);
	
}