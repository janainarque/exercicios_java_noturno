package principal;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int soma = 0;
    	for (int contador = 1; contador <= 25; contador += 2) 
        {
            System.out.println(contador);
            soma += contador;
        }
        System.out.println("Soma dos numeros: " + soma);
        for (int i = 1; i <= 25; i += 2) {
            System.out.print(i + " ");
        }
        
				
        int soma1 = 0;
        for (int contador = 1; contador <= 25; contador += 2)
        {
        	System.out.print(contador + " ");
        	soma1 += contador;
        }
        	System.out.println("Soma dos numeros: " + soma1);
		
		

	}

}
