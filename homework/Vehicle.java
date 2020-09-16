package day2.homework;

public class Vehicle {
	double speed;
	double size;
	public void speedup() {
		System.out.println("¼ÓËÙ");
	}
	public void speeddown() {
		System.out.println("¼õËÙ");
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
}
