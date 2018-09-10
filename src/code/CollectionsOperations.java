package code;

import java.util.ArrayList;
import java.util.List;

public class CollectionsOperations {
	
	private List<String> listA;
	private List<String> listB;
	private List<String> listC;
	
	public CollectionsOperations(){
		this.listA = new ArrayList<String>();
		this.listB = new ArrayList<String>();
		this.listC = new ArrayList<String>();
		
		this.listA.add("Pesho");
		this.listB.add("Pesho");
		this.listC.add("Pesho");
		
		this.listA.add("Gosho");
		this.listB.add("Minko");
		this.listC.add("Pesho");
		
		this.listA.add("Elena");
		this.listB.add("Todor");
		this.listC.add("Ivanka");
		
		this.listA.add("Miro");
		this.listB.add("Kiro");
		this.listC.add("Neli");
		
		this.listA.add("Anelia");
		this.listB.add("Detelina");
		this.listC.add("Dimityr");
		
		this.listA.add("Georgi");
		this.listB.add("Georgina");
		this.listC.add("Minko");
		
		this.listA.add("Maya");
		this.listB.add("Georgina");
		
		this.listA.add("Georgi");
		this.listB.add("Zoya");
		
		this.listA.add("Simeon");
	}

	public static void main(String[] args) {
		CollectionsOperations co = new CollectionsOperations();
		co.listB.removeAll(co.listA);
		co.listA.addAll(co.listB);
		
		System.out.println(co.listB);
		System.out.println(co.listA);

	}

}
