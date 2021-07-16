import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { Prodotto } from './prodotto';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  prodotto: Prodotto = new Prodotto();
  prodotti: Prodotto[] = [{nome: "pane"}, {nome: "pera"}];

  constructor (private http:HttpClient){

    let ox: Observable<Prodotto[]> = http.get<Prodotto[]>("localhost:8080/listaProdotti")
    ox.subscribe(u => this.prodotti = u);
  }

  aggiungi(){
    console.log('siamo in aggiungi');
  }

  rimuovi(){
    console.log('siamo in rimuovi',this.prodotto);
  }
}
