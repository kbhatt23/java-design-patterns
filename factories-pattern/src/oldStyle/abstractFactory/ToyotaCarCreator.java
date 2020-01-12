package oldStyle.abstractFactory;

import oldStyle.bean.Car;
import oldStyle.bean.Toyota;

public class ToyotaCarCreator implements CarAbstractFactory{

	@Override
	public Car createCar() {
		return new Toyota();
	}

}
