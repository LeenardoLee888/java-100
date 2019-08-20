public class PrintVriable{
	public static void main(String[] args){
		byte b1 = 1;
		System.out.println(b1);
		short s1 = 200;
		System.out.println(s1);
		int i1 = 40000;
		System.out.println(i1);
		long l1 = 600000000000L;//由于此整数超过了int整数的范围，那么必须使用long并且加上“L”
		System.out.println(l1);
		float f1 = 3.1415F;//小数默认是double类型，如果想定义float类的小数，那么必须加上F或f
		System.out.println(f1);
		double d1 = 3.1415;
		System.out.println(d1);
		char ch1 = ',';
		System.out.println(ch1);
		boolean b2 = true;
		System.out.println(b2);
		String name = "shfkjs";
		System.out.println(name);
	}
}