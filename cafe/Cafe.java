package cafe;

import java.util.List;

import cafe.CafeTipos.Origem;
import cafe.CafeTipos.Sabores;
import cafe.CafeTipos.Torra;

public class Cafe {
	public Origem origem;
	List<Torra> torra; //Aceita mais de uma torra
	public List<Sabores> sabores; //Aceita mais de um sabor
	
	//Construtor usado na UI (não implementado)
//	Cafe(List<Torra> torra, List<Sabores> sabores) {
//		this.torra = torra;
//		this.sabores = sabores;
//	}
	
	//Construtor usado para inserir dados para comparação
	Cafe(Origem origem, List<Sabores> sabores) {
		this.sabores = sabores;
		this.origem = origem;
	}

	public boolean mesmosSabores(List<Sabores> sabores) {
		if (this.sabores.equals(sabores)) return true;
	
		if (sabores == null) return false;
		if (this.sabores == null && sabores != null) return false;
		
		if (this.sabores.size() == sabores.size() &&
				this.sabores.containsAll(sabores)) return true;

		return false;
	}
}
