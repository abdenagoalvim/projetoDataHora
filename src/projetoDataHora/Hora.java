package projetoDataHora;

public class Hora {
	private int hor;
	private int min;
	private int seg;
	private String mascara = "HH:MM";
	
	public Hora() {
	}

	public Hora(int hor, int min) {
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
	
	@Override
	public String toString() {
		String msc = this.mascara;
		String sHor = Integer.toString(this.hor);
		if (this.hor < 10) {
			 sHor = "0" + sHor;
		}
		String sMin = Integer.toString(this.min);
		if (this.min < 10) {
			 sMin = "0" + sMin;
		}
		String sSeg = Integer.toString(this.seg);
		if (this.seg < 10) {
			sSeg = "0" +sSeg;
		}
		/* outra forma de incluir o zero a direita para as horas, minutos e segundos menores que 10
		 * é através do método format da classe DecimalFormat. Veja os exemplos:
		 * String sHor = new DecimalFormat("00").format(hor);
		 * String sMin = new DecimalFormat("00").format(min);
		 * String sMeg = new DecimalFormat("00").format(seg);
		 * Nesse caso será necessário inportar a classe DecimalFormat:
		 * import java.text.DecimalFormat;
		 */ 
		
		
		msc = msc.replaceAll("HH", sHor);
		msc = msc.replaceAll("H", Integer.toString(this.hor));
		msc = msc.replaceAll("MM", sMin);
		msc = msc.replaceAll("M", Integer.toString(this.min));
		msc = msc.replaceAll("SS", sSeg);
		msc = msc.replaceAll("S", Integer.toString(this.seg));
		
		return msc;
	}

}
