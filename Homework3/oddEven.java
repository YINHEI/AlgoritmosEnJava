/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero 'n' identifique si es par o impar

*/

public class oddEven{
	public static void main(String[] args){
		int valor = Integer.parseInt(args[0].toString());
		float variable;
		if (valor%2==0){
			System.out.println("Par");
		}else{
			System.out.println("Impar");
		}
	}
}