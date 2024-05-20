////////////////////////////////////////////////////////////////////
// [Marco] [Cola] [2079237]
// [Davide] [Martinelli] [2077679]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.HashMap;
import java.util.Map;

//stampa i numeri romani convertiti da IntegerToRoman in ASCII art
public class RomanPrinter {
    private static final String ONE_ASCII[] ={
            " _____ ",
            "|_   _|",
            "  | |  ",
            "  | |  ",
            " _| |_ ",
            "|_____|"
    };

    private static final String FIVE_ASCII[] ={
            "__      __",
            "\\ \\    / /",
            " \\ \\  / / ",
            "  \\ \\/ /  ",
            "   \\  /   ",
            "    \\/    "
    };

    private static final String TEN_ASCII[] ={
            "__   __ ",
            "\\ \\ / / ",
            " \\ V /  ",
            "  > <   ",
            " / . \\  ",
            "/_/ \\_\\ "
    };

    private static final String FIFTY_ASCII[] ={
            " _       ",
            "| |      ",
            "| |      ",
            "| |      ",
            "| |____  ",
            "|______| "
    };

    private static final String HUNDRED_ASCII[] ={
            "  _____  ",
            " / ____| ",
            "| |      ",
            "| |      ",
            "| |____  ",
            " \\_____| "
    };

    private static final String FIVE_HUNDREDS_ASCII[] ={
            " _____   ",
            "|  __ \\  ",
            "| |  | | ",
            "| |  | | ",
            "| |__| | ",
            "|_____/  "
    };

    private static final String THOUSAND_ASCII[] ={
            " __  __  ",
            "|  \\/  | ",
            "| \\  / | ",
            "| |\\/| | ",
            "| |  | | ",
            "|_|  |_| "
    };

    private static final Map<Character, String[]> romanToAscii =
            new HashMap<>();

    static {
        romanToAscii.put('I', ONE_ASCII);
        romanToAscii.put('V', FIVE_ASCII);
        romanToAscii.put('X', TEN_ASCII);
        romanToAscii.put('L', FIFTY_ASCII);
        romanToAscii.put('C', HUNDRED_ASCII);
        romanToAscii.put('D', FIVE_HUNDREDS_ASCII);
        romanToAscii.put('M', THOUSAND_ASCII);
    }

    public static String print(int num){
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        String result = "";
        String[] lines = new String[]{"", "", "", "", "", ""};

        for (char ch : romanNumber.toCharArray()) {
            String[] art = romanToAscii.get(ch);
            for (int i = 0; i < lines.length; i++) {
                lines[i] += art[i] ;
            }
        }

        for (String line : lines) {
            result += line + "\n";
        }

        return result;
    }
}
