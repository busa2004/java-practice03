package prob2;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Goods[] goods = new Goods[COUNT_GOODS];
		for(int i = 0 ; i<COUNT_GOODS; i++) {
			goods[i] = new Goods(s.next(), s.nextInt(), s.nextInt());
		}
		
		for(int i = 0 ; i<COUNT_GOODS; i++) {
			System.out.println(goods[i]);
		}
	}
}
