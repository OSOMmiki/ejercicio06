package es.cic.taller.ejercicio06;

public class Tapete {
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	
	public void setTapete(Carta c1,Carta c2,Carta c3,Carta c4) {
		carta1=c1;
		carta2=c2;
		carta3=c3;
		carta4=c4;
	}
	
	public Carta[] getTapete() {
		Carta[] tapete=new Carta[4];
		tapete[0]=carta1;
		tapete[1]=carta2;
		tapete[2]=carta3;
		tapete[3]=carta4;
		return tapete;
}
}
