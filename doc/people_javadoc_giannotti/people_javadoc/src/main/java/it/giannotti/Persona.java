package it.giannotti;

/**
 * <p>
 * La classe Persona aiuta la sviluppatore a gestire dati di tipo Persona
 * </p>
 */
public class Persona {
    private String nome, cognome, codice;

    /**
     * <p>
     * Costruisce un oggetto dato il nome, il cognome e il codice fiscale
     * (trasformato in automatico in maiuscolo). Se CF non e' valido, viene lanciata
     * un'eccezione.
     * </p>
     * <p>
     * <b>CONTROLLO sul CODICE FISCALE:</b>
     * </p>
     * <ul>
     * <li>Il codice deve contenere 16 caratteri alfanumerici</li>
     * <li>Il codice non deve contenere spazi</li>
     * <li>I primi 6 caratteri devono essere delle consonanti</li>
     * <li>Settimo e ottavo carattere devono essere numeri</li>
     * </ul>
     * Consulta la <a href=
     * "https://docs.oracle.com/javase/7/docs/api/java/lang/String.html">Documentazione
     * ufficiale String</a>
     * 
     * @param nome    stringa qualsiasi da assegnare come nome di un nuovo oggetto
     *                Persona
     * @param cognome stringa qualsiasi da assegnare come cognome di un nuovo
     *                oggetto Persona
     * @param codice  stringa che rappresenta il nuovo codice fiscale dell'oggetto
     *                Persona
     * @throws IllegalArgumentException Se il codice fiscale fornito non è valido
     */
    public Persona(String nome, String cognome, String codice) throws IllegalArgumentException {
        this.nome = nome;
        this.cognome = cognome;
        this.codice = codice;
        if (!controllaCodice()) {
            throw new IllegalArgumentException();
        }
    }

    private boolean controllaCodice() {
        return this.codice.matches("^[A-Z]{6}[0-9]{2}[A-Z][0-9]{2}[A-Z][0-9]{3}[A-Z]$");
    }

    /**
     * <p>
     * restituisce una Stringa contenente il nome della persona
     * </p>
     * 
     * @return il nome di un oggetto Persona
     */
    public String getNome() {
        return nome;
    }

    /**
     * <p>
     * assegna una Stringa come nome di una persona
     * </p>
     * 
     * @param nome Stringa da assegnare come nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * <p>
     * restituisce una Stringa contenente il cognome della persona
     * </p>
     * 
     * @return il cognome di un oggetto Persona
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * <p>
     * assegna una Stringa come cognome di una persona
     * </p>
     * 
     * @param cognome nuova stringa da assegnare come cognome a un oggetto Persona
     *                già esistente
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * <p>
     * Il metodo stabilisce se due persone sono omonime; Restituisce un booleano:
     * VERO se le due persone hanno lo stesso nome (senza distinzione di maiuscole e
     * minuscole) altrimenti FALSO
     * </p>
     * 
     * @param p oggetto Persona
     * @return Vero se le due persone confrontate hanno lo stesso nome, altrimenti
     *         falso
     */
    public boolean isOmonimo(Persona p) {
        return p.getNome().toLowerCase().equals(this.getNome().toLowerCase());
    }

    /**
     * <p>
     * Restituisce una rappresentazione testuale di un oggetto Persona,
     * nel seguente formato "NOME:xx COGNOME:xx CF:xx"
     * </p>
     * 
     * @return La rappresentazione testuale di un oggetto Persona
     */
    @Override
    public String toString() {
        return "NOME:" + nome + " COGNOME:" + cognome + " CF:" + codice;
    }
}
