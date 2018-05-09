package exemplo3;

import javax.swing.JOptionPane;

public class Carro {

	//Atributos
	String[] nomeCarro = new String[5];
	double[] valorCarro = new double[5];
	
	//Método para retornar a posição livre do vetor
	public int posicaoLivre(){
		int posicao = 0;
		for(int i = 0; i < nomeCarro.length; i++){
			if(nomeCarro[i] == null){
				posicao = i;
				break;
			}
		}
		return posicao;
	}
	
	//Realizar perguntas
	public void perguntas(){
		//Obter a posição
		int posicao = posicaoLivre();
		nomeCarro[posicao] = JOptionPane.showInputDialog("Informe o carro");
		valorCarro[posicao] = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor"));
	}
	
	//Laço
	public void laco(){
		//Verificar
		int continuar = 0;
		do{
			perguntas();
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "", 0);
		}while(continuar == 0);
		ordenar();
		exibir();
	}
	
	//Método de ordenação
	public void ordenar(){
		String nomeMaiorCarro;
		double valorMaiorCarro;
		//Laço principal
		for(int i1 = 0; i1 < nomeCarro.length -1; i1++){
			for(int i2 = 0; i2 < nomeCarro.length; i2++){
				if(valorCarro[i2] < valorCarro[i1]){
					nomeMaiorCarro = nomeCarro[i1];
					nomeCarro[i1] = nomeCarro[i2];
					nomeCarro[i2] = nomeMaiorCarro;
					
					valorMaiorCarro = valorCarro[i1];
					valorCarro[i1] = valorCarro[i2];
					valorCarro[i2] = valorMaiorCarro;
				}					
			}
		}
	}
	
	//Método para exibir
	public void exibir(){
		String msg = "*****CARROS CADASTRADOS*****";
		for(int i = 0; i < nomeCarro.length; i++){
			if(nomeCarro[i] != null){
				msg += "\n"+nomeCarro[i]+" "+valorCarro[i];
			}
		}
		JOptionPane.showMessageDialog(null, msg);
	}
}
