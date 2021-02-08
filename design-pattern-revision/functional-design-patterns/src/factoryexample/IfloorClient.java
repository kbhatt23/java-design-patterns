package factoryexample;

import java.util.function.Supplier;

public class IfloorClient {
	public static void main(String[] args) {

		//non lazy one creates the object even when not in need
		//eg
		IFloor wooden = IFloor.create(IFloor.WOODEN);
		
		//not using wooden methods still object gor created in heap
		//wooden.moff();
		
		System.out.println("lazy deal started");
		//lazy means untill we call get method to call actual method object wont be created in heap
		Supplier<IFloor> woodenLazySupplier = IFloor.createLazily(IFloor.WOODEN);
		
		//untill we all get it wont actually create instance
		IFloor iFloor = woodenLazySupplier.get();
		iFloor.moff();
	}
}
