public class Prodotto {
    
    public String titolo;
    public double prezzo;
    public double iva;
    public boolean fragile;
    public double peso;

    public Vector<Persona> autori;

    public Prodotto(String t, double p, double i, boolean f, double peso_, Vector<Persona> a) {

        titolo = t;
        prezzo = p;
        iva = i;
        fragile = f;
        peso = peso_;

        autori = a;
    }

}