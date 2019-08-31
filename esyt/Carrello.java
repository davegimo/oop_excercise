public class Carrello implements InterfacciaCarrello {

    public Vector<Prodotto> carrello;

    public Carrello() {
        carrello = new Vector<Prodotto>();
    }

    public void aggiungi(Prodotto p) {
        carrello.add(p);
    }

    public void rimuovi(Prodotto p) {

        for (int i = 0; i < carrello.size(); i++) {
            if (carrello.get(i).titolo == p.titolo) {
                carrello.remove(i);
            }
        }
    }


    public int numeroOggetti() {
        return carrello.size();
    }

    public double prezzoTotale() {

        double prezzoTot = 0;

        for (int i = 0; i < carrello.size(); i++) {
            prezzoTot += carrello.get(i).prezzo;
        }

        return prezzoTot;

    } 

    public double prezzoMedio() {

        double prezzoMedio = prezzoTotale();
        prezzoMedio = prezzoMedio / carrello.size();

        return prezzoMedio;

    }
    public double peso() {

        double pesotot = 0;

        for (int i = 0; i < carrello.size(); i++) {
            pesotot += carrello.get(i).peso;
        }

        return peso;
    }

    public boolean contenutoFragile() {

        for (int i = 0; i < carrello.size(); i++) {
            if (carrello.get(i).contenutoFragile == true) {
                return true;
            }
        }

        return false;

    }
    public Vector<Persona> getAutoriCoinvolti() {

        Vector<Persona> v = new Vector<Persona>();

        for (int i = 0; i < carrello.size(); i++) {
            for (int j = 0; j < carrello.get(i).autori.size(); j++) {

                if (!v.contains(carrello.get(i).autori.get(j))) {
                    v.add(carrello.get(i).autori.get(j));
                }
            }
        }

        return v;
    }

}