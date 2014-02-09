/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Despliege la multiplicacion desde 0 hasta un valor 'n' dado.
Ej:
Si si ingresa 6
mostrar
1x2x3x4x5x6=720

*/

public class productToNumber {
  public static void main(String[] args) {
        
	int numero = Integer.parseInt(args[0].toString());
	int bandera = Integer.parseInt(args[0].toString());
        int factorial = 1;
        String multi = "X";
	String resultado = "";
	
	while(numero != 0){ 	
		if(numero == bandera){
			resultado= numero+resultado;
			factorial *= numero;
			numero= numero-1;
		}else{
			resultado= numero+multi+resultado;
			factorial *= numero;
			numero= numero-1;
		}	
	}
	System.out.println(resultado+"="+factorial);
    }
}