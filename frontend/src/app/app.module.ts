import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule } from '@angular/router';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { HttpClientModule }    from '@angular/common/http';

import { AppComponent } from './app.component';
import { HeroesComponent } from './heroes/heroes.component';
import { TopBarComponent } from './top-bar/top-bar.component';
import { SearchComponent } from './search/search.component';
import { ProductListComponent } from './product-list/product-list.component';
import { ProductDtlComponent } from './product-dtl/product-dtl.component';
import { TitleListComponent } from './title-list/title-list.component';

@NgModule({
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      { path: '', component: ProductListComponent },
    ]),
  ],
  declarations: [
    AppComponent,
    HeroesComponent,
    TopBarComponent,
    SearchComponent,
    ProductListComponent,
    ProductDtlComponent,
    TitleListComponent
  ],
  bootstrap: [ AppComponent ]
})
export class AppModule { }