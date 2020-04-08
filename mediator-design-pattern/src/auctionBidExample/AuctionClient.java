package auctionBidExample;

public class AuctionClient {
public static void main(String[] args) {
	IMediator auctionMediator = new AuctionMediator();
	IBuyer buyer1 = new BuyerImpl(auctionMediator, "ram");
	
	IBuyer buyer2 = new BuyerImpl(auctionMediator, "kanishk");
	
	IBuyer buyer3 = new BuyerImpl(auctionMediator, "rohan");
	
	IBuyer buyer4 = new BuyerImpl(auctionMediator, "sourabh");
	auctionMediator.addBuyers(buyer1);
	auctionMediator.addBuyers(buyer2);
	auctionMediator.addBuyers(buyer3);
	auctionMediator.addBuyers(buyer4);
	
	buyer1.addBid(23);
	buyer2.addBid(3);
	buyer3.addBid(11);
	buyer4.addBid(23);
	
	auctionMediator.finalizeAuction();
}
}
