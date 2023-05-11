package Aldo;

import java.util.ArrayList;
import java.util.List;

public class AppNavio {

	static List<NavioGraneleiro> listaNaviosGraneleiros = new ArrayList<NavioGraneleiro>();
	static List<NavioContainer> listaNaviosContainer = new ArrayList<NavioContainer>();
	
	public static void main(String[] args) {
		
		
		listaNaviosGraneleiros.add(new NavioGraneleiro(10, "Estrela do Mar", 4, 50000, 4));
		listaNaviosGraneleiros.add(new NavioGraneleiro(25, "Cruzeiro do Sul", 3, 80000, 6));
		
		for(NavioGraneleiro navioGraneleiro : listaNaviosGraneleiros) {
			System.out.println("\nNavio Graneileiro: " + navioGraneleiro);
			System.out.println("--------------------------------------------------------------------");
		}
			
			
		listaNaviosContainer.add(new NavioContainer(33, "Bela e a Fera", 2, 100000, 2, 30));
		listaNaviosContainer.add(new NavioContainer(48, "Arrecifes", 2, 120000, 2, 30));
		listaNaviosContainer.add(new NavioContainer(52, "Águas Belas", 1, 90000, 0, 25));
		
		for(NavioContainer navioContainer : listaNaviosContainer) {
			System.out.println("\nNavio Container: " + navioContainer);
			System.out.println("--------------------------------------------------------------------");
		}
		
		
		
		
	
		 
	}

}
