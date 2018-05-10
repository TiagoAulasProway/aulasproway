package exercicio01;

import javax.swing.JOptionPane;

public class Funcionarios {
	String nome;
	int idade;
	int maiorDe18, menorDe18;
	Object variavel1 = new Object();
	Object[] genero = {"Masculino", "Feminino"};
	int masculino = 0, feminino = 0;
	Object variavel2 = new Object();
	Object[] cargo = {"Gerente", "Atendente", "Açougueiro", "Secretária", "Almoxarife", "Padeiro", "Estagiário"};
	int gerente = 0, atendente = 0, acougueiro = 0, secretaria = 0, almoxarife = 0, padeiro = 0, estagiario = 0;
	
	public void laco(){
		int continuar = 0;
		do{
			validarNome();
			perguntas();
			somaGenero();
			somaCargo();
			somaIdade();
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "", 0);
		}while(continuar == 0);
		exibir();
	}
	
	public void validarNome(){
		boolean valida = false;
		do{
			nome = JOptionPane.showInputDialog("Informe a nome do funcionário:");
			if(nome.equals("")){
				JOptionPane.showMessageDialog(null, "O campo não pode estar vazio.");
			}else{
				valida = true;
			}
		}while(valida == false);
	}

	public void perguntas(){
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do funcionário:"));
		variavel1 = JOptionPane.showInputDialog(null, "Informe o gênero do funcionário:", "\n", JOptionPane.PLAIN_MESSAGE, null, genero, "");
		variavel2 = JOptionPane.showInputDialog(null, "Informe o cargo do funcionário:", "\n", JOptionPane.PLAIN_MESSAGE, null, cargo, "");
	}

	public void somaGenero(){
		if(variavel1.equals("Masculino")){
            masculino++;
        }else{
            feminino++;
        }
	}

	public void somaCargo(){
		if(variavel2.equals("Gerente")){
            gerente++;
        }else if(variavel2.equals("Atendente")){
            atendente++;
        }else if(variavel2.equals("Açougueiro")){
            acougueiro++;
        }else if(variavel2.equals("Secretária")){
            secretaria++;
        }else if(variavel2.equals("Almoxarife")){
            almoxarife++;
        }else if(variavel2.equals("Padeiro")){
            padeiro++;
        }else{
            estagiario++;
        }
	}

	public void somaIdade(){
		if(idade >= 18){
            maiorDe18++;
        }else{
        	menorDe18++;
        }
	}
                
	public void exibir(){
		String msg = "*****FUNCIONÁRIOS*****";
				msg+= "\n\nGênero:";
				msg+= "\nMasculino - "+masculino;
				msg+= "\nFeminino - "+feminino;
				msg+= "\n\nMaiores de 18: "+maiorDe18;
				msg+= "\nMenores de 18: "+menorDe18;
				msg+= "\n\nCargo:";
				msg+= "\nGerente - "+gerente;
				msg+="\nAtendente - "+atendente;
				msg+="\nAçougueiro - "+acougueiro;
				msg+="\nSecretária - "+secretaria;
				msg+="\nAlmoxarife - "+almoxarife;
				msg+="\nPadeiro - "+padeiro;
				msg+="\nEstagiário - "+estagiario;
		JOptionPane.showMessageDialog(null, msg);
	}

}
