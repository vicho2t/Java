/**
 * SE EJECUTA IGUAL QUE EL CODIGO DE LA PREGUNTA 1A, PERO ESTE CREA UN OBJETO DE LA CLASE "PilaOO" y UTILIZA SUS METODOS PARA HACER TODO
 */

package Prueba1;

import java.util.Scanner;

public class MainPilaOO {

	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		PilaOO pila;
		pila = new PilaOO();

		System.out.println("ingrese 3 push");
		pila.Push(in.nextInt());
		pila.Push(in.nextInt());
		pila.Push(in.nextInt());
		System.out.println("ahora sucederan 2 pop");
		pila.Pop();
		pila.Pop();
		System.out.println("ahora nos informara si esta vacia");
		pila.IsEmpty();
		System.out.println("ahora sucedera 2 pop");
		pila.Pop();
		pila.Pop();
		System.out.println("ahora nos informara si esta vacia");
		pila.IsEmpty();
		
		in.close();
		
	}
	
}
