package Teste;
public class Unidade extends Carro {
	String nome;
	double preco;

	Unidade(String nome, double preco){
		this.nome = nome;
		this.preco = preco;
	}
	
	public String toString(){
		return String.format("Fabricante: "+this.fabricante+" Codigo do Fabricante: "+this.cod_fab
				+"\nNome: "+this.nome+" Preco: "+this.preco);
	}

}
