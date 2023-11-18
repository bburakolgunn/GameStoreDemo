package gameShop;

import Abstract.BaseCustomerManager;
import Games.GameCustomerManager;
import SalesManager.sales;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	@SuppressWarnings("unused")
	BaseCustomerManager baseCustomerManager = new BaseCustomerManager();
     baseCustomerManager.save(null);
		
	GameCustomerManager gameCustomerManager = new GameCustomerManager();
	gameCustomerManager.savegame(null);
	
	sales sales = new sales();
	sales.satis1(sales);
	
	}
		
	
}
