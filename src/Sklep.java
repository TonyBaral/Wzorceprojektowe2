public class Sklep {
    private String id;
    private String nazwa;
    private String miejscowosc;
    private String adres;
    private String kodPocztowy;
    private String wojewodtwo;
    private String kraj;

    public Sklep(String id, String nazwa, String miejscowosc, String adres, String kodPocztowy, String wojewodtwo, String kraj) {
        this.id = id;
        this.nazwa = nazwa;
        this.miejscowosc = miejscowosc;
        this.adres = adres;
        this.kodPocztowy = kodPocztowy;
        this.wojewodtwo = wojewodtwo;
        this.kraj = kraj;
    }

    @Override
    public String toString() {
        return "Sklep{" +
                "id='" + id + '\'' +
                ", nazwa='" + nazwa + '\'' +
                ", miejscowosc='" + miejscowosc + '\'' +
                ", adres='" + adres + '\'' +
                ", kodPocztowy='" + kodPocztowy + '\'' +
                ", wojewodtwo='" + wojewodtwo + '\'' +
                ", kraj='" + kraj + '\'' +
                '}';
    }

    public static class Builders {
        private String id;
        private String nazwa;
        private String miejscowosc;
        private String adres;
        private String kodPocztowy;
        private String wojewodtwo;
        private String kraj;

        public Builders() {

        }

        public Builders setId(String id) {
            this.id = id;
            return this;
        }

        public Builders setNazwa(String nazwa) {
            this.nazwa = nazwa;
            return this;
        }

        public Builders setMiejscowosc(String miejscowosc) {
            this.miejscowosc = miejscowosc;
            return this;
        }

        public Builders setAdres(String adres) {
            this.adres = adres;
            return this;
        }

        public Builders setKodPocztowy(String kodPocztowy) {
            this.kodPocztowy = kodPocztowy;
            return this;
        }

        public Builders setWojewodtwo(String wojewodtwo) {
            this.wojewodtwo = wojewodtwo;
            return this;
        }

        public Builders setKraj(String kraj) {
            this.kraj = kraj;
            return this;
        }
        public Sklep builds(){
            return new Sklep(id,nazwa,miejscowosc,adres,kodPocztowy,wojewodtwo,kraj);
        }
    }
}
