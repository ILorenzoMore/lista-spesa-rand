package it.corso.listaspesa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import it.corso.listaspesa.dto.ListaSpesaRichiestaDto;
import it.corso.listaspesa.dto.ListaSpesaRispostaDto;
import it.corso.listaspesa.service.ListaSpesaService;

@CrossOrigin("*")
@RestController
public class ListaSpesaController{
	@Autowired
	ListaSpesaService lss;

	@RequestMapping("/aggiungi")
	@ResponseBody
	public ListaSpesaRispostaDto aggiungi(@RequestBody ListaSpesaRichiestaDto dto){
		System.out.println("Service iniettato " + lss.getClass().getName());
		System.out.println("Entrato in aggiungi");
		System.out.println("Ricevuto dto " + dto);
		ListaSpesaRispostaDto risp = new ListaSpesaRispostaDto();
		risp.setListaSpesa(lss.aggiungi(dto.getProdotto()));
		return risp;
	}

	@RequestMapping("/rimuovi")
	@ResponseBody
	public ListaSpesaRispostaDto rimuovi(@RequestBody ListaSpesaRichiestaDto dto){
		System.out.println("Service iniettato " + lss.getClass().getName());
		System.out.println("Entrato in rimuovi");
		System.out.println("Ricevuto dto " + dto);
		ListaSpesaRispostaDto risp = new ListaSpesaRispostaDto();
		risp.setListaSpesa(lss.rimuovi(dto.getProdotto()));
		return risp;
	}

	@RequestMapping("/listaProdotti")
	@ResponseBody
	public ListaSpesaRispostaDto listaProdotti(@RequestBody ListaSpesaRichiestaDto dto){
		System.out.println("Service iniettato " + lss.getClass().getName());
		System.out.println("Entrato in lista prodotti");
		System.out.println("Ricevuto dto " + dto);
		ListaSpesaRispostaDto risp = new ListaSpesaRispostaDto();
		risp.setListaSpesa(lss.tuttiProdotti());
		return risp;
	}
}
