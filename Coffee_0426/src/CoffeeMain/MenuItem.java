package CoffeeMain;

public class MenuItem {
    private String name;
    private double price;
    private String image;

    public MenuItem(String name, int price, String image) {
        this.name = name;
        this.price = price;
        this.image = image;
    }

    public String getName() {
		return name;
	}
    public void setName(String name) {
		this.name = name;
	}
    public int getPrice() {
		return (int) price;
	}
    public void setPrice(int price) {
		this.price = price;
	}
    
    public String getImagePath() {
		return image;
	}
    
    public void setImage(String image) {
		this.image = image;
	}
}
