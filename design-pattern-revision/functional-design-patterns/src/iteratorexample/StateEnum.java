package iteratorexample;

import java.util.Iterator;

//each item will be instance of StateEnum
public enum StateEnum implements Iterable<StateEnum>{

	INITIAL,NEW,PAID,SHIPPED,COMPLETE;
	
	@Override
	public Iterator<StateEnum> iterator() {
		//return new instance eveytime
		//for one istnace state is saved but not for another instance
		return new StateEnumIterator();
	}

	private static class StateEnumIterator implements Iterator<StateEnum>{

		private int index=0;
		private static final StateEnum[] enums = StateEnum.values();
		
		@Override
		public boolean hasNext() {
			return index < enums.length;
		}

		@Override
		public StateEnum next() {
			return enums[index++];
		}
		
	}

}
