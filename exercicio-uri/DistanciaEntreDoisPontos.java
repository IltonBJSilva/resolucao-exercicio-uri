/* 
 * Nome do autor: Ilton Batista da Silva J�nior 
 * Data de cria��o do arquivo: 17/01/2019 
 * Objetivo sucinto do programa: Ler os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a dist�ncia entre eles
 * Refer�ncia ao enunciado/origem do exerc�cio: https://www.urionlinejudge.com.br/judge/pt/problems/view/1015 
 */

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class distanciaEntreDoisPontos {
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner leitor = new Scanner(System.in);
			
			double x1 = Double.parseDouble(leitor.next()); 
			double y1 = Double.parseDouble(leitor.next());
			
			double x2 = Double.parseDouble(leitor.next());
			double y2 = Double.parseDouble(leitor.next());		
			leitor.close();
			DecimalFormat decimalFormat = new DecimalFormat("###.0000");
			DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
			
			decimalFormatSymbols.setDecimalSeparator('.');
			decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
			
			double distancia;
			
			distancia = Math.sqrt(Math.pow((x1-y1), 2) - Math.pow((x2-y2), 2));
			System.out.println(decimalFormat.format(distancia));
		}
	}
