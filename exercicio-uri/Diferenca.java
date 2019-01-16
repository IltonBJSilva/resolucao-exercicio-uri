import java.util.Scanner;

/* 
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 16/01/2019 
 * Objetivo sucinto do programa: mostrar a diferença do produto de A e B pelo produto de C e D
 * Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1VQUcUqMjF-UNKKIBhC3uXcmQ_VcVLf_PqZu5ObAyDBk/edit
 */

public class Diferenca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int a = leitor.nextInt();
		int b = leitor.nextInt();
		int c = leitor.nextInt();
		int d = leitor.nextInt();
		int diferenca;
		
		leitor.close();
		
		diferenca = a*b - c*d;
		
		System.out.println("DIFERENCA = "+diferenca);
		
	}

}
