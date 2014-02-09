/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero mayor a cero, imprima el valor actual desde cero hasta antes de llegar dado valor.

*/

public class whileValue{
	public static void main(String[] args){
		int ValorActual=-1;
		int Numero;
			System.out.println(args[0]);
		Numero=Integer.parseInt(args[0].toString());
	while (Numero > ValorActual){
		ValorActual++;
			System.out.println("El valor actual es: "+ValorActual);
		}	
	}
}
