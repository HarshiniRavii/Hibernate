package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Items")
public class Item {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Item_Id")
    private int item_Id;
	
    @Column(name="ItemName")
    private String itemName;
    
    @Column(name="Quantity")
    private String quantity;
    
    @Column(name="ItemTotal")
    private int itemTotal;
    
   @ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_no")
	private SuperMarket superMarket;
	public SuperMarket getSuperMarket() {
		return superMarket;
	}
	public void setSuperMarket(SuperMarket superMarket) {
		this.superMarket = superMarket;
	}
	public Item() {
		
	}
	public Item( String itemName, String quantity, int itemTotal) {
		super();
		
		this.itemName = itemName;
		this.quantity = quantity;
		this.itemTotal = itemTotal;
	}
	public int getItem_Id() {
		return item_Id;
	}
	public void setItem_Id(int item_Id) {
		this.item_Id = item_Id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public int getItemTotal() {
		return itemTotal;
	}
	public void setItemTotal(int itemTotal) {
		this.itemTotal = itemTotal;
	}
	@Override
	public String toString() {
		return "Items [item_Id=" + item_Id + ", itemName=" + itemName + ", quantity=" + quantity + ", itemTotal="
				+ itemTotal + "]";
	}
	
}
