package com.demo;

public class Address
{
	private int pin;
	private String city;
	private String street;
	
//	public Address(int pin, String city, String street) {
//		super();
//		this.pin = pin;
//		this.city = city;
//		this.street = street;
//	}
	public Address()
	{
		
	}
	
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		System.out.println("setter");
		this.pin = pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + ", street=" + street + "]";
	}
	
	

}
