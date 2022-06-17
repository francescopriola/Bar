package it.polito.tdp.bar.model;

public class Statistiche {
	
	private int clientiTot;
	private int clientiSoddisfatti;
	private int clientiInsoddisfatti;
	
	public Statistiche() {
		super();
		this.clientiTot = 0;
		this.clientiSoddisfatti = 0;
		this.clientiInsoddisfatti = 0;
	}

	public void IncrementaClienti(int n) {
		this.clientiTot += n;
	}
	
	public void IncrementaSoddisfatti(int n) {
		this.clientiSoddisfatti += n;
	}
	
	public void IncrementaInsoddisfatti(int n) {
		this.clientiInsoddisfatti += n;
	}

	public int getClientiTot() {
		return clientiTot;
	}

	public int getClientiSoddisfatti() {
		return clientiSoddisfatti;
	}

	public int getClientiInsoddisfatti() {
		return clientiInsoddisfatti;
	}
	
	

}
