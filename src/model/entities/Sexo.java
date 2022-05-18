package model.entities;

import java.io.Serializable;

public class Sexo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String abrevSexo;
	private String sexo;
	
	public Sexo() {
		
	}

	public Sexo(Integer id, String abrevSexo, String sexo) {
		super();
		this.id = id;
		this.abrevSexo = abrevSexo;
		this.sexo = sexo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAbrevSexo() {
		return abrevSexo;
	}

	public void setAbrevSexo(String abrevSexo) {
		this.abrevSexo = abrevSexo;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Sexo [id=" + id + ", abrevSexo=" + abrevSexo + ", sexo=" + sexo + "]";
	}
	
}
