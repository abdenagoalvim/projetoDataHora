package projetoDataHora;

public class Hora {
	private int hor;
	private int min;
	private int seg;
	String mascara = "HH/MM";
	
	public Hora() {
	}

	public Hora(int hor, int min, int seg) {
		this.hor = hor;
		this.min = min;
		this.seg = seg;
	}
	
}
