package atmDispenserExample;

import java.util.Scanner;

public class ATMClient {
	private CurrencyDispensor currencyDispensor;
	public ATMClient() {
		CurrencyDispensor dispensor1 = new Currency50Dispensor();
		CurrencyDispensor dispensor2 = new Currency10Dispensor();
		currencyDispensor = new Currency100Dispensor();
		currencyDispensor.setNextDispensor(dispensor1);
		dispensor1.setNextDispensor(dispensor2);
	}
	
	public CurrencyDispensor getCurrencyDispensor() {
		return currencyDispensor;
	}
	
	private void transfer(Currency currency ) {
		currencyDispensor.dispense(currency);
		//fake transaaction
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
public static void main(String[] args) {
		Currency currency = null;
		ATMClient atmClient = new ATMClient();
		//never ending loop to simulate ATM flow
		while(true) {
			System.out.println("Please enter amount to withraw");
			Scanner scanner = new Scanner(System.in);
			int currencyAmount = scanner.nextInt();
			//currnecy should be divisble by 10 atleast as 10 is the smallest currency note available
			if(currencyAmount % 10 != 0) {
				System.out.println("Please enter Valid Amount, Can Dispnse in 100s, 50s and 10s notes");
				//lets handle another user
				//fake transaaction
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				continue;
			}
			currency = new Currency(currencyAmount);
			atmClient.transfer(currency);
		}
		
		
	}



}
