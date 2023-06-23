package projetoDataHora;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	String mascara = "DD/MM/AAAA";
	
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
	
}
