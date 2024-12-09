package Aula203_Streams.dominio;

import java.util.Objects;

public class LightNovel {
	private String title;
	private double price;
	private Category category;

	public LightNovel(String title, double price) {
		this.title = title;
		this.price = price;
	}

	public LightNovel(String title, double price, Category category) {
		this.title = title;
		this.price = price;
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public int hashCode() {
		return Objects.hash(price, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LightNovel other = (LightNovel) obj;
		return Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "LightNovel [title=" + title + ", price=" + price + ", category=" + category + "]";
	}

}
