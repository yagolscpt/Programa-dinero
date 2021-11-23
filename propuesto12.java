package divisionbucle;

import java.util.Scanner;

public class propuesto12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		System.out.println("escribe la cantidad a pagar");
		int dinero= scan.nextInt();
		int contador500= 0;
		int contador200=0;
		int contador100=0;
		int contador50=0;
		int contador20=0;
		int contador10=0;
		int contador5=0;
		
	for(int i=0;i<=10;i++) {
		if (dinero>=500) {
			dinero=dinero-500;
			contador500=contador500+1;
		}
		else if (dinero>=200) {
			dinero=dinero-200;
			contador200=contador200+1;
		}
		else if (dinero>=100) {
			dinero=dinero-100;
			contador100=contador100+1;
		}
		else if (dinero>=50) {
			dinero=dinero-50;
			contador50=contador50+1;
		}
		else if (dinero>=20) {
			dinero=dinero-20;
			contador20=contador20+1;
		}
		else if (dinero>=10) {
			dinero=dinero-10;
			contador10=contador10+1;
		}
		else if(dinero>=5) {
			dinero=dinero-10;
			contador5=contador5+1;
			break;
		}
		
	}
	System.out.println(contador500 +" " +"billetes de 500"+ " /"+ contador200+ " "+ "billetes de 200" + "/  "+ contador100+"  "+ "billetes de 100"+" /"+ contador50+ " billetes de 50 "+" / "+ contador20+ "  "+ "billetes de 20"+" /"+ contador10+" "+ "billetes de 10"+ " /"+ contador5+"  " + "billetes de 5");
		 
		
		
		
		
		
		
		
		
	}

}
