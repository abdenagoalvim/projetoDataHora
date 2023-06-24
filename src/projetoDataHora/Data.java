package projetoDataHora;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	private String mascara = "DD/MM/AAAA";
	
	public Data() {
	}

	public Data(int dia, int mes, int ano) {
		this.setDia(dia);
		this.setMes(mes);
		this.setAno(ano);
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		//não considerando a especificidade de cada mês...
		if ((dia < 1) || (dia > 31)) {
			System.out.println("Dia inválido!!!");
		} else {
			this.dia = dia;
		}
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if ((mes < 1) || (mes > 12)) {
			System.out.println("Mês inválido!!!");
		} else {
			this.mes = mes;
		}
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		//aceitar somente anos entre 1901 e 2999
		if ((ano < 1901) || (ano > 2999)) {
			System.out.println("Ano inválido!!!");
		} else {
			this.ano = ano;
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
		String[] meses1 = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", 
                  		   "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
		String[] meses2 = {"jan", "fev", "mar", "abr", "mai", "jun", 
						   "jul", "ago", "set", "out", "nov", "dez"};
		String sDia = Integer.toString(this.dia);
		if (this.dia < 10) {
			 sDia = "0" + sDia;
		}
		String sMes = Integer.toString(this.mes);
		if (this.mes < 10) {
			 sMes = "0" + sMes;
		}
		/* outra forma de incluir o zero a direita para os dias e meses menores que 10
		 * é através do método format da classe DecimalFormat. Veja os exemplos:
		 * String sDia = new DecimalFormat("00").format(dia);
		 * String sMes = new DecimalFormat("00").format(mes);
		 * Nesse caso será necessário inportar a classe DecimalFormat:
		 * import java.text.DecimalFormat;
		 */ 
		
		
		msc = msc.replaceAll("DD", sDia);
		msc = msc.replaceAll("D", Integer.toString(dia));
		msc = msc.replaceAll("MMMM", meses1[mes-1]);
		msc = msc.replaceAll("MMM", meses2[mes-1]);
		msc = msc.replaceAll("MM", sMes);
		msc = msc.replaceAll("M", Integer.toString(mes));
		msc = msc.replaceAll("AAAA", Integer.toString(ano));
		msc = msc.replaceAll("AA", Integer.toString(ano%100));
		
		return msc;
	}
	
}
