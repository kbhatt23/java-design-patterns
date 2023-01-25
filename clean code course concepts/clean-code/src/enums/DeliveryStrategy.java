package enums;

public enum DeliveryStrategy {
	TYPE_STANDARD {
		@Override
		public void deliverProduct(String productId, String address) {
			System.out.println("standard delivery of product:" + productId + " to address:" + address);
		}

		@Override
		public void returnProduct(String productId, String address) {
			System.out.println("standard return of product:" + productId + " from address:" + address);
		}
	},
	TYPE_EXPRESS {
		@Override
		public void deliverProduct(String productId, String address) {
			System.out.println("express delivery of product:" + productId + " to address:" + address);
		}

		@Override
		public void returnProduct(String productId, String address) {
			System.out.println("express return of product:" + productId + " from address:" + address);
		}
	},
	TYPE_INSURED {
		@Override
		public void deliverProduct(String productId, String address) {
			System.out.println("insured delivery of product:" + productId + " to address:" + address);
		}

		@Override
		public void returnProduct(String productId, String address) {
			System.out.println("insured return of product:" + productId + " from address:" + address);
		}
	};

	public abstract void deliverProduct(String productId, String address);

	public abstract void returnProduct(String productId, String address);

}
