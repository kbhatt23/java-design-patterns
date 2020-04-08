package auctionBidExample;

public interface IBuyer {

	void addBid(double price);
	
	void setBidPrice(double price);
	
	double getBidPrice();
	
	//void finalize();
}
