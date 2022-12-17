public class User {
    private String imie;
    private String nazwisko;
    private String wiek;
    private String pesel;
    private String mail;
    private String haslo;
    private String adres;
    private String wojedzodztwo;
    private String kraj;

    private User(String imie, String nazwisko, String wiek, String pesel, String mail, String haslo, String adres, String wojedzodztwo, String kraj) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.pesel = pesel;
        this.mail = mail;
        this.haslo = haslo;
        this.adres = adres;
        this.wojedzodztwo = wojedzodztwo;
        this.kraj = kraj;
    }
    public static class Builder{
        private String imie;
        private String nazwisko;
        private String wiek;
        private String pesel;
        private String mail;
        private String haslo;
        private String adres;
        private String wojedzodztwo;
        private String kraj;

        public Builder(){

        }

        public Builder setImie(String imie) {
            this.imie = imie;
            return this;
        }

        public Builder setNazwisko(String nazwisko) {
            this.nazwisko = nazwisko;
            return this;
        }

        public Builder setWiek(String wiek) {
            this.wiek = wiek;
            return this;
        }

        public Builder setPesel(String pesel) {
            this.pesel = pesel;
            return this;
        }

        public Builder setMail(String mail) {
            this.mail = mail;
            return this;
        }

        public Builder setHaslo(String haslo) {
            this.haslo = haslo;
            return this;
        }

        public Builder setAdres(String adres) {
            this.adres = adres;
            return this;
        }

        public Builder setWojedzodztwo(String wojedzodztwo) {
            this.wojedzodztwo = wojedzodztwo;
            return this;
        }

        public Builder setKraj(String kraj) {
            this.kraj = kraj;
            return this;
        }
        public User build(){
            return  new User("mariusz")
        }
    }
}
