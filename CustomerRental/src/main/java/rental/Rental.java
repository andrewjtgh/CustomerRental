package rental;

public class Rental {
	private Movie _movie;
	private int _daysRented;

	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}
// ... Getters and Setters

	public Movie getMovie() {
		// TODO Auto-generated method stub
		return _movie;
	}

	public int getDaysRented() {
		// TODO Auto-generated method stub
		return _daysRented;
	}

	public double getPrice() {
		double price = 0;
// determine amounts for each line
		switch (getMovie().getCategory()) {
		case Movie.REGULAR:
			price += 2;
			if (getDaysRented() > 2)
				price += (getDaysRented() - 2) * 1.5;
			break;
		case Movie.NEW_RELEASE:
			price += getDaysRented() * 3;
			break;
		case Movie.CHILDRENS:
			price += 1.5;
			if (getDaysRented() > 3)
				price += (getDaysRented() - 3) * 1.5;
			break;
		}// end-switch
		return price;
	}
}