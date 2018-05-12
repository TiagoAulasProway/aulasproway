package exercicio02;

import javax.swing.JOptionPane;

public class Jogadores {
	int indice = 0;
	String[] nome = new String[10];
	int[] idade = new int[10];
	double[] altura = new double[10];
	double somaAlturas = 0;
	double[] peso = new double [10];
	//Maior idade [0], maior altura [1], maior peso [2] 
	int[] maiores = new int [3];
	String msg = "";

	public void laco(){
		int continuar = 0;
		do{
			nome();		
			idade();
			altura();
			peso();
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "", 0);
			if(continuar == 0){
				indice++;
			}
		}while(continuar == 0);
		maiorIdade();
		maiorAltura();
		maiorPeso();
		String exibir = mensagem();
		JOptionPane.showMessageDialog(null, exibir);
	}
	
	public void nome(){
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
	
	public void idade(){
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
	
	public void altura(){
		boolean valida = false;
		do{
			altura[indice] = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura do jogador:"));
			if(altura[indice] <= 0){
				JOptionPane.showMessageDialog(null, "Altura inválida.");
			}else{
				somaAlturas += altura[indice];
				valida = true;
			}
		}while(valida == false);
	}
	
	public void peso(){
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
	
	public void maiorIdade(){
		int maiorIdade = 0;
		for(int i = 0; i < idade.length; i++){
			if(idade[i] > maiorIdade){
				maiorIdade = idade[i];
				maiores[0] = i;
			}
		}
	}
	
	public void maiorAltura(){
		double maiorAltura = 0;
		for(int i = 0; i < altura.length; i++){
			if(altura[i] > maiorAltura){
				maiorAltura = altura[i];
				maiores[1] = i;
			}
		}
	}
	
	public void maiorPeso(){
		double maiorPeso = 0;
		for(int i = 0; i < peso.length; i++){
			if(peso[i] > maiorPeso){
				maiorPeso = peso[i];
				maiores[2] = i;
			}
		}
	}
	
	public String mensagem(){
		String msg = "JOGADORES CADASTRADOS: "+indice+"\n\n";
			msg+= nome[maiores[0]]+" é o mais velho com "+idade[maiores[0]]+"\n";
			msg+= nome[maiores[1]]+" é o mais alto com "+altura[maiores[1]]+"\n";
			msg+= nome[maiores[2]]+" é o mais pesado com "+peso[maiores[2]]+"\n\n";
			msg+= "A média das alturas é"+((somaAlturas)/indice);
		return msg;
	}
}
