package day2.homework;

public class VehicleMain {
	public static void main(String[] args) {
			Vehicle a=new Vehicle();
			a.setSpeed(80);
			a.setSize(3.5);
			a.getSize();
			a.getSpeed();
			System.out.println("܇���w�e��"+a.size+"��");
			System.out.println("܇���ٶȞ�"+a.speed+"km/s");
			if(a.speed>70) {
				a.speeddown();
			}else {
				a.speedup();
			}
	}
}
