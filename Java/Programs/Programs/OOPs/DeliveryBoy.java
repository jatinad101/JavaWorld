package Programs.OOPs;

import java.util.Random;

public class DeliveryBoy {

	void deliver() {
		System.out.println("Delivering Item");
	}

	public static void main(String[] args) {
		DeliveryBoy db = getDeliveryBoy();
		db.deliver();
	}

	private static DeliveryBoy getDeliveryBoy() {
		Random rand = new Random();
		int num = rand.nextInt(10);
		return num % 2 == 0 ? new PizzaDeliveryBoy() : new Postman();
	}
}

class PizzaDeliveryBoy extends DeliveryBoy {

	@Override
	void deliver() {
		System.out.println("Delivering Pizza");
	}
}

class Postman extends DeliveryBoy {
	@Override
	void deliver() {
		System.out.println("Delivering Letters");
	}
}
