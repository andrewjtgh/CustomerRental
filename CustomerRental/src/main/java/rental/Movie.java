package rental;

public class Movie {
	public static final int REGULAR = 0;
	public static final int CHILDRENS = 1;
	public static final int NEW_RELEASE = 2;
	private String _title;
	private int _categoryCode;

	public Movie(String title, int categoryCode) {
		_title = title;
		_categoryCode = categoryCode;
	}
// ... Getters and Setters	
	public int getCategory() {
		// TODO Auto-generated method stub
		return _categoryCode;
	}
	public String getTitle() {
		// TODO Auto-generated method stub
		return _title;
	}

}