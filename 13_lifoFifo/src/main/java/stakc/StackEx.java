package stakc;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<Coin> coinBox=new Stack<Coin>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		System.out.println("처음크기: "+coinBox.size());
		int sum =0;
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println(coinBox.size());
			sum +=coin.getValue();
			System.out.println("꺼내온 동전: "+coin.getValue()+"원");
		}
		System.out.println("꺼내온 동전: "+sum+"원");
	}

}
