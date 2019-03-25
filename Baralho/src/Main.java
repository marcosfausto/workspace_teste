
public class Main {
	
	public static void main(String[] args) 
	{
		
		Baralho baralho = new Baralho();
		
		baralho.imprimeBaralho();
		//baralho.embaralha();
		//baralho.daCarta();
		
	
		
		Carta c1 = new Carta();
	    c1.setNome("rei");

		baralho.temCarta(c1);
		
	}

}
