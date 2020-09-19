package day2.homework;

public class VehicleMain {
	public static void main(String[] args) {
			Vehicle a=new Vehicle();
			a.setSpeed(80);
			a.setSize(3.5);
			a.getSize();
			a.getSpeed();
			System.out.println("車的體積為"+a.size+"噸");
			System.out.println("車的速度為"+a.speed+"km/s");
			if(a.speed>70) {
				a.speeddown();
			}else {
				a.speedup();
			}
	}
}
