package rental;

public class ChildrenRentalPriceComputer implements IRentalPriceComputer {

	@Override
	public double computePrice(int daysRented) {
		double price = 1.5;
		if (daysRented > 3)
			price += (daysRented - 3) * 1.5;
		return price;
	}

}
