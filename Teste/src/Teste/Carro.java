package Teste;
public class Carro {
	String nome;
	int preco;

	public Carro(String nome, int preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String toString(){
		return String.format("Nome: "+this.nome+" Preco: "+this.preco);
	}

}
