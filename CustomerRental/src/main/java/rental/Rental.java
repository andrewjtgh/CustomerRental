package rental;

public class Rental {
	private Movie _movie;
	private int _daysRented;
	private IRentalPriceComputer _rentalPriceComputer;

	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
		setRentalPriceComputer(_movie.getCategory());
	}
// ... Getters and Setters

	public Movie getMovie() {
		// TODO Auto-generated method stub
		return _movie;
	}

	private void setRentalPriceComputer(int category) {
		switch (category) {
		case Movie.REGULAR:
			_rentalPriceComputer = new RegularRentalPriceComputer();
			break;
		case Movie.CHILDRENS:
			_rentalPriceComputer = new ChildrenRentalPriceComputer();
			break;
		case Movie.NEW_RELEASE:
			_rentalPriceComputer = new NewRentalPriceComputer();
		}
	}

	public int getDaysRented() {
		// TODO Auto-generated method stub
		return _daysRented;
	}

	public double getPrice() {
//		double price = 0;
//// determine amounts for each line
//		switch (getMovie().getCategory()) {
//		case Movie.REGULAR:
//			price += 2;
//			if (getDaysRented() > 2)
//				price += (getDaysRented() - 2) * 1.5;
//			break;
//		case Movie.NEW_RELEASE:
//			price += getDaysRented() * 3;
//			break;
//		case Movie.CHILDRENS:
//			price += 1.5;
//			if (getDaysRented() > 3)
//				price += (getDaysRented() - 3) * 1.5;
//			break;
//		}// end-switch
//		return price;
		return _rentalPriceComputer.computePrice(_daysRented);
	}
}