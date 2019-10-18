package jassessment;

import java.util.ArrayList;
import java.util.List;



public class Stock {
       String item;
       float cost;
       int quantity;
       int code;
       
       
       List<Sales> ppl = new ArrayList<>();
	private String sal;
       
	
       
       public Stock(String item, float cost, int quantity, int code) {
		super();
		this.item = item;
		this.cost = cost;
		this.quantity = quantity;
		this.code = code;
	}


	public String getItem() {
		return item;
	}


	public void setItem(String item) {
		this.item = item;
	}


	public float getCost() {
		return cost;
	}


	public void setCost(float cost) {
		this.cost = cost;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}
	
	public void pre() {
		String sal="";
		for(Sales s: ppl) 
	sal += "[code=" + s.code  + ", item=" + s.item + ", cost=" + s.cost + ", quantity=" + s.quantity +"\n]";
		this.sal= sal;
	}
	public String toString() {
		return "Stock [code=" + code + ", item=" + item + ", cost=" + cost + ", quantity=" + quantity +  "]";
	}
       
       
}
