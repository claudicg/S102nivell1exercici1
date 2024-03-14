package n1exercici1.beans;

public class Producte {
	
	private String nom;
	private int preu;
	
	
	public Producte() {
		
	}
	
	public Producte(String nom, int preu) {
		super();
		this.nom = nom;
		this.preu = preu;
	}

	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPreu() {
		return preu;
	}

	public void setPreu(int preu) {
		this.preu = preu;
	}

	@Override
	public String toString() {
		return "Producte [nom=" + nom + ", preu=" + preu + "]";
	}
	
	
}
