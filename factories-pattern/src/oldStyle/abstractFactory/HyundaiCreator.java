package oldStyle.abstractFactory;

import org.w3c.dom.views.AbstractView;

import oldStyle.bean.Car;
import oldStyle.bean.Hyundai;

public class HyundaiCreator implements CarAbstractFactory{

	@Override
	public Car createCar() {
		return new Hyundai();
	}

}
