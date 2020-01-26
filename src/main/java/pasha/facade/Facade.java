package pasha.facade;

public class Facade {

    public void objednaj(String dodavatelName, String tovarlName, double price, int count) {
        Dodavatel dodavatel = new Dodavatel(dodavatelName);
        Tovar tovar = new Tovar(tovarlName, price);
        Objednavka objednavka = new Objednavka(dodavatel, tovar, count);
        objednavka.objednaj();
    }
}
