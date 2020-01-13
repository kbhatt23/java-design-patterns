package multiton;

public class PrinterMultitonClient {
public static void main(String[] args) {
	
	PrinterMultitonClass printerFirst = PrinterMultitonClass.get(Floor.FIRST);
	PrinterMultitonClass printerSecond = PrinterMultitonClass.get(Floor.SECOND);
	
	PrinterMultitonClass printerThird = PrinterMultitonClass.get(Floor.THIRD);
	PrinterMultitonClass printerFirstAgain = PrinterMultitonClass.get(Floor.FIRST);
	PrinterMultitonClass printerThirdAgain = PrinterMultitonClass.get(Floor.THIRD);
	
	System.out.println(printerFirst == printerFirstAgain);
	System.out.println(printerThirdAgain == printerThird);
} 
}
