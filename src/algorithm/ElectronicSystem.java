package algorithm;

import java.util.Scanner;

public class ElectronicSystem {
	
	static Item[] item;
	
	public ElectronicSystem() {
		item = new Item[5]; // array of object of type 'Item' created ==> int[] item = new int[5]
 		
		Item i1 = new Item("TV",70000.00,30);
		Item i2 = new Item("Phone",80000.00,20);
		Item i3 = new Item("Microwave",90000.00,40);
		Item i4 = new Item("Iron",20000.00,15);
		Item i5 = new Item("Oven",60000.00,13);
		
		item[0] = i1; // store reference of the Item object
		item[1] = i2;
		item[2] = i3;
		item[3] = i4;
		item[4] = i5;
		
		
	}
	
	static Scanner scan = new Scanner(System.in);
	
	public void WelcomePage() {
		System.out.println("Welcome to Electronic System");
		System.out.println("1. View Sell item List");
		System.out.println("2. Search item list by item name");
		
		System.out.print("Choose Option : ");
		int option = scan.nextInt();
		
		System.out.println();
		
		System.out.println("======================================");
		
		
		switch(option) {
		case 1:
			ViewSellItem();
			break;
			
		case 2:
			SearchItem();
			break;
			
			default:
				System.out.println("Wrong Input");
		}
	}
	
	public void ViewSellItem() {
		
		System.out.println("The avaliable items are as follow...");
		
		System.out.println();
		
		for(Item i : item) {
			System.out.println(i.getItemName()+" || "+i.getPrice()+" || "+i.getQty()+"\n");
		}
		
		System.out.println("======================================");
		
		System.out.print("Search item list by item name (Y/N) : ");
		char ch = scan.next().charAt(0);
		
		if(Character.toUpperCase(ch)=='Y') {
			SearchItem();
		}
		
	}
	
	public void SearchItem() {
		
		System.out.println();
		
		System.out.print("Enter item name : ");
		String item_search = scan.next();
		

//		@ Wtih for loop 
		
//		for(;i<item.length; i++) {
//			
//			if(item_search.equalsIgnoreCase(item[i].getItemName())) {
//				System.out.println(item[i].getItemName()+" || "+item[i].getPrice()+" || "+item[i].getQty()+"\n");
//				break;
//			}
//			
//		}
		
		
//		@ With for each loop 
		
		boolean flag = false;
		
		for(Item i : item) {
			if(item_search.equalsIgnoreCase(i.getItemName())) {
				System.out.println(i.getItemName()+" || "+i.getPrice()+" || "+i.getQty()+"\n");
				flag = true;
				break;
			}
		}

		
		if(!flag) {
			System.out.println("Item not found");
		}
		
		System.out.println();
		
	}

}
