class Accounting{
	// 공급가액
	public double valueOfSupply;
	// 부가가치세율
	public static double varRate = 0.1;
	
	// 생성자
	public Accounting(double valueOfSupply) {
		this.valueOfSupply=valueOfSupply;
	}
	
	// 부가가치세를 구하는 메소드
	public double getVAT() {
		return (valueOfSupply * varRate);
	}
	
	// 합계를 구하는 메소드
	public double getTotal() {
		return (valueOfSupply + getVAT());
	}
}

public class AccoutingApp {

	public static void main(String[] args) {
		
		Accounting a1=new Accounting(10000.0);
		
		Accounting a2=new Accounting(20000.0);
		
		System.out.println("Value of Supply: " + a1.valueOfSupply);
		System.out.println("Value of Supply: " + a2.valueOfSupply);
		
		System.out.println("VAT: " + a1.getVAT());
		System.out.println("VAT: " + a2.getVAT());
		
		System.out.println("Total: " + a1.getTotal());
		System.out.println("Total: " + a2.getTotal());

	}

}
