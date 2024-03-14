package n1exercici1.beans;

import java.util.ArrayList;
import java.util.List;

import n1exercici1.exceptions.VendaBuidaException;
import n1exercici1.utils.Constants;


public class Venda {
	
	private List<Producte> vendaProductes = null;
	private int preuTotalVenda = 0;
	
	
	public Venda() {
		super();
		this.vendaProductes = new ArrayList<>();
		
	}
	
	
	public List<Producte> getVendaProductes() {
		return vendaProductes;
	}
	public void setProductes(List<Producte> productes) {
		this.vendaProductes = productes;
	}
	public int getPreuTotalVenda() {
		return preuTotalVenda;
	}
	public void setPreuTotalVenda(int preuTotalVenda) {
		this.preuTotalVenda = preuTotalVenda;
	}
	
	public int calcularVenda() throws VendaBuidaException{
		
		if(vendaProductes.isEmpty()) {
			throw new VendaBuidaException(Constants.VENDA_BUIDA_EXCEPTION_TEXT);
		}
			
		for(Producte item : vendaProductes) {
			preuTotalVenda += item.getPreu();
		}
		
		return preuTotalVenda;
		
	}
	
	
	
}
