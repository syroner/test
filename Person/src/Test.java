
public class Test {

	public static void main(String[] args){

		Person asimo =new Person();
		asimo.name="山田太郎";
		asimo.age=20;
		System.out.println(asimo.name);
		System.out.println(asimo.age);

		asimo.talk();
		asimo.walk();
		asimo.run();
	}



}