public abstract class Formularz {

    public final void formularz(){
        dodaj();
        wypisz();
    }
    protected abstract void dodaj();
    protected abstract void wypisz();
}
