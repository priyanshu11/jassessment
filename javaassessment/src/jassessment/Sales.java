package jassessment;

public class Sales {

	
	int cod;
	int quant;
	float tcost;
	public String code;
	public String item;
	public float cost;
	public String quantity;
	public Sales(int cod, int quant,float tcost) {
		super();
		this.cod = cod;
		this.quant = quant;
		this.tcost= tcost;
	}
	public float getTcost() {
		return tcost;
	}
	public void setTcost(float tcost) {
		this.tcost = tcost;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	public String toString() {
		return "Sales: [code=" + cod + ", quantity=" + quant + ", totalcost=" + tcost+ "]";
		
}
	
}
