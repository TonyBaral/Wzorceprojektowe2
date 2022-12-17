import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Przychodnia extends Formularz {


    @Override
    protected void dodaj() {
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Wprowadz Imie: ");
            String imie = scan.nextLine();
            if (imie.equals("exist")) {
                break;
            }
            list.add(imie);
            System.out.println("Zawartość: ");
            for (String i : list) {
                System.out.println(i);
            }
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("lista.txt"))) {
                for (String i : list) {
                    writer.write(i);
                    writer.newLine();
                }
            } catch (IOException e) {
                System.out.println("Błąd");
            }

        }
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Wprowadz Nazwisko: ");
            String nazwisko = scan.nextLine();
            if (nazwisko.equals("exist")) {
                break;
            }
            list.add(nazwisko);
            System.out.println("Zawartość: ");
            for (String i : list) {
                System.out.println(i);
            }
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("lista.txt"))) {
                for (String i : list) {
                    writer.write(i);
                    writer.newLine();
                }
            } catch (IOException e) {
                System.out.println("Błąd");
            }
        }
    }
    @Override
    protected void wypisz() {}
}