public class NumberIdentifier {
    private final static String romanNumber = "I II III IV V VI VII VIII IX X + - * /";
    private final static String arabicNumber = "1 2 3 4 5 6 7 8 9 10 + - * /";
    public static boolean isArabicNumber(String number){
        for(int i = 0; i < number.length(); i++){
            if(arabicNumber.indexOf(number.charAt(i)) == -1){
                return false;
            }
        }
        return true;
    }
    public static boolean isRomanNumber(String number){
        for(int i = 0; i < number.length(); i++){
            if(romanNumber.indexOf(number.charAt(i)) == -1){
                return false;
            }
        }
        return true;
    }
}
