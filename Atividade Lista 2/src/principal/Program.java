package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Aluno;
public class Program {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            List<Aluno> alunos = new ArrayList<>();

            for (int i = 0; i < 3; i++) {
                System.out.println("Digite o nome do aluno:");
                String nome = sc.nextLine();
                System.out.println("Digite a série do aluno:");
                int serie = sc.nextInt();
                sc.nextLine();
                double[] notas = new double[4];
                for (int j = 0; j < 4; j++) {
                    System.out.println("Digite a nota " + (j + 1) + ":");
                    notas[j] = sc.nextDouble();
                    sc.nextLine();
                }
                alunos.add(new Aluno(nome, serie, notas));
            }
            sc.close();
            for (Aluno aluno : alunos) {
                System.out.println(aluno);
            }
        }
    }