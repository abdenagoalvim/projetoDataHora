package projetoDataHora;

public class Hora {
	private int hor;
	private int min;
	private int seg;
	String mascara = "HH/MM";
	
	public Hora() {
	}

	public Hora(int hor, int min, int seg) {
		this.setHor(hor);
		this.setMin(min);
		this.setSeg(seg);
	}

	public int getHor() {
		return hor;
	}

	public void setHor(int hor) {
		if ((hor < 0) || (hor > 23)) {
			System.out.println("Hora inválida!!!");
		} else {
			this.hor = hor;
		}
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		if ((min < 0) || (min > 59)) {
			System.out.println("Minuto inválido!!!");
		} else {
			this.min = min;
		}
	}

	public int getSeg() {
		return seg;
	}

	public void setSeg(int seg) {
		if ((seg < 0) || (seg > 59)) {
			System.out.println("Segundo inválido!!");
		} else {
			this.seg = seg;
		}
	}

	public String getMascara() {
		return mascara;
	}

	public void setMascara(String mascara) {
		this.mascara = mascara;
	}
	
}
