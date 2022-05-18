package model.entities;

public class Hotel {
	
	private int idHotel;
	private int cnpj;
	private String razaoSocial;
	private String nomeHotel;
	private int cep;
	private String logradouro;
	private char numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String uf;
	private int telefone;
	private String email;
	private String responsavel;
	private double avaliacao;
	private int ativo; //Não seria melhor se fosse boolean status, 1=ativo e 0=inativo  
	
	public Hotel() {
		
	}

	public Hotel(int idHotel, int cnpj, String razaoSocial, String nomeHotel, int cep, String logradouro, char numero,
			String complemento, String bairro, String cidade, String uf, int telefone, String email, String responsavel,
			double avaliacao, int ativo) {
		super();
		this.idHotel = idHotel;
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.nomeHotel = nomeHotel;
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.telefone = telefone;
		this.email = email;
		this.responsavel = responsavel;
		this.avaliacao = avaliacao;
		this.ativo = ativo;
	}

	public int getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeHotel() {
		return nomeHotel;
	}

	public void setNomeHotel(String nomeHotel) {
		this.nomeHotel = nomeHotel;
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

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public double getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(double avaliacao) {
		this.avaliacao = avaliacao;
	}

	public int getAtivo() {
		return ativo;
	}

	public void setAtivo(int ativo) {
		this.ativo = ativo;
	}

	@Override
	public String toString() {
		return "Hotel [idHotel=" + idHotel + ", cnpj=" + cnpj + ", razaoSocial=" + razaoSocial + ", nomeHotel="
				+ nomeHotel + ", cep=" + cep + ", logradouro=" + logradouro + ", numero=" + numero + ", complemento="
				+ complemento + ", bairro=" + bairro + ", cidade=" + cidade + ", uf=" + uf + ", telefone=" + telefone
				+ ", email=" + email + ", responsavel=" + responsavel + ", avaliacao=" + avaliacao + ", ativo=" + ativo
				+ "]";
	}	
}
