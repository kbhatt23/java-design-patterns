package oldStyle.bean.factory;

import oldStyle.bean.Car;
import oldStyle.bean.Hyundai;
import oldStyle.bean.Toyota;

public class CarFactory {

	public static Car createCar(String type) {
		if(CarType.HYUNDAI_TYPE.equals(type)) {
			return new Hyundai();
		}else if(CarType.TOYOTA_TYPE.equals(type)) {
			return new Toyota();
		}else {
			throw new RuntimeException("We do not support this type of car");
		}
	}
}
