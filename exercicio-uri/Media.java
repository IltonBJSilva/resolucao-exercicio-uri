/* 
 * Nome do autor: Ilton Batista da Silva J�nior 
 * Data de cria��o do arquivo: 16/01/2019 
 * Objetivo sucinto do programa:
 * Refer�ncia ao enunciado/origem do exerc�cio: https://docs.google.com/document/d/1VQUcUqMjF-UNKKIBhC3uXcmQ_VcVLf_PqZu5ObAyDBk/edit
 */

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		
		float a = Float.parseFloat(leitor.next());
		
		float b = Float.parseFloat(leitor.next());
		
		float c = Float.parseFloat(leitor.next());

		leitor.close();
		
		DecimalFormat decimalFormat = new DecimalFormat("#,###.0");
		DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
		
		decimalFormatSymbols.setDecimalSeparator('.');
		decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
		
		 
		float media;

		media = (a*2 + b*3 + c*5) /(3+2+5); 
		
		System.out.println("MEDIA = "+ decimalFormat.format(media));
		
		
		

	}

}
