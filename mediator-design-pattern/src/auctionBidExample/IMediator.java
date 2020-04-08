package auctionBidExample;

public interface IMediator {
 
	 void addBuyers(IBuyer buyer);
	 
	 void addBidForUser(double price, IBuyer buyer);
	 
	 void finalizeAuction();
	 
	 
}
