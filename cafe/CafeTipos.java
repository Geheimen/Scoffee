package cafe;

public class CafeTipos {
	public static enum Origem {
		BRASIL(1),
		COLOMBIA(2),
		INDIA(3),
		ARABIA(4),
		GUIANA(5),
		AFRICA(6),
		ETIOPIA(7),
		ITALIA(8);
		
		private int origem;
		
		Origem(int i) {
			this.origem = i;
		}

		public int getOrigem() {
			return origem;
		}
	}
	
	public static enum Torra {
		CLARA(1),
		MEDIA(2),
		ESCURA(3);
		
		private int torra;
		
		Torra(int i) {
			this.torra = i;
		}

		public int getTorra() {
			return torra;
		}
	}
	
	public static enum Sabores {
		NOZ_CACAU(1),
		DOCE(2),
		FLORAL(3),
		FRUTADO(4),
		AZEDO_FERMENTADO(5),
		VERDE_VEGETAL(6),
		ESPECIARIAS(7),
		ASSADO(8),
		OUTROS(9);
		
		private int sabor;
		
		Sabores(int i) {
			this.sabor = i;
		}

		public int getSabor() {
			return sabor;
		}
	}
}
