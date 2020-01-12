package serializableProptotype;

import java.io.Serializable;

public class Address implements Serializable{
	private String city;
	private int pinCode;
	private String address;
	public Address(String city, int pinCode, String address) {
		this.city = city;
		this.pinCode = pinCode;
		this.address = address;
	}
	public Address(Address address) {
		this(address.getCity(), address.getPinCode(), address.getAddress());
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", pinCode=" + pinCode + ", address=" + address + "]";
	}

}
