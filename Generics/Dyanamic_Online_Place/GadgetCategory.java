package Dyanamic_Online_Place;

public class GadgetCategory implements Category{
	private String type;
	public GadgetCategory(String type) {
		this.type=type;
	}
	@Override
	public String getCategory() {
		// TODO Auto-generated method stub
		return "Gadget "+type;
	}

}
