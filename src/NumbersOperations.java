import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

class NumbersOperations {
        // main
        public static void main(String[] args) {
            List<Integer> userNumbers = getNumbersFromUser();
            List<Integer> positiveNumbers = filterNumbers(userNumber);
            List<Integer> negative = getIntegers(list);

            int sumaPositive = getSumaPositive(positiveNumbers);
            int sumaNegative = getSumaNegative(negative);
            extracted(sumaPositive, sumaNegative);
        }

        private static List<Integer> getNumbersFromUser() {
            Scanner scan = new Scanner(System.in);
            List<Integer> list = new ArrayList<>();
            System.out.println("Ile liczb wczytać?");
            int ileLiczbWczytac = scan.nextInt();
            for (int i = 0; i < ileLiczbWczytac; i++) {
                System.out.println("Podaj kolejną liczbę:");
                list.add(scan.nextInt());
            }
            return list;
        }
private static <List><Intiger> filterNumbers (List<Intiger>numbers, Predicate<Intiger>predicate){
            List<Intiger> filteredNumber = new ArrayList<>();
            for (int i = 0; i<numbers.size();i++){
                if(predicate.test(numbers.get(i)));
                if
            }
    }
        private static List<Integer> filterNumbers(List<Integer> list) {
            List<Integer> positive = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) >= 0)
                    positive.add(list.get(i));
            }
            return positive;
        }

        private static List<Integer> getIntegers(List<Integer> list) {
            List<Integer> negative = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) < 0)
                    negative.add(list.get(i));
            }
            return negative;
        }

        private static int getSumaPositive(List<Integer> positive) {
            int sumaPositive = 0;
            for (int i = 0; i < positive.size(); i++) {
                sumaPositive += positive.get(i);
            }
            return sumaPositive;
        }

        private static int getSumaNegative(List<Integer> negative) {
            int sumaNegative = 0;
            for (int i = 0; i < negative.size(); i++) {
                sumaNegative += negative.get(i);
            }
            return sumaNegative;
        }

        private static void extracted(int sumaPositive, int sumaNegative) {
            System.out.println("Suma wprowadzonych liczb dodatnich: " + sumaPositive);
            System.out.println("Suma wprowadzonych liczb ujemnych: " + sumaNegative);
        }
    }

