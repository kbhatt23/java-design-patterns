package generalJavaConcepts;

import java.util.Date;

public class ImmutableClass {

	private final int number;
	private final String stringProperty;

	private final Integer integerProperty;
	private final FinalClassChild objectProperty;
	private final Date date;
	public ImmutableClass(int number, String stringProperty, Integer integerProperty, FinalClassChild objectProperty,
			Date date) {
		this.number = number;
		this.stringProperty = stringProperty;
		this.integerProperty = integerProperty;
		//should use either clone or create new copy
		//since we can not add impplment cloneable for all we are using new object creation
		//deep copy manualy, later on can move to clone function override
		
		FinalClassChild newObject = new FinalClassChild();
		newObject.setProperty1(objectProperty.getProperty1());
		this.objectProperty = newObject;
		this.date= new Date(date.getTime());
	}
	
	public int getNumber() {
		return number;
	}
	public String getStringProperty() {
		return stringProperty;
	}
	public Integer getIntegerProperty() {
		return integerProperty;
	}
	public FinalClassChild getObjectProperty() {
		//deep copy
		FinalClassChild newObject = new FinalClassChild();
		newObject.setProperty1(objectProperty.getProperty1());
		return newObject;
	}
	public Date getDate() {
		Date newDate =new Date(this.date.getTime());
		return newDate;
	}
	
}
