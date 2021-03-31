class Foo {
	public static String classVar = "i class var";
	public String instanceVar = "i instance var";

	public static void classMethod() {
		System.out.println(classVar);
//		System.out.println(instanceVar); 에러
	}

	public void instanceMethod() {
		System.out.println(classVar);
		System.out.println(instanceVar);
	}
}

public class StaticApp {

	public static void main(String[] args) {
//		System.out.println(Foo.classVar);
////		System.out.println(Foo.instanceVar); 에러
//		
//		Foo.classMethod();
////		Foo.instanceMethod(); 에러

		Foo f1 = new Foo(); // 인스턴스(f1) 생성
		Foo f2 = new Foo(); // 인스턴스(f2) 생성

		System.out.println(f1.classVar);
		System.out.println(f1.instanceVar);

		f1.classVar = "changed by f1";
		System.out.println(Foo.classVar);
		System.out.println(f2.classVar);

		f1.instanceVar = "changed by f1";
		System.out.println(f1.instanceVar);
		System.out.println(f2.instanceVar);

	}

}
