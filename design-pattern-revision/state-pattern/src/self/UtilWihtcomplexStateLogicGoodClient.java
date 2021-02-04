package self;

public class UtilWihtcomplexStateLogicGoodClient {
	public static void main(String[] args) {
		StateToUse stateToUSe=  StateToUse.THREE;
		startStateLogic(stateToUSe);

	}

	private static void startStateLogic(StateToUse stateToUSe) {
		ComplexState state = stateToUSe.findState();
		
		UtilWihtcomplexStateLogicFix util = new UtilWihtcomplexStateLogicFix(state);
		util.manipulate();
	}

	private enum StateToUse {
		ONE {
			@Override
			public ComplexState findState() {
				return new StateOneLogic();
			}
		},
		TWO {
			@Override
			public ComplexState findState() {
				return new StateTwoLogic();
			}
		},
		THREE {
			@Override
			public ComplexState findState() {
				return new StateThreeLogic();
			}
		};

		public abstract ComplexState findState();
	}
}
