package it.corso.listaspesa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.corso.listaspesa.service.ListaSpesaService;

@Service
public class ListaSpesaServiceImpl implements ListaSpesaService{
	@Autowired
	ProdottoRepository prodottoRepository;

	List<Prodotto> aggiungi(Prodotto p){
		if(p.getId != NULL) {
			prodottoRepository.save(p);
		}
		return tuttiProdotti();
	}

	List<Prodotto> rimuovi(Prodotto p){
		if(p.getId != NULL){
			prodottoRepository.deleteById(p.id);
		}
		return tuttiProdotti();
	}

	List<Prodotto> tuttiProdotti(){
		return prodottoRepository.findAll();
	}
}
