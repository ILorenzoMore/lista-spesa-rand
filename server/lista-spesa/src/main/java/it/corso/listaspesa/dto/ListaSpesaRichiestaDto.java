package it.corso.listaspesa.dto;

public class ListaSpesaRichiestaDto{
	Prodotto prodotto;

	public Prodotto getProdotto(){
		return this.prodotto;
	}

	public void setProdotto(Prodotto prodotto){
		this.prodotto = prodotto;
	}
}
