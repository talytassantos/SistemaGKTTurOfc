package model.entities;

public class TipoServico {
	
	private String tipoServico;

	public TipoServico() {
		
	}

	public TipoServico(String tipoServico) {
		super();
		this.tipoServico = tipoServico;
	}

	public String getTipoServico() {
		return tipoServico;
	}

	public void setTipoServico(String tipoServico) {
		this.tipoServico = tipoServico;
	}

	@Override
	public String toString() {
		return "TipoServico [tipoServico=" + tipoServico + "]";
	}
	
}
