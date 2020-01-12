package oldStyle.abstractFactory;

import oldStyle.bean.Car;
//this adds single reposibility as each car creator class will be used 
//and only one class will be needed to change and no need to test other
//this adds open closed principle
//this adds liskov substitution principle
//this adds interface segregration principle
//this adds dependecny inversion priniciple
public class AbstractFactoryCarCreator {

	public static Car createCar(CarAbstractFactory carAbstractFactory) {
		
		return carAbstractFactory.createCar();
	}
}
