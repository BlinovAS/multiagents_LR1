import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
            if (NumberIdentifier.isRomanNumber(number)) {
                RomanCalcs romanCalcs = new RomanCalcs();
                romanCalcs.calculate(number);
            } else if (NumberIdentifier.isArabicNumber(number)) {
                ArabicCalcs arabicCalcs = new ArabicCalcs();
                arabicCalcs.calculate(number);
            } else {
                System.out.println("Допустимы только римские и арабские числа");
            }
        }
}
