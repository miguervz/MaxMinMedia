package es.studium.MaxMinMedia;

import java.util.Scanner;

public class MaxMinMedia {

	public static void main(String[] args)
	{
		Scanner teclado= new Scanner(System.in);
	int suma=0;
	int maximo;
	int minimo;
	
	int[]tabla = new int[10];
    
	for(int i=0;i<=9;i++)
	{
		System.out.println("Indique el valor de la tabla en la posicion "+i);
		tabla[i]=teclado.nextInt();
	}
	maximo=tabla[0];
	minimo=tabla[0];
	for(int i=0;i<=9;i++)
	{
	 suma=suma+tabla[i];
			 if(tabla[i]>maximo)
			 {
				  maximo=tabla[i];
		     }
	         if(tabla[i]<minimo)
	         {
	        	  minimo=tabla[i];
	        	  
	         }
	}
	System.out.println("El valor de la tabla del maximo es "+maximo);
	System.out.println("El valor de la tabla del minimo es "+minimo);
	System.out.println("El valor de la tabla de la media es "+ suma/10);
	teclado.close();	
	}}