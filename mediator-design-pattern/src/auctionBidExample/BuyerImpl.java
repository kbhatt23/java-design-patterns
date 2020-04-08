package auctionBidExample;

public class BuyerImpl implements IBuyer{
	//complex object interating should have mediator
	//instead of multiple instance injected here
	private double bidPrice;
	private IMediator auctionMediator;
	private String name;
	
	public BuyerImpl(IMediator auctionMediator , String name) {
		this.auctionMediator = auctionMediator;
		this.name=name;
	}

	@Override
	public void addBid(double price) {
		//adding bid foir user using mediator
		System.out.println("Buyer "+name+ " bidding with price "+price);
		auctionMediator.addBidForUser(price, this);
	}
	@Override
	public double getBidPrice() {
		return bidPrice;
	}
	@Override
	public void setBidPrice(double bidPrice) {
		this.bidPrice = bidPrice;
	}

	@Override
	public String toString() {
		return "BuyerImpl [bidPrice=" + bidPrice + ", name=" + name + "]";
	}

	

}
