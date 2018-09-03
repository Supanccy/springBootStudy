
public class Test {

	public static void main(String[] args) {
		
		boolean a = true;
		boolean b = false;
		//都可以作为逻辑与进行运算
		System.out.println(a&b);
		System.out.println(a&&b);
		
		Integer c = null;
		Integer d = 4;
		
		System.out.println(d.toString().equals("3") && c.toString().equals("2"));
		System.out.println(d.toString().equals("3") & c.toString().equals("2"));
		

	}

}
