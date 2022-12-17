public class Main {
    public static void main(String[] args) {
        User.Builder user = new User.Builder().setAdres("Inkwizycji").setHaslo("jojo292").setMail("marian@.gmail.com").setKraj("POLAND").setPesel("187276256").setWiek("23").setWojedzodztwo("lubelskie").setImie("Marian").setNazwisko("Dulkad");

        Sklep sklep = new Sklep.Builders()
                .setId("12")
                        .setNazwa("lidl")
                .setMiejscowosc("WWA")
                .setAdres("as12")
                .setKodPocztowy("12-345")
                .setWojewodtwo("mazowieckie")
                .setKraj("PL")
                .builds();


    }


}