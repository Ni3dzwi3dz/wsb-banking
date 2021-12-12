# Pakiet Bankowy
***
Projekt zaliczeniowy z przedmiotu Projektowanie Obiektowe  
Prowadzący dr inż. Piotr Bobiński  

## Wykorzystane biblioteki:

### Testy:
* JUnit 4.13

## Do dopisania

### Konto:
* Numer konta, zastanowić się, gdzie powinien być generowany (dwie opcje - 
przy tworzeniu konta, albo jako obowiązkowy argument konstruktora, tworzony 
w klasie banku - wtedy konstruktor bezargumentowy powinien być prywatny)

* Dopisanie subklas - SavingsAccount i CheckingAccount  
* Zmiana typu metod deposit i withdraw na boolean (przemyśleć, czy zasadne)


### Klient
* Umożliwić klientowi założenie kilku kont
* Jeśli możliwe będzie posiadanie kilku kont - przepisać metodę get account,
dopisać getTotalBalance, zastanowić się jak rozgrywać wpłaty
* Może jakiś identyfikator klienta
