package shoppingmall;

public class ShoppingMallDemo {

	public static void main(String[] args) {
		Shopping s= new Cloths();
		s.purchase();
		s= new Electronics();
		s.purchase();

	}

}