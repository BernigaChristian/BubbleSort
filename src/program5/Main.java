package program5;

import java.util.*; 

public class Main {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("inserisci dimensione del vettore: ");
		int temp,max=0,somma=1,i,j,size=Integer.parseInt(scan.nextLine());
		int[] vettore=new int[size];//dichiarazione di un vettore
		for(i=0;i<size;i++) {
			System.out.println("inserisci il valore "+(i+1));
			vettore[i]=Integer.parseInt(scan.nextLine());
		}
		for(i=0;i<size;i++) {
			System.out.print(" "+vettore[i]);
		}
		System.out.println(" ");
		for(i=0;i<size;i++) {
			for(j=0;j<(size-1);j++) {
				if(vettore[j]>vettore[j+1]) {
					temp=vettore[j+1];
					vettore[j+1]=vettore[j];
					vettore[j]=temp;
				}
			}
		}
		for(i=0;i<size;i++) {
			System.out.print(" "+vettore[i]);
		}
		
	}

}
