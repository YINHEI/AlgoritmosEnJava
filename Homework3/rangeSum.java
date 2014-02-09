/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:
Dados 2 numeros (limite inferior y superior), recorra el rango e imprima los numeros dentro de este rango.

*/

public class rangeSum{
	public static void main(String[] args){
		int valor1 = 0;
		int valor2 = 0;
			System.out.println("LIMITES: "+args[0]+" - "+args[1]);
		valor1 = Integer.parseInt(args[0].toString());
		valor2 = Integer.parseInt(args[1].toString());
	if(valor1<valor2){
		for(int valor3=valor1+1; valor3 < valor2; valor3++){
			System.out.println(+valor3);
				}	
		}else{
			for(int valor4=valor1-1; valor4	> valor2; valor4--){
			System.out.println(+valor4);
			}
		}
	}
}