package templateCars;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 킨다");
	}
	
	public void turnOff() {
		System.out.println("시동을 끊다");
	}
	
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
	

}
 