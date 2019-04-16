package page1_100.jicheng;

public class Student extends Person {
	int a = 2;
	int b=3;

	private static void show(){
		System.out.println("pppppppppp");
	}
	public  void show1(){
		System.out.println("show1");
	    System.out.println(super.a);
	    System.out.println(this.a);
		show2();
		
	}
	public void show2(){
		System.out.println("show2");
	}
public static void main(String[] args) {
	Person p=new Student();
	Student s=new Student();

	s.show1();
	
}
}
