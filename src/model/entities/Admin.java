package model.entities;

public class Admin {
	
	private int admin;
	private String cargo;
	
	public Admin() {
		
	}

	public Admin(int admin, String cargo) {
		this.admin = admin;
		this.cargo = cargo;
	}

	public int getAdmin() {
		return admin;
	}

	public void setAdmin(int admin) {
		this.admin = admin;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Admin [admin=" + admin + ", cargo=" + cargo + "]";
	}

}
