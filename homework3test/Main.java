package day2.homework3test;

import day2.homework3.Phone;

public class Main {
public static void main(String[] args) {
	Phone a=new Phone();
	a.setScreenSize(18);
	a.setBrand("��Ϊ");
	a.setCpu("����910");
	a.setMemory(128);
	System.out.println("��Ļ�ߴ磺"+a.getScreenSize()+"��");
	System.out.println("�ֻ�Ʒ�ƣ�"+a.getBrand());
	System.out.println("��������"+a.getCpu());
	System.out.println("�ڴ棺"+a.getMemory()+"G");
}
}
