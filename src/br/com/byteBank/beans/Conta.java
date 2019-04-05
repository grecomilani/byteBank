package br.com.byteBank.beans;

public class Conta {

	private double saldo;
	private int agencia;
	private int conta;
	private Cliente titular; 
	
	public void deposita(double valor){
		this.saldo = saldo + valor;
	}
	
	public boolean saca(double valor) {
		
		if(this.saldo >= valor) {
			
			this.saldo -= valor;
			return true;
			
		}else {
			return false;
		}
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
}
 