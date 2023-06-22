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

	public int getHor() {
		return hor;
	}

	public void setHor(int hor) {
		this.hor = hor;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getSeg() {
		return seg;
	}

	public void setSeg(int seg) {
		this.seg = seg;
	}

	public String getMascara() {
		return mascara;
	}

	public void setMascara(String mascara) {
		this.mascara = mascara;
	}
	
}
