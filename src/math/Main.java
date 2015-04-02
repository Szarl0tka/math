package math;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Calcul c = new Calcul();
		String a;
		String b;
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Bienvenue sur la calculette");
			System.out.println("----------");
			
			System.out.println("1.Addition");
			System.out.println("2.Soustraction");
			System.out.println("3.Diviser");
			System.out.println("4.Multiplier");
			System.out.println("5.Racine");
			System.out.println("0.Quitter\n");
			
			String str = sc.nextLine();	
			
			int rep = Integer.parseInt(str);
			System.out.println("\n\n\n");
			switch(rep)
			{
				case 0:
					return;
				case 1:
					System.out.println("ADDITION");
					System.out.println("Valeur 1 ?");
					a = sc.nextLine();
					System.out.println("Valeur 2 ?");
					b = sc.nextLine();
					System.out.println(c.addition(Integer.parseInt(a), Integer.parseInt(b)));					
					break;
					
				case 2:
					System.out.println("SOUSTRACTION");
					System.out.println("Valeur 1 ?");
					a = sc.nextLine();
					System.out.println("Valeur 2 ?");
					b = sc.nextLine();
					System.out.println(c.soustraction(Integer.parseInt(a), Integer.parseInt(b)));					
					break;
					
				case 3:
					System.out.println("DIVISION");
					System.out.println("Valeur 1 ?");
					a = sc.nextLine();
					System.out.println("Valeur 2 ?");
					b = sc.nextLine();
					System.out.println(c.division(Integer.parseInt(a), Integer.parseInt(b)));					
					break;
					
				case 4:
					System.out.println("MULTIPLICATION");
					System.out.println("Valeur 1 ?");
					a = sc.nextLine();
					System.out.println("Valeur 2 ?");
					b = sc.nextLine();
					System.out.println(c.multiplication(Integer.parseInt(a), Integer.parseInt(b)));					
					break;
					
			
					
				case 5:
					System.out.println("RACINE");
					System.out.println("Valeur 1 ?");
					a = sc.nextLine();
					System.out.println(c.racine(Integer.parseInt(a)));	
					break;
			
			}
			sc.nextLine();
		}		
	}

}
