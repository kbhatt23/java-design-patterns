package iteratorexample;

import java.lang.Thread.State;
import java.util.Iterator;
import java.util.function.Consumer;

public class EnumIterableClient {
	public static void main(String[] args) {
		Consumer<StateEnum> printEnums = enumeration -> System.out.println(enumeration);
		FunctionalIterable.iterate(printEnums, StateEnum.COMPLETE);
		
//		StateEnum enumeration = StateEnum
//				.COMPLETE;
//		Iterator<StateEnum> iterator = enumeration.iterator();
//		while(iterator.hasNext()) {
//			System.out.println("entry found "+iterator.next());
//		}
		
		for(StateEnum sample:StateEnum.COMPLETE) {
			System.out.println("foeach style element "+sample);
		}
		Consumer<StateEnum> printEnumsJava8 = enumeration -> System.out.println("java 8 style element "+enumeration);
		FunctionalIterable.iterateWitghJava8(printEnumsJava8, StateEnum.COMPLETE);
		
	}
}
