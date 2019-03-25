import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
	
	private List<Carta> listaCartas;
	
	public Baralho() 
	{
		
		listaCartas = new ArrayList<>();
		
		String[] naipes = {"Paus","Ouro","Copas","Espada"};
		int pos = 0;
		
		Carta c;
		
		while(pos<4)
		{
			for(int i = 1; i<=10; i++) 
			{
				c = new Carta();
				c.setNome(i + "");
				c.setNaipe(naipes[pos]);
				listaCartas.add(c);
			}
			
			c = new Carta();
			c.setNome("valete");
			c.setNaipe(naipes[pos]);
			listaCartas.add(c);
			
			c = new Carta();
			c.setNome("damas");
			c.setNaipe(naipes[pos]);
			listaCartas.add(c);
			
			c = new Carta();
			c.setNome("rei");
			c.setNaipe(naipes[pos]);
			listaCartas.add(c);
			
			c = new Carta();
			c.setNome("coringa");
			c.setNaipe("coringa");
			listaCartas.add(c);
			
			pos++;
		
		}
			
	}
	
	public void embaralha() 
	{
		Collections.shuffle(listaCartas);
		
	}
	
	public void daCarta() 
	{
		System.out.println("Carta: "+listaCartas.get(0).getNome()+" Naipe: " +listaCartas.get(0).getNaipe());
		
	}
	
	public boolean temCarta(Carta carta) {
		
		if(listaCartas.contains(carta)) {
			System.out.println("Tem a carta!");
			return true;
		}
		else {
			System.out.println("Não tem a carta!");
			return false;
		}
	}

	public void imprimiLista() 
	{
		System.out.println(listaCartas);
		
	}
	public void imprimeBaralho()
	{
		/*StringBuilder sb = new StringBuilder();
		        
		listaCartas.forEach((c) -> {
		sb.append("Carta: ").append(c.getNome()).append(" | Naipe: ").append(c.getNaipe()).append("\n");
		});
		        
		System.out.println(sb.toString());*/
		
		for (Carta carta : listaCartas) {
			System.out.println("Carta: "+carta.getNome()+" Naipe: "+carta.getNaipe()+"\n");
		}
     }
	
}
