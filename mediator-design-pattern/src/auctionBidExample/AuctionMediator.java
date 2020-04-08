package auctionBidExample;

import java.util.ArrayList;
import java.util.List;

public class AuctionMediator implements IMediator{

	private List<IBuyer> buyers = new ArrayList<IBuyer>();

	@Override
	public void addBuyers(IBuyer buyer) {
		System.out.println("adding buyer "+buyer+ "to auction");
		buyers.add(buyer);
	}

	@Override
	public void addBidForUser(double price, IBuyer buyer) {
		buyer.setBidPrice(price);
	}

	@Override
	public void finalizeAuction() {
		double highestPrice = 0;
		IBuyer buyerWinner =null;
		for(IBuyer buyer : buyers) {
			if(buyer.getBidPrice() > highestPrice) {
				highestPrice = buyer.getBidPrice();
				buyerWinner=buyer;
			}
		}
		
		System.out.println("Winner of event is "+buyerWinner);
	}
	
	
	
	
}
