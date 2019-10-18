package jassessment;
import java.util.*;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
  List<Stock> st=new ArrayList<>();
  List<Sales> sa=new ArrayList<>();
  
  int o = 1;
	int itemcode = 100;
	int qu=0;
	int total=0;
	int i=0;
	String choice="";
	
  
  do{
	  
	  System.out.println("---------------------------Menu---------------------------");
	  System.out.println("1:Add items.");
	  System.out.println("2:Update the items.");
	  System.out.println("3:Display Stocks.");
	  System.out.println("4:Buy items.");
	  System.out.println("5:Exit.");
	  int opt=sc.nextInt();
	  
	  switch (opt) {

		case 1:
			System.out.println("Enter item:");
			String item = sc.next();
			System.out.println("Enter Cost");
			float cost = sc.nextFloat();
			System.out.println("Enter quantity");
			int quantity = sc.nextInt();
			
			Stock p = new Stock(item, cost, quantity,itemcode);
			itemcode++;
			st.add(p);
			break;
		
		
		case 2:
			System.out.println("Enter Code");
			int s=sc.nextInt();
			for(Stock sar: st){
				if(s==sar.code){
					
					System.out.println("Enter Cost");
					float cost1 = sc.nextFloat();
					System.out.println("Enter quantity");
					int quantity1 = sc.nextInt();
					Stock q = new Stock(sar.item, cost1, quantity1,itemcode);
					itemcode++;
					st.add(q);
					break;
				}
					
				}
			break;
		case 3:
			System.out.printf("%5s %5s %5s %5s","|Code|", "|Name|", "|Cost|", "|Quantity|");
			System.out.println();
			System.out.println("-------------------------------------------------------------------------------------------------------");
			for(Stock sar: st){
				
				System.out.printf("%5d %5s %.1f %5d ",sar.code,sar.item,sar.cost,sar.quantity);
				System.out.println();
				System.out.println("-------------------------------------------------------------------------------------------------------");
				
				
			}
			break;
		case 4:
			do{
			System.out.println("Enter Item");
			String it=sc.next();
			System.out.println("Select the quantity");
			int quan=sc.nextInt();
			for(Stock sar: st){
				if(it.equals(sar.item)){
					total+=sar.cost*quan;
					//System.out.println("the final bill amount is :");
					//System.out.println(quan*sar.cost);
					System.out.println("Press Y to continue N to not.");
					 choice=sc.next();
				
				}
				
			}
			}while(choice.equals("N"));
			System.out.println("the final bill amount is :");
			System.out.println(total);
			break;
		case 5:
			System.out.println("Exiting....");
			o = -1;
			break;
				

			}
  }while (o != -1);
	}
}
			
			
		
	  
	  
	  
  
  
	
