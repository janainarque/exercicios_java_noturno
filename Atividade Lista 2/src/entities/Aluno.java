package entities;

public class Aluno 
{
        String nome;
        int serie;
        double[] notas = new double[4];

        public Aluno(String nome, int serie, double[] notas) {
            this.nome = nome;
            this.serie = serie;
            this.notas = notas;
        }

        public double getMedia() {
            double soma = 0;
            for (double nota : notas) {
                soma += nota;
            }
            return soma / notas.length;
        }

        @Override
        public String toString() 
        {
            return  "Aluno: " + nome +
                    "\nSerie: " + serie +
                    "\nMedia: " + getMedia();
        }    
}