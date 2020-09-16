package day2.homework3test;

import day2.homework3.Phone;

public class Main {
public static void main(String[] args) {
	Phone a=new Phone();
	a.setScreenSize(18);
	a.setBrand("华为");
	a.setCpu("麒麟910");
	a.setMemory(128);
	System.out.println("屏幕尺寸："+a.getScreenSize()+"寸");
	System.out.println("手机品牌："+a.getBrand());
	System.out.println("处理器："+a.getCpu());
	System.out.println("内存："+a.getMemory()+"G");
}
}
