package project;

import java.util.ArrayList;
import java.util.List;

class Item {
	public String name;
	public double priceForSingleItem;
	public int amount;
	public Section section;

	public Item(String name, double priceForSingleItem, 
			int amount, Section section) {
		this.name = name;
		this.priceForSingleItem = priceForSingleItem;
		this.amount = amount;
		this.section = section;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", priceForSingleItem=" 
	            + priceForSingleItem + ", amount=" + amount 
	            + ", section=" + section + "]";
	}
}

enum Section {
	Meat, Seafood, Bakery, Vegetable
}

public class Project6 {
	private List<Item> items;

	public Project6(List<Item> items) {
		this.items = items;
		System.out.println();
	}

	/**
	 * This method should return specific Item object based on it's name from items
	 * list. If item by this name is not in the items list return null.
	 * 
	 */
	public Item getItemByName(String name) {
		for (Item item : items) {
			if (name.equals(item.name)) {
				return item;
			}
		}
		return null;
	}

	/**
	 * This method should return List<Item> based on section section is enum with
	 * values: Meat, Seafood, Bakery, Vegetable
	 */
	public List<Item> getItemsBySection(Section section) {
		// TODO
		List<Item> list = new ArrayList<>();
		for (Item item : items) {
			if (section == item.section) {
				list.add(item);
			}
		}
		return list;
	}

	/**
	 * This method should return total price of the Item Note: in order to get price
	 * we need multiply priceForSingleItem to amount
	 */
	public double getItemPrice(String itemName) {

		Item item = getItemByName(itemName);
		double price = (item.priceForSingleItem) * (item.amount);
		return price;
	}

	/**
	 * Get total price for specific section Note: in order to get price we need
	 * multiply priceForSingleItem to amount
	 */
	public double getTotalPriceBySection(Section section) {
		double resPrice = 0;
		List<Item> ibySec = getItemsBySection(section);
		for (Item item : ibySec)
			resPrice += item.priceForSingleItem * item.amount;
		return resPrice;
	}

	/**
	 * Get total price for all items Note: in order to get price we need multiply
	 * priceForSingleItem to amount
	 */
	public double getTotalPrice() {
		double total = 0;
		for (Item item : items) {
			
				total += item.priceForSingleItem*item.amount;
		}
		return total;
	}

}
