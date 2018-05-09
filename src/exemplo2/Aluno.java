package exemplo2;

import javax.swing.JOptionPane;

public class Aluno {

	//Atributos
	String nome;
	double nota1, nota2, nota3;
	int aprovados = 0, reprovados = 0;
	
	//Método para realizar as perguntas
	public void perguntas(){
		nome = JOptionPane.showInputDialog("Informe o nome do aluno");
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("1ª nota"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("2ª nota"));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("3ª nota"));
	}
	
	//Método de repetição
	public void laco(){
		//Variável
		int continuar = 0;
		//Laço
		do{
			perguntas();
			exibirSituacao();
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
		}while(continuar == 0);
		//Exibir aprovados ou reprovados
		exibir();
	}
	
	//Método para retornar o cálculo de média
	public double calculoDeMedia(){
		double media = (nota1+nota2+nota3)/3;
		return media;
	}
	
	//Método para retornar a situação do aluno
	public String situacaoAlunos(){
		String situacao = calculoDeMedia() >= 7 ? "Aprovado" : "Reprovado";
		return situacao;
	}
	
	public void exibirSituacao(){
		//Mensagem
		String msg = "*****Informações do Aluno*****";
				msg+= "\nSua média é "+String.format("%.2f", calculoDeMedia());
				msg+= "\nSua situação é "+situacaoAlunos();
		//Exibir mensagem
				JOptionPane.showMessageDialog(null, msg);
	}
	
	//Contar aprovados e reprovados
	public void contar(){
		if(calculoDeMedia() >= 7){
			aprovados++;
		}else{
			reprovados++;
		}
	}
	
	//Exibir a quantidade
	public void exibir(){
		String msg = "Aprovados X Reprovados";
				msg+= "\nAlunos aprovados "+aprovados;
				msg+= "\nAlunos reprovados "+reprovados;
		JOptionPane.showMessageDialog(null, msg);
	}
	
}
