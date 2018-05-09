//Classe = Molde

package exemplo01;

import javax.swing.JOptionPane;

public class Pessoa {
	
	//Atributos
	String nome;
	int idade;
	double peso, altura;
	
	//Método de apresentação
	public void apresentacao(){
		JOptionPane.showMessageDialog(null, "Olá! Meu nome é "+nome);
	}
	
	//Cálculo de IMC
	public double calculoImc(){
		double imc = peso / Math.pow(altura, 2);
		return imc;
	}
	
	//Situação do IMC
	public String situacaoImc() {
		//Variável contendo a situação
		String situacao;
		//Obter o valor do IMC
		double imc = calculoImc();
		//Situação
		if(imc<17){
			situacao = "Muito abaixo do peso.";
		}else if(imc < 18.5){
			situacao = "Abaixo do peso.";
		}else if(imc < 25){
			situacao = "Peso normal.";
		}else if(imc < 30){
			situacao = "Acima do peso.";
		}else if(imc < 35){
			situacao = "Obesidade I.";
		}else if(imc < 40){
			situacao = "Obesidade II.";
		}else{
			situacao = "Obesidade III.";
		}
		
		//Retorno
		return situacao;
		
	}
	
	//Método para exibir o IMC e a situação
	public void exibirImc(){
		//Mensagem
		String msg = "*****IMC*****";
				msg+= "\nSeu IMC é de "+String.format("%.2f", calculoImc());
				msg+= "\nSua situação é "+situacaoImc();
			   
		//Exibir mensagem
		JOptionPane.showMessageDialog(null, msg);
	
	}

}
