public interface InterfacciaCarrello { 
    public void aggiungi(Prodotto p); 
    public void rimuovi(Prodotto p); 
    public int numeroOggetti(); 
    public double prezzoTotale(); 
    public double prezzoMedio(); 
    public double peso();
    public boolean contenutoFragile();
    public Vector<Persona> getAutoriCoinvolti(); 

}
    