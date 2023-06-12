package hn.uthjf.aplicacion_simple_maven_consola;

import java.util.Scanner;



public class App {
    public static void main( String[] args ){
        System.out.println( "Calculadora con Maven y Junit" );
        int opcion = 0;
        
        
        while(opcion != 5) {
        	imprimirMenu();
        	opcion = leerEnteroTeclado("");
        	Double resultado = null;
        	if(opcion == 1) {
        		resultado = calcularAreaCirculo(leerDecimalTeclado("Ingrese el radio:"));
        	}else if(opcion == 2) {
        		resultado = calcularAreaCuadrado(leerDecimalTeclado("Ingrese el lado:"));

        	}else if(opcion == 3) {
        		resultado = calcularAreaRectangulo(leerDecimalTeclado("Ingresa base:"),leerDecimalTeclado("Ingresa altura:"));

        	}else if(opcion == 4) {
        		resultado = calcularAreaTriangulo(leerDecimalTeclado("Ingresa base:"),leerDecimalTeclado("Ingresa altura:"));

        	}else {
        		System.out.println("Finalizando la aplicación.");
        	}
        	System.out.println("El resultado de la operación es: "+resultado);
        }
        
        
        
    }

	private static int leerEnteroTeclado(String mensaje) {
		Scanner teclado = new Scanner(System.in);
		System.out.println(mensaje);
		return teclado.nextInt();
	}
	
	private static double leerDecimalTeclado(String mensaje) {
		Scanner teclado = new Scanner(System.in);
		System.out.println(mensaje);
		return teclado.nextDouble();
	}

	private static void imprimirMenu() {
		System.out.println("*** CALCULADORA ***");
		System.out.println("1. área de un círculo");
		System.out.println("2. área de un cuadrado");
		System.out.println("3. área de un rectángulo");
		System.out.println("4. área de un triángulo");
		System.out.println("5. SALIR");
		System.out.println("ELIJA UNA OPCIÓN DEL MENÚ:");
	}


	public static double calcularAreaCirculo(double radio) {

		return Math.PI * radio * radio;
	}

	public static double calcularAreaCuadrado(double lado) {
		 
		return lado * lado;
		
	
	}

	public static double calcularAreaRectangulo(double base, double altura) {
		// TODO Auto-generated method stub
		return base * altura;
	}
	
		
	

	public static double calcularAreaTriangulo(double base, double altura) {
		
		 return (base * altura) / 2.0;
		
		
	}

	
	}

	


	


	

	


	

	


	


	
	

	

