package es.cic.taller.ejercicio06;

import java.util.ArrayList;

public class Baraja {
	private ArrayList<Carta> baraja =new ArrayList<Carta>();
	public Baraja() {
		for(int i=1;i<11;i++) {
			baraja.add(new Carta(i,"oro"));
			baraja.add(new Carta(i,"espadas"));
			baraja.add(new Carta(i,"copas"));
			baraja.add(new Carta(i,"bastos"));
			
		}
	}
	public Carta getCarta(int pos) {
		return baraja.get(pos);
	}

}
