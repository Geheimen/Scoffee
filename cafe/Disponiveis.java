package cafe;

import java.util.ArrayList;
import java.util.List;

import cafe.CafeTipos.Origem;
import cafe.CafeTipos.Sabores;
//import cafe.CafeTipos.Torra;

public class Disponiveis {

	public static List<Cafe> disponiveis() {
		//Teste de inserção de dados para comparação. Torra não será usada no momento
		List<Sabores> s1 = new ArrayList<Sabores>();
		List<Sabores> s2 = new ArrayList<Sabores>();
		List<Sabores> s3 = new ArrayList<Sabores>();
		List<Sabores> s4 = new ArrayList<Sabores>();
		List<Sabores> s5 = new ArrayList<Sabores>();
		List<Sabores> s6 = new ArrayList<Sabores>();
		List<Sabores> s7 = new ArrayList<Sabores>();
		List<Sabores> s8 = new ArrayList<Sabores>();
		
		s1.add(Sabores.ASSADO);
		s1.add(Sabores.NOZ_CACAU);
		s1.add(Sabores.ESPECIARIAS);
		
		s2.add(Sabores.ASSADO);
		s2.add(Sabores.FRUTADO);
		s2.add(Sabores.ESPECIARIAS);
		
		s3.add(Sabores.OUTROS);
		s3.add(Sabores.NOZ_CACAU);
		
		s4.add(Sabores.FRUTADO);
		s4.add(Sabores.DOCE);
		
		s5.add(Sabores.DOCE);
		s5.add(Sabores.FLORAL);
		s5.add(Sabores.NOZ_CACAU);
		s5.add(Sabores.FRUTADO);
		
		s6.add(Sabores.ESPECIARIAS);
		s6.add(Sabores.FLORAL);
		s6.add(Sabores.OUTROS);
		
		s7.add(Sabores.ASSADO);
		s7.add(Sabores.ESPECIARIAS);
		
		s8.add(Sabores.FLORAL);
		s8.add(Sabores.AZEDO_FERMENTADO);
		
//		List<Torra> t = new ArrayList<Torra>();
//		t.add(Torra.CLARA);
//		t.add(Torra.ESCURA);
		
		Cafe c1 = new Cafe(Origem.AFRICA, s1);
		Cafe c2 = new Cafe(Origem.ARABIA, s2);
		Cafe c3 = new Cafe(Origem.BRASIL, s3);
		Cafe c4 = new Cafe(Origem.COLOMBIA, s4);
		Cafe c5 = new Cafe(Origem.ETIOPIA, s5);
		Cafe c6 = new Cafe(Origem.GUIANA, s6);
		Cafe c7 = new Cafe(Origem.INDIA, s7);
		Cafe c8 = new Cafe(Origem.ITALIA, s8);
		
		List<Cafe> disponiveis = new ArrayList<Cafe>();
		disponiveis.add(c1);
		disponiveis.add(c2);
		disponiveis.add(c3);
		disponiveis.add(c4);
		disponiveis.add(c5);
		disponiveis.add(c6);
		disponiveis.add(c7);
		disponiveis.add(c8);
		return disponiveis;

	}

}
