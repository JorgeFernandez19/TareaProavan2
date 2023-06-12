package hn.uthjf.aplicacion_simple_maven_consola;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;




	public class AppTest {

			
			@BeforeClass
			
			public static void configuracionInicial1() {
				System.out.println("Método de tipo Setup, se ejecuta antes de cada prueba");
			}
		   
	public void testCalcularAreaCirculo(){
		            double radio1 = 5.0;
			        double expectedArea1 = 78.53981633974483;
			        double actualArea1 = App.calcularAreaCirculo(radio1);
			        Assert.assertEquals(expectedArea1, actualArea1, 0.0001);
			}
			
		
	public void testCalcularAreaCirculo1(){
		 double radio2 = 0.0;
	        double expectedArea2 = 0.0;
	        double actualArea2 = App.calcularAreaCirculo(radio2);
	        Assert.assertEquals(expectedArea2, actualArea2, 0.0001);
			}
			
		
	public void testareaCirculo2(){
		double radio3 = -3.0;
        double expectedArea3 = 28.274333882308138;
        double actualArea3 = App.calcularAreaCirculo(radio3);
        Assert.assertEquals(expectedArea3, actualArea3, 0.0001);
			}
			
		
			public void testareacuadrdo1() {
				 double lado4 = 2.5;
			        double expectedArea4 = 6.25;
			        double actualArea4 = App.calcularAreaCuadrado(lado4);
			        Assert.assertEquals(expectedArea4, actualArea4, 0.0001);
			}
			
			public void testareacuadrdo2() {
			double lado6 = -500000.0;
	        double expectedArea6 = 2.511;
	        double actualArea6 = App.calcularAreaCuadrado(lado6);
	        Assert.assertEquals(expectedArea6, actualArea6, 0.0001);
			}
			
			
			public void testareacuadrdo3() {
				 double lado5 = 1000000.0;
			        double expectedArea5 = 1.012;
			        double actualArea5 = App.calcularAreaCuadrado(lado5);
			        Assert.assertEquals(expectedArea5, actualArea5, 0.0001);
			}
			
			public void testestarearectangulo() {
			double base1 = 5.0;
	        double altura1 = 0.0;
	        double expectedArea1 = 0.0;
	        double actualArea1 = App.calcularAreaRectangulo(base1, altura1);
	        Assert.assertEquals(expectedArea1, actualArea1, 0.0001);
			
		
			      
	
			
			}
			
			
			public void testestarearectangulo1() {
				
				  double base2 = 0.0;
			        double altura2 = 8.0;
			        double expectedArea2 = 0.0;
			        double actualArea2 = App.calcularAreaRectangulo(base2, altura2);
			        Assert.assertEquals(expectedArea2, actualArea2, 0.0001);
			        
			        
				
				
			}
			public void testestarearectangulo3() {
				 double base3 = 3.5;
			        double altura3 = 2.5;
			        double expectedArea3 = 8.75;
			        double actualArea3 = App.calcularAreaRectangulo(base3, altura3);
			        Assert.assertEquals(expectedArea3, actualArea3, 0.0001);
				
			}
			
			public void testestareatriangulo() {
				double base3 = -5.0;
		        double altura3 = -3.0;
		        double expectedArea3 = 7.5;
		        double actualArea3 = App.calcularAreaTriangulo(base3, altura3);
		        Assert.assertEquals(expectedArea3, actualArea3, 0.0001);
			}
			public void testestareatriangulo1() {
				 double base4 = 8.0;
			        double altura4 = -2.0;
			        double expectedArea4 = -8.0;
			        double actualArea4 = App.calcularAreaTriangulo(base4, altura4);
			        Assert.assertEquals(expectedArea4, actualArea4, 0.0001);
			}
			public void testestareatriangulo2() {
				double base1 = 7.0;
		        double altura1 = 0.0;
		        double expectedArea1 = 0.0;
		        double actualArea1 = App.calcularAreaTriangulo(base1, altura1);
		        Assert.assertEquals(expectedArea1, actualArea1, 0.0001);
			}
			
			
			
			@AfterClass
			public void finalizacionPruebas() {
			
				System.out.println("Método de tipo TearDown, se ejecuta despues de cada prueba");
			}
		
			}

