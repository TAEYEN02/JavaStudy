package CoffeeMain;

public class MenuItem {
    private String name;
    private double price;
	private String imagePath;

    public MenuItem(String name, int price,String imagePath) {
        this.name = name;
        this.price = price;
        this.imagePath = imagePath;
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
		return imagePath;
	}
    public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
}
