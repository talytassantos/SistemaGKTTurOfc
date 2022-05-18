package model.entities;

import java.io.Serializable;
import java.util.Date;

public class Cliente implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int idCliente;
	private int cpf;
	private int rg;
	private char sexo;
	private Date dataNascimento;
	private String nome;
	private int cep;
	private String logradouro;
	private char numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String uf;
	private int telefone;
	private String email;
	private int ativo; //Não seria melhor se fosse boolean status, 1=ativo e 0=inativo  

	public Cliente() {
		
	}

	public Cliente(int idCliente, int cpf, int rg, char sexo, Date dataNascimento, String nome, int cep,
			String logradouro, char numero, String complemento, String bairro, String cidade, String uf, int telefone,
			String email, int ativo) {
		super();
		this.idCliente = idCliente;
		this.cpf = cpf;
		this.rg = rg;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.nome = nome;
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.telefone = telefone;
		this.email = email;
		this.ativo = ativo;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public char getNumero() {
		return numero;
	}

	public void setNumero(char numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAtivo() {
		return ativo;
	}

	public void setAtivo(int ativo) {
		this.ativo = ativo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", cpf=" + cpf + ", rg=" + rg + ", sexo=" + sexo
				+ ", dataNascimento=" + dataNascimento + ", nome=" + nome + ", cep=" + cep + ", logradouro="
				+ logradouro + ", numero=" + numero + ", complemento=" + complemento + ", bairro=" + bairro
				+ ", cidade=" + cidade + ", uf=" + uf + ", telefone=" + telefone + ", email=" + email + ", ativo="
				+ ativo + "]";
	}
	
	

	
}
