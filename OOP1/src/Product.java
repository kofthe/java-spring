
public class Product {
	private String name; 
	private String unitPrice; 
	private String discountRate;
	private String imageUrl; 
	private String[] imageUrls; //bir çok resim olabilir. private sadece o classsın içerisinde kullanılabilir demek. sadece o classa özel demektir. 
	int UnitsInStock;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(String string) {
		this.unitPrice = string;
	}
	public String getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(String discountRate) {
		this.discountRate = discountRate;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String[] getImageUrls() {
		return imageUrls;
	}
	public void setImageUrls(String[] imageUrls) {
		this.imageUrls = imageUrls;
	}
	public int getUnitsInStock() {
		return UnitsInStock;
	}
	public void setUnitsInStock(int unitsInStock) {
		UnitsInStock = unitsInStock;
	} 
	
	//domain odaklı çalışma yapılır. 
	
}
