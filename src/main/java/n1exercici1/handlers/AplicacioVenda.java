package n1exercici1.handlers;

import java.util.ArrayList;
import java.util.List;

import n1exercici1.beans.Producte;
import n1exercici1.beans.Venda;
import n1exercici1.exceptions.VendaBuidaException;

public class AplicacioVenda {
	
	Producte[] productes = null;
	List<Venda> vendas = null;
	

	public AplicacioVenda() {
		super();
		this.productes = new Producte[10];
		this.vendas = new ArrayList<Venda>();
	}
	
		
	public Producte[] getProductes() {
		return productes;
	}

	public void setProductes(Producte[] productes) {
		this.productes = productes;
	}

	public List<Venda> getVendas() {
		return vendas;
	}


	public void setVendas(List<Venda> vendas) {
		this.vendas = vendas;
	}


	private void generarArrayProductes() {
		
		Producte producte1 = new Producte("Barra de pan", 1);
		Producte producte2 = new Producte("Brioche", 2);
		Producte producte3 = new Producte("Pan de pagés", 2);
		Producte producte4 = new Producte("Ensaïmada gran", 7);
		Producte producte5 = new Producte("Pastís formatge", 6);
		
		productes[0] = producte1;
		productes[1] = producte2;
		productes[2] = producte3;
		productes[3] = producte4;
		productes[4] = producte5;
	}
	
	 private void afegirArrayProductes(int posicio, Producte p) {
		
		try {
			productes[posicio] = p;
				
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}	
	}
	
	public void afegirVendaProductes(Venda venda) {
		
		generarArrayProductes();
		venda.getVendaProductes().add(productes[1]);
		venda.getVendaProductes().add(productes[2]);
		
	}
	
	public void executarAplicacio() {
		
		Venda venda = new Venda();
		Venda venda1 = new Venda();
		Producte producte6 = new Producte("Base pizza", 2);
		
		
		try {
			venda.calcularVenda();	
		}catch (VendaBuidaException e) {
			System.out.println(e.getMessage());
		}
		
		afegirArrayProductes(100, producte6);
		
		try {
			afegirVendaProductes(venda1);
			System.out.println(venda1.calcularVenda());
		}catch (VendaBuidaException e) {
			System.out.println(e.getMessage());
		}		
	}		
}


