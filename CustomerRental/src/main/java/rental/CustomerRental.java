package rental;

import java.util.ArrayList;
import java.util.List;

public class CustomerRental {
	private String _name;
	private List<Rental> _rentals = new ArrayList<Rental>();

	public CustomerRental(String name) {
		_name = name;
	}

	public void addRental(Rental rental) {
		_rentals.add(rental);
	}

	public int totalRented() {
		return _rentals.size();
	}

	public String getName() {
		return _name;
	}

	public String statement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		String result = "Rental Record for " + getName() + "\n";
		for (Rental each : _rentals) {
			double thisAmount = getPrice(each);
//add frequent renter points
			frequentRenterPoints++;
//add bonus for a two-day new release rental
			if ((each.getMovie().getCategory() == Movie.NEW_RELEASE) && each.getDaysRented() > 1)
				frequentRenterPoints++;
//show figures for this rental
			result += each.getMovie().getTitle() + "\t" + thisAmount + "\n";
			totalAmount += thisAmount;
		} // end of loop
//add footer lines
		result += "Amount owed is " + totalAmount + "\n";
		result += "You earned " + frequentRenterPoints + " frequent renter points";
		return result;
	}// end of statement method

	private double getPrice(Rental rental) {
		double result = 0;
// determine amounts for each line
		switch (rental.getMovie().getCategory()) {
		case Movie.REGULAR:
			result += 2;
			if (rental.getDaysRented() > 2)
				result += (rental.getDaysRented() - 2) * 1.5;
			break;
		case Movie.NEW_RELEASE:
			result += rental.getDaysRented() * 3;
			break;
		case Movie.CHILDRENS:
			result += 1.5;
			if (rental.getDaysRented() > 3)
				result += (rental.getDaysRented() - 3) * 1.5;
			break;
		}// end-switch
		return result;
	}
} // end of CustomerRental class
