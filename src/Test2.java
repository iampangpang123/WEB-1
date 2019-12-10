
public class Test2 {

	public static void main(String[] args) {
		Test2 test2 = new Test2();
		Person p = new Person("张三");
		//test2.A(p, 1);
		 test2.A(new Person("张三"),1);
	}

	public void A(Person p, int a) {
		System.out.println(p + "   " + a);
		 b(p,a);
		 c(p, a);
	}

	void b(Person p, int a) {
		p=new Person("李四");
		//p.setName("李四");	
		a = 0;
		System.out.println(p + "   " + a);
	}

	void c(Person p, int a) {
		System.out.println(p + "   " + a);
	}
}

class Person {

	String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

}
