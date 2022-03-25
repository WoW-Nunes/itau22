package br.com.itau.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;

// criei duas anotações, uma será para armazenar e a outra a tabela
@Entity
@Table(name="itauprojct")
public class InfosConta {
	// Definir atraves de uma anotação os campos existentes da nossa tabela
	@Id
	
	// criando os campos
	@Column(name="ag")
	private int ag;
	
	@Column(name="conta")
	private int conta;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="email")
	private String email;
	
	@Column(name="telefone")
	private String telefone;
	
	@Column(name="saldo")
	private double saldo;
	
	// fluxo caixa
	
	@Column(name="fluxo")
	private int fluxo;
	
	@Column(name="entrada")
	private double entrada;
	
	@Column(name="saida")
	private double saida;

	public int getAg() {
		return ag;
	}

	public void setAg(int ag) {
		this.ag = ag;
	}
 
	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getFluxo() {
		return fluxo;
	}

	public void setFluxo(int fluxo) {
		this.fluxo = fluxo;
	}

	public double getEntrada() {
		return entrada;
	}

	public void setEntrada(double entrada) {
		this.entrada = entrada;
	}

	public double getSaida() {
		return saida;
	}

	public void setSaida(double saida) {
		this.saida = saida;
	}
	
	
}
