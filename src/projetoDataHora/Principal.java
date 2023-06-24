package projetoDataHora;

public class Principal {

	public static void main(String[] args) {
		Data d1 = new Data(7,2,2023);
		System.out.println(d1);
		d1.setMascara("D/M/AAAA");
		System.out.println(d1);
		d1.setMascara("D/M/AA");
		System.out.println(d1);
		d1.setMascara("DD/MMM/AAAA");
		System.out.println(d1);
		d1.setMascara("Belo Horizonte, D de MMMM de AAAA.");
		System.out.println(d1);
		d1.setDia(13);
		d1.setMes(9);
		d1.setMascara("D/M/AA");
		System.out.println(d1);
		d1.setMascara("D/M/AAAA");
		System.out.println(d1);
		d1.setMascara("DD/MM/AAAA");
		System.out.println(d1);
		d1.setMascara("DD/MMM/AAAA");
		System.out.println(d1);
		d1.setMascara("Belo Horizonte, D de MMMM de AAAA.");
		System.out.println(d1);
		
		System.out.println();
		
		Hora h1 = new Hora(9, 5);
		h1.setSeg(25);
		System.out.println(h1);
		h1.setMascara("H:M:S");
		System.out.println(h1);
		h1.setMascara("HH:MM:SS");
		System.out.println(h1);
		h1.setMascara("MM:SS");
		System.out.println(h1);
		
		
	}
}
