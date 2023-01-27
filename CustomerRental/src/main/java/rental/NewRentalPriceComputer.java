package rental;

public class NewRentalPriceComputer implements IRentalPriceComputer {

	@Override
	public double computePrice(int daysRented) {
		return daysRented * 3;
	}

}
