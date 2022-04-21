package sample;

public class sample2_6 {
	public static void main(String[] args) {
		String str = "hoge, world.";
		str = hello(str);
		System.out.println(str);
	}
	private static String hello(String msg) {
		String i = msg.replaceAll("hoge","hello");
		return i;
	}
}
