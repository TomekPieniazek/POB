public class Zwierze {
    protected int wiek = 0;
    protected int ileNog = 0;
    protected String glos = "";
    protected String imie = "";

    public Zwierze(int wiek, String imie) {
        this.wiek = wiek;
        this.imie = imie;
    }

    public String getImie() {
        return this.imie;
    }

    public int getIleNog() {
        return this.ileNog;
    }

    public int getWiek() {
        return this.wiek;
    }
    public String dajGlos() {
        return this.glos;
    }
}
