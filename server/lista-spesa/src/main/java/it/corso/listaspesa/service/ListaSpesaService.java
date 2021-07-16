package it.corso.listaspesa.service;

import java.util.List;

public interface ListaSpesaService{
	List<Prodotto> aggiungi(Prodotto p);

	List<Prodotto> rimuovi(Prodotto p);
	
	List<Prodotto> tuttiProdotti();
}
