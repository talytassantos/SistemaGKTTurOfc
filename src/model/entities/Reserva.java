package model.entities;

import java.util.Date;

public class Reserva {
	
	private int idReserva;
	private Date resEntrada;
	private Date resSaida;
	private String acomodacao;
	
	public Reserva() {
		
	}

	public Reserva(int idReserva, Date resEntrada, Date resSaida, String acomodacao) {
		super();
		this.idReserva = idReserva;
		this.resEntrada = resEntrada;
		this.resSaida = resSaida;
		this.acomodacao = acomodacao;
	}

	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public Date getResEntrada() {
		return resEntrada;
	}

	public void setResEntrada(Date resEntrada) {
		this.resEntrada = resEntrada;
	}

	public Date getResSaida() {
		return resSaida;
	}

	public void setResSaida(Date resSaida) {
		this.resSaida = resSaida;
	}

	public String getAcomodacao() {
		return acomodacao;
	}

	public void setAcomodacao(String acomodacao) {
		this.acomodacao = acomodacao;
	}

	@Override
	public String toString() {
		return "Reserva [idReserva=" + idReserva + ", resEntrada=" + resEntrada + ", resSaida=" + resSaida
				+ ", acomodacao=" + acomodacao + "]";
	}


}
