package sample;

public class sample4_12 {
	
	public static void main(String[] args) {
	
		String[] array = { "A","B","C" };
		for(Object str : array) {
			str = "D";
		}
		
		for(Object str : array) {
			System.out.print(str);
		}
	}
}
