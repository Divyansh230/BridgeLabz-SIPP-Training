package Dyanamic_Online_Place;

public class ClothingCategory implements Category{
	private String type;
	
	public ClothingCategory() {
		this.type=type;
	}

	@Override
	public String getCategory() {
		// TODO Auto-generated method stub
		return "Clothing "+type;
	}
}
