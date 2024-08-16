
public class Pizza {
	private int price;
	private Boolean veg;
	private int extraCheesePrice = 100;
	private int extraToppingsPrice = 150;
	private int bagPackPrice = 20;
	private int basePizzaPrice;
	private boolean isExtraCheeseAdded = false;
	private boolean isExtraToppingsAdded = false;
	private boolean isOptedForTakeAway = false;

	public Pizza(Boolean veg) {
		super();
		this.veg = veg;
		if (this.veg) {
			this.price = 300;
		} else {
			this.price = 400;
		}
		basePizzaPrice = this.price;
	}

	public void addExtraCheese() {
		isExtraCheeseAdded = true;
		// System.out.println("Extra cheese added ");
		this.price += extraCheesePrice;
	}

	public void addExtraToppings() {
		isExtraToppingsAdded = true;
		// System.out.println("Extra toppings added ");
		this.price += extraToppingsPrice;
	}

	public void takeAway() {
		isOptedForTakeAway = true;
		// System.out.println("Take away opted ");
		this.price += bagPackPrice;
	}

	public void getBill() {
		String bill = "";
		System.out.println("Pizza: " + basePizzaPrice);
		if (isExtraCheeseAdded) {
			bill += "Extra Cheese added: " + extraCheesePrice + "\n";
		}
		if (isExtraToppingsAdded) {
			bill += "Extra Toppings added: " + extraToppingsPrice + "\n";
		}
		if (isOptedForTakeAway) {
			bill += "Take away: " + bagPackPrice + "\n";
		}
		bill += "Bill: " + this.price + "\n";
		System.out.println(bill);
	}
}
