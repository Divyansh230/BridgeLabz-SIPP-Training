package Dyanamic_Online_Place;

public class BookCategory implements Category{
	private String type;
	
	public BookCategory(String type) {
		this.type=type;
	}

	@Override
	public String getCategory() {
		// TODO Auto-generated method stub
		return "Book "+type;
	}
}
