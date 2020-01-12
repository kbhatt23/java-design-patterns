package oldStyle;

import oldStyle.abstractFactory.AbstractFactoryCarCreator;
import oldStyle.abstractFactory.HyundaiCreator;
import oldStyle.abstractFactory.ToyotaCarCreator;
import oldStyle.bean.Car;
import oldStyle.bean.factory.CarFactory;
import oldStyle.bean.factory.CarType;

public class CarClient {
public static void main(String[] args) {
	Car hyundai = CarFactory.createCar(CarType.HYUNDAI_TYPE);
	System.out.println("first type "+hyundai.getClass().getName());
	
	Car toyota = CarFactory.createCar(CarType.TOYOTA_TYPE);
	System.out.println("second type "+toyota.getClass().getName());
	
	System.out.println("abstract factory way starts");
	
	Car hyundaiAbstract = AbstractFactoryCarCreator.createCar(new HyundaiCreator());
	
	Car toyotaAbstract = AbstractFactoryCarCreator.createCar(new ToyotaCarCreator());
	System.out.println("first type "+hyundaiAbstract.getClass().getName());
	System.out.println("second type "+toyotaAbstract.getClass().getName());
	
}
}
