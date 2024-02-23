package projeto.alura.modelo;

import java.util.ArrayList;
import java.util.List;

public class Cartao {
	
	private double limiteCartao;
	private double saldo;
	private List<Compra> compras = new ArrayList<>();
	
	public Cartao(double limite) {
		limiteCartao = limite;
		saldo = limite;
	}
	
	public boolean realizarCompra(Compra compra) {
		if(compra.getValor() > saldo) {
			return false;
		}
		saldo -= compra.getValor();
		compras.add(compra);
		return true;
	}
	
	public double getLimite() {
		return limiteCartao;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public List<Compra> getCompras() {
		return compras;
	}
	
}
