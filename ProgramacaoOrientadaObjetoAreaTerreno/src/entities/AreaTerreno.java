package entities;

public class AreaTerreno {
	
	public double areaCalculada;
	public double largura;
	public double comprimento;
	
	
	public void retornaArea(double larguraInserido, double comprimentoInserido) {
		areaCalculada = larguraInserido * comprimentoInserido;
		System.out.println("A area total é de: " + areaCalculada + " metros");
	}

}
