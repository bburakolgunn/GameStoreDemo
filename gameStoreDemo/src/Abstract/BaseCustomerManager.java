package Abstract;

import SalesManager.ISales;
import gameShop.Players;

public class BaseCustomerManager extends playerInformation  implements ICustomerService,IEntity,ISales{
	
	@SuppressWarnings("unused")
	@Override
	public void save(Players players) {
		// TODO Auto-generated method stub
		
		Players[] players2 = {playeradd1(players),playeradd2(players),playeradd3(players)};
		for(Players players3 : players2) {
			System.out.println("Sisteme kayıtlı olan oyuncu " + players3.getFirstName());
		}
		
		
		}

	

	

	@Override
	public void update(Players players) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void del(Players players) {
		// TODO Auto-generated method stub
		
	}

	
	

}
