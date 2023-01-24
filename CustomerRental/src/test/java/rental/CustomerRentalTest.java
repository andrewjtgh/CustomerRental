package rental;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CustomerRentalTest {
	private final String CUSTOMER_NAME = "Alex Tan";
	private final String REGULAR_MOVIE_NAME = "It's A Wonderful Life";
	private final String CHILDREN_MOVIE_NAME = "Peter Pan";
	private final String NEW_RELEASE_MOVIE_NAME = "The New Batman Movie";

	public Rental createRental(int days, int categoryCode) {
		return new Rental(new Movie(getMovieName(categoryCode), categoryCode), days);
	}

	private String getMovieName(int categoryCode) {
		// TODO Auto-generated method stub
		switch(categoryCode) {
		case 0:
			return "It's A Wonderful Life";
		case 1:
			return "Peter Pan";
		case 2:
			return "The New Batman Movie";
		}
		return null;
	}
	
	@Test
	public void renting_2_days_regular_statement() {
		CustomerRental cr = new CustomerRental(CUSTOMER_NAME);
		cr.addRental(createRental(2, Movie.REGULAR));
		String expexted = "Rental Record for " + CUSTOMER_NAME + "\n" + REGULAR_MOVIE_NAME + "\t" + 2.0 + "\n"
				+ "Amount owed is " + 2.0 + "\n" + "You earned " + 1 + " frequent renter points";
		assertEquals(expexted, cr.statement());
	}

	@Test
	public void renting_3_days_regular_statement() {
		CustomerRental cr = new CustomerRental(CUSTOMER_NAME);
		cr.addRental(createRental(3, Movie.REGULAR));
		String expexted = "Rental Record for " + CUSTOMER_NAME + "\n" + REGULAR_MOVIE_NAME + "\t" + 3.5 + "\n"
				+ "Amount owed is " + 3.5 + "\n" + "You earned " + 1 + " frequent renter points";
		assertEquals(expexted, cr.statement());
	}

	@Test
	public void renting_3_days_children_statement() {
		CustomerRental cr = new CustomerRental(CUSTOMER_NAME);
		cr.addRental(createRental(3, Movie.CHILDRENS));
		String expexted = "Rental Record for " + CUSTOMER_NAME + "\n" + CHILDREN_MOVIE_NAME + "\t" + 1.5 + "\n"
				+ "Amount owed is " + 1.5 + "\n" + "You earned " + 1 + " frequent renter points";
		assertEquals(expexted, cr.statement());
	}
//... Many more test cases
}