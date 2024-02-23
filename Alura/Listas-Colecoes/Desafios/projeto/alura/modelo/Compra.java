package projeto.alura.modelo;

public class Compra implements Comparable<Compra>{
	
	private String descricao;
	private double valor;
	
	public Compra(String descricao, double valor) {
		this.descricao = descricao;
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}
	
	
	public String toString() {
		return this.getClass().getSimpleName() + ": " + descricao + " - R$ " + valor; 
	}


	@Override
	public int compareTo(Compra o) {
		if(this.getValor() > o.getValor()) return -1;
		if(this.getValor() < o.getValor()) return 1;
		return 0;
	}
}
