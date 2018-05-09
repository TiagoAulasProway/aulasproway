package exemplo2;

import javax.swing.JOptionPane;

public class Aluno {

	//Atributos
	String nome;
	double nota1, nota2, nota3;
	int aprovados = 0, reprovados = 0;
	
	//M�todo para realizar as perguntas
	public void perguntas(){
		nome = JOptionPane.showInputDialog("Informe o nome do aluno");
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("1� nota"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("2� nota"));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("3� nota"));
	}
	
	//M�todo de repeti��o
	public void laco(){
		//Vari�vel
		int continuar = 0;
		//La�o
		do{
			perguntas();
			exibirSituacao();
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
		}while(continuar == 0);
		//Exibir aprovados ou reprovados
		exibir();
	}
	
	//M�todo para retornar o c�lculo de m�dia
	public double calculoDeMedia(){
		double media = (nota1+nota2+nota3)/3;
		return media;
	}
	
	//M�todo para retornar a situa��o do aluno
	public String situacaoAlunos(){
		String situacao = calculoDeMedia() >= 7 ? "Aprovado" : "Reprovado";
		return situacao;
	}
	
	public void exibirSituacao(){
		//Mensagem
		String msg = "*****Informa��es do Aluno*****";
				msg+= "\nSua m�dia � "+String.format("%.2f", calculoDeMedia());
				msg+= "\nSua situa��o � "+situacaoAlunos();
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
