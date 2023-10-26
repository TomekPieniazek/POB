import java.util.List;
import java.util.ArrayList;
public class Panstwo {
    protected Kontynent kontynent;
    protected int liczbaLudnosci;
    protected String stolica;
    protected List<Panstwo> sasiedzi;

    public Panstwo(Kontynent kontynent, int liczbaLudnosci, String stolica) {
        this.kontynent = kontynent;
        this.liczbaLudnosci = liczbaLudnosci;
        this.stolica = stolica;
        this.sasiedzi = new ArrayList<>();
    }

    public Kontynent getKontynent() {
        return kontynent;
    }

    public int getLiczbaLudnosci() {
        return liczbaLudnosci;
    }

    public String getStolica() {
        return stolica;
    }

    public List<Panstwo> getSasiedzi() {
        return sasiedzi;
    }

    public void dodajSasiada(Panstwo sasiad) {
        this.sasiedzi.add(sasiad);
    }

    public void migruj(Panstwo cel, int liczbaMigrantow) {
        if (this.liczbaLudnosci >= liczbaMigrantow) {
            this.liczbaLudnosci -= liczbaMigrantow;
            cel.liczbaLudnosci += liczbaMigrantow;
        }
    }

}
