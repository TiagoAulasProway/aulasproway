package exemplo01;

public class Main {

	public static void main(String[] args) {
		
		//Instanciar
		Pessoa p1 = new Pessoa();
		p1.nome = "Tiago";
		p1.idade = 26;
		p1.peso = 85;
		p1.altura = 1.78;
		
		//Instanciar outro objeto
		Pessoa p2 = new Pessoa();
		p2.nome = "Lúcifer";
		p2.idade = 666;
		p2.peso = 66.6;
		p2.altura = 1.66;
		
		//Invocar métodos
		p1.apresentacao();
		p1.exibirImc();
		
	}
	
}
