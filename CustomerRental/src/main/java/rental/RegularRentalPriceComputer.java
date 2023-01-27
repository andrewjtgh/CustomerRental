package rental;

public class RegularRentalPriceComputer implements IRentalPriceComputer {

	@Override
	public double computePrice(int daysRented) {
		double price = 2;
		if (daysRented > 2)
			price += (daysRented - 2) * 1.5;
		return price;
	}

}
