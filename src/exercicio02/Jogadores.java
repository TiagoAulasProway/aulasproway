package exercicio02;

import javax.swing.JOptionPane;

public class Jogadores {
	int indice = 0;
	String[] nome = new String[10];
	int[] idade = new int[10];
	int maiorIdade = 0;
	double[] altura = new double[10];
	double maiorAltura = 0;
	double[] peso = new double [10];
	double maiorPeso = 0;

	public void laco(){
		int continuar = 0;
		do{
			validarNome();		
			validarIdade();
			validarAltura();
			validarPeso();
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "", 0);
			if(continuar == 0){
				indice++;
			}
		}while(continuar == 0);
	}
	
	public void validarNome(){
		boolean valida = false;
		do{
			nome[indice] = JOptionPane.showInputDialog("Informe a nome do jogador:");
			if(nome[indice].equals("")){
				JOptionPane.showMessageDialog(null, "O campo não pode estar vazio.");
			}else{
				valida = true;
			}
		}while(valida == false);
	}
	
	public void validarIdade(){
		boolean valida = false;
		do{
			idade[indice] = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do jogador:"));
			if(idade[indice] <= 0){
				JOptionPane.showMessageDialog(null, "Idade inválida.");
			}else{
				valida = true;
			}
		}while(valida == false);
	}
	
	public void validarAltura(){
		boolean valida = false;
		do{
			altura[indice] = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura do jogador:"));
			if(altura[indice] <= 0){
				JOptionPane.showMessageDialog(null, "Altura inválida.");
			}else{
				valida = true;
			}
		}while(valida == false);
	}
	
	public void validarPeso(){
		boolean valida = false;
		do{
			peso[indice] = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso do jogador:"));
			if(peso[indice] <= 0){
				JOptionPane.showMessageDialog(null, "Peso inválido.");
			}else{
				valida = true;
			}
		}while(valida == false);
	}
}
