package Abstract;

import gameShop.Players;

public interface ICustomerService {

	void save(Players players);
	
	void update(Players players);
	
	void del(Players players);
	
}