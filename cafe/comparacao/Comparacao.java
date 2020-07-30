package cafe.comparacao;

import cafe.CafeTipos.Torra;
import cafe.Disponiveis;
import cafe.CafeTipos.Origem;
import cafe.CafeTipos.Sabores;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;



public class Comparacao {
	public static void main(String[] args) {
//		System.out.println(Disponiveis.disponiveis().get(0).sabores);
	}
	
	public static String[] recomendar(List<Torra> torra, List<Sabores> sabores) {
		String[] recomendacao = new String[2];
		double[] score = Pontuacao.pontuacao(sabores);
		double[] total_zeros = Pontuacao.pontuacaoTotal(score);
		double total = total_zeros[0];
		double zeros = total_zeros[1];
//		double mediana = 0.0;
		
		//Calculando a media para ajudar a descartar percentuais baixos
		double media = total/(score.length-zeros); //Desconsidera valores zerados
		
//		if (copy.length % 2 == 0) {
//			mediana = (copy[copy.length/2 - 1] +
//					copy[copy.length/2]
//							)/2;
//		} else {
//			mediana = copy[copy.length/2];
//		}
		
		System.out.println("med = " + media);
		
		//Associando os percentuais maiores ou iguais à mediana aos seus respectivos cafés
		HashMap<Origem,Double> chances = new HashMap<Origem,Double>();
		
		for (int i=0; i<score.length; i++) {
			if (score[i] >= media) chances.put(Disponiveis.disponiveis().get(i).origem, score[i]);
//			System.out.println(score[i]);
		}
		
		if (chances.isEmpty()) {
			recomendacao[0] = "Nenhum café encontrado";
			recomendacao[1] = recomendacao[0];
		} else if (chances.size() == 1) {
			for (Origem origem: chances.keySet()) {
				recomendacao[0] = origem.toString();
			}
			recomendacao[1] = "Nenhum outro café semelhante encontrado";
		} else {
//			for (int i=0; i<2; i++ ) {
				double maior = 0;
				double menor = 100;
				
				for (double chance: chances.values()) {
					maior = Math.max(maior, chance);
					menor = Math.min(menor, chance);
				}
				
				for (Entry<Origem,Double> entry: chances.entrySet()) {
					if (recomendacao[0] == null && entry.getValue().equals(maior)) {
						recomendacao[0] = entry.getKey().toString();
//						System.out.println("maior");
						continue;
					} else if (recomendacao[1] == null && entry.getValue().equals(menor)) {
						recomendacao[1] = entry.getKey().toString();
//						System.out.println("menor");
						continue;
					}
					if (recomendacao[0] != null && recomendacao[1] != null) break;
				}
//				chances.remove(key, maior);
			}
//		}
//		System.out.println(chances.keySet());
//		System.out.println(chances.values());
		return recomendacao;
	}
}
