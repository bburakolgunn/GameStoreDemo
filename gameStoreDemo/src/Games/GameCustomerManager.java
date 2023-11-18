package Games;



import gameShop.gameStudio;

public class GameCustomerManager extends gameNames implements IgameService{

	@Override
	public void savegame(gameStudio GameStudio) {
		// TODO Auto-generated method stub
		
		gameStudio[] gameStudios = {gameAdd1(GameStudio),gameAdd2(GameStudio),gameAdd3(GameStudio)};
		for(gameStudio gameStudio2 : gameStudios) {
			System.out.println("Sisteme kayıtlı olan oyunlar :" + gameStudio2.getName() );
		}
	}

	@Override
	public void updategame(gameStudio GameStudio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delgame(gameStudio GameStudio) {
		// TODO Auto-generated method stub
		
	}
	
	

}