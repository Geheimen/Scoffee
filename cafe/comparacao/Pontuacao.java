package cafe.comparacao;

import java.util.Arrays;
import java.util.List;

import cafe.Cafe;
import cafe.Disponiveis;
import cafe.CafeTipos.Sabores;

public class Pontuacao {
	static double[] pontuacao(List<Sabores> sabores) {
		double[] score = new double[Disponiveis.disponiveis().size()];
		Arrays.fill(score, 0); //Zerando todos os scores
		int index = 0;
		
		
		for (Sabores sabor: sabores) {
			index = 0; //Zerando o índice cada vez que rodamos os scores
			for (Cafe cafe: Disponiveis.disponiveis()) {
				if (cafe.sabores.contains(sabor)) score[index]++; //Score positivo se o café tem o sabor desejado
				index++;
			}
		}
		
		index = 0;
		
		for (Cafe cafe: Disponiveis.disponiveis()) {
			if (cafe.mesmosSabores(sabores)) score[index]++; //Priorizando cafés que contêm APENAS os sabores escolhidos
//			System.out.println(cafe.sabores);
//			System.out.println(cafe);
//			System.out.println(cafe.mesmosSabores(sabores));
			index++;
		}
		
		
		
		
		return score;
	}
	
	static double[] pontuacaoTotal(double[] score) {
		//Total de pontos distribuídos
		double total = 0;
		//Total de pontos zerados
		int zeros = 0;
		
		for (int i=0; i<score.length; i++) {
//			if (score[i] < 0.0) continue; //Pulando pontuações negativas na contagem total
			if (score[i] == 0.0) zeros++; //Contando número de valores iguais a zero para remover do cálculo da média
			total = total + score[i];
		}			
		
		System.out.println("Total = " + total);
		System.out.println("Zeros = " + zeros);
		
		double[] total_zeros = {total, zeros};
		
		return total_zeros;
		
	}
	
	public static double[] pontuacaoPercentagem(List<Sabores> sabores) {
		double[] score = pontuacao(sabores);
		double total = pontuacaoTotal(score)[0];
		
		//Calculando o percentual de cada score
		for (int i=0; i<score.length; i++) {
			if (total == 0.0) {
				score[i] = 0.0;
				continue; //Evitando divisões por 0
			}
			score[i] = score[i]/total * 100.0;
			System.out.println("Percentual Score(" + i + ") = " + score[i]);
		}
		return score;
	}
}
