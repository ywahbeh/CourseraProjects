package Examples;


import java.time.LocalDate;
import java.time.Period;

import static java.lang.Math.min;

public class Car {
	
	public Car() {}
	public Car(String name)
	{
		this(name, 0, 0, false);
	}
	
	public Car(String name, int speed, int fuel, boolean running)
	{
		setName(name);
		setSpeed(speed);
		setGasoline(fuel);
		setEngineState(running);
	}
	
	public static final int MAX_SPEED = 100;
	
	
	/*
	 public void setTirePressure(int[] pressures)
	 {
	 
	 }
	 */
	
	public void setTirePressure(int ... pressures)
	{
		
	}
	
	private String name;
	
	private int speed;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}
	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int newSpeed) {
		speed = min(newSpeed, MAX_SPEED);
	}
	
	private int gasoline;
	private boolean engineState;

	/**
	 * @return the gasoline
	 */
	public int getGasoline() {
		return gasoline;
	}
	/**
	 * @param gasoline the gasoline to set
	 */
	public void setGasoline(int gasoline) {
		this.gasoline = gasoline;
	}
	/**
	 * @return the engineState
	 */
	public boolean isEngineState() {
		return engineState;
	}
	/**
	 * @param engineState the engineState to set
	 */
	public void setEngineState(boolean engineState) {
		this.engineState = engineState;
	}
	
	private LocalDate manufactured;

	/**
	 * @return the manufactured
	 */
	public LocalDate getManufactured() {
		return manufactured;
	}
	/**
	 * @param manufactured the manufactured to set
	 */
	public void setManufactured(LocalDate manufactured) {
		this.manufactured = manufactured;
	}
	
	public int getAge() {
		return Period.between(getManufactured(),  LocalDate.now()).getYears();
	}
	
	
	public static void main(String[] args) {
		
	Car car54 = new Car();
	
	car54.setName("Car 54");
	car54.setSpeed(20);
	car54.setGasoline(20);
	car54.setManufactured(LocalDate.of(1961, 9, 17));
	
	Car mach5 = new Car("Mach V", 250, 21, true);
	mach5.setManufactured(LocalDate.of(1967, 4, 2));
	
	for(Car car: new Car[] {car54, mach5}) {
		System.out.printf("%s is %d years old and is travelling at %d mph%n", 
		car.getName(), car.getAge(), car.getSpeed());
	}
		
		
	}
	
	
	
}
	
	
	

