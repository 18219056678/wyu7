package day2.homework2;

public class Person {
	private String name;
	private int age;
	String gender;
	public Person(String name,int age,String gender) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		System.out.print("姓名："+name+"   ");
		System.out.print("年齡："+age+"   ");
		System.out.print("性別："+gender);
		System.out.println();
	}
	public Person(String name,int age) {
		this.name=name;
		this.age=age;		
		System.out.print("姓名："+name+"   ");
		System.out.print("年齡："+age+"   ");
		System.out.println();
	}
	
}
