////////////////////////////////////////////////////////////////////
// [Marco] [Cola] [2079237]
// [Davide] [Martinelli] [2077679]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

//Conversione numeri interi in numeri romani
public class IntegerToRoman {

    private static String[] ones =
            {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    private static String[] tens =
            {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    private static String[] hundreds =
            {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    private static String[] thousands =
            {"", "M"};

    public static String convert(int number) {

        if (number < 1 || number > 1000) {
            throw new IllegalArgumentException(
                    "Il numero deve essere compreso tra 1 e 1000."
            );
        }

        String thousandsDigits = thousands[number / 1000];
        String hundredsDigits = hundreds[(number % 1000) / 100];
        String tensDigits = tens[(number % 100) / 10];
        String onesDigits = ones[number % 10];

        return thousandsDigits+hundredsDigits+tensDigits+onesDigits;
    }
}
