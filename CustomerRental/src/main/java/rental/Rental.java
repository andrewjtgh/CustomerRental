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
}