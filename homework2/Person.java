package day2.homework2;

public class Person {
	private String name;
	private int age;
	String gender;
	public Person(String name,int age,String gender) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		System.out.print("������"+name+"   ");
		System.out.print("���g��"+age+"   ");
		System.out.print("�Ԅe��"+gender);
		System.out.println();
	}
	public Person(String name,int age) {
		this.name=name;
		this.age=age;		
		System.out.print("������"+name+"   ");
		System.out.print("���g��"+age+"   ");
		System.out.println();
	}
	
}
