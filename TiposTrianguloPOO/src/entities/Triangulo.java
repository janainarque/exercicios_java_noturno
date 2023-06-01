package entities;

public class Triangulo {
	
	
	public double lado1;
	public double lado2;
	public double lado3;
	
	
	
	public void retornaTipoTriangulo(double lado1, double lado2, double lado3) {
		if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("O triângulo é equilátero!");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            System.out.println("O triângulo é isósceles!");
        } else {
            System.out.println("O triângulo é escaleno!");
        }
	}

}
