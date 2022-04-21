package sample2;

public class sample5_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Item[] items = new Item[3];
		int total = 0;
		for (int i = 0;i < items.length; i++) {
			total += items[i].price;
		}
		System.out.print(total);
		
	}
}
