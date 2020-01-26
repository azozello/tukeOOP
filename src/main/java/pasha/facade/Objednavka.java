package pasha.facade;

public class Objednavka {

    private Dodavatel dodavatel;
    private Tovar tovar;
    private int count;

    public Objednavka() {
    }

    public Objednavka(Dodavatel dodavatel, Tovar tovar, int count) {
        this.dodavatel = dodavatel;
        this.tovar = tovar;
        this.count = count;
    }

    public void objednaj() {
        System.out.println(
                this.dodavatel.getName() + " - " +
                this.tovar.getName() + " - " +
                this.tovar.getPrice() + " - " +
                this.count
        );
    }

    public Dodavatel getDodavatel() {
        return dodavatel;
    }

    public void setDodavatel(Dodavatel dodavatel) {
        this.dodavatel = dodavatel;
    }

    public Tovar getTovar() {
        return tovar;
    }

    public void setTovar(Tovar tovar) {
        this.tovar = tovar;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
