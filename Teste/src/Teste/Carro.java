package Teste;
public class Carro {
	String fabricante="Wolksvagen";
	int cod_fab=1234;

	public String toString(){
		return String.format("Fabricante: "+this.fabricante+"\nCodigo do Fabricante: "+this.cod_fab);
	}
}
