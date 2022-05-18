package model.entities;

public class Quarto {
	
	private int numeroQuarto;
	private String tipoQuarto;

	public Quarto() {
		
	}

	public Quarto(int numeroQuarto, String tipoQuarto) {
		super();
		this.numeroQuarto = numeroQuarto;
		this.tipoQuarto = tipoQuarto;
	}

	public int getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(int numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public String getTipoQuarto() {
		return tipoQuarto;
	}

	public void setTipoQuarto(String tipoQuarto) {
		this.tipoQuarto = tipoQuarto;
	}

	@Override
	public String toString() {
		return "Quarto [numeroQuarto=" + numeroQuarto + ", tipoQuarto=" + tipoQuarto + "]";
	}
	
	
}
