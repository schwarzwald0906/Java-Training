package sample;

public class Sample5_8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[][] array = {{"A","B"},null,{"C","D","E"}};
		int total = 0;
		for(String[] tmp : array) {
			total += tmp.length;
		}
		System.out.print(total);
	}

}
