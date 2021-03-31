
public class ExceptionApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		int[] scores= {10, 20, 30};
		try {
		System.out.println(scores[3]);
		System.out.println(3);
		System.out.println(3/0);
		System.out.println(4);
		
		} catch(Exception e) {
			System.out.println("오류가 발생했습니다! "+e.getMessage());
			e.printStackTrace();
		}
		System.out.println(5);
	}

}
