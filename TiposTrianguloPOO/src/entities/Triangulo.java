package entities;

public class Triangulo {
	
	/*
	 * meu código
	 * 
	 * 
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
	} */
	
	
	/* 
	 * código do professor
	 * 
	 */
	public String tipoTriangulo;
	
	public String retornaTipoTriangulo(int x, int y, int z) {
		if(x == y && y == z) {
			tipoTriangulo = "Triângulo é equilátero";
			return tipoTriangulo;
		}else if (x == y || x == z || y == z) {
			tipoTriangulo = "Triângulo é isósceles";
			return tipoTriangulo;
		}else {
			tipoTriangulo = "Triângulo é isósceles";
			return tipoTriangulo;
		}
	}

}
