package ua.practice.converter;

import java.util.LinkedList;
import java.util.List;

public class RomanNumberConverter {
    static final List<RomanLiteral> romanLiterals;

    static {
        romanLiterals = new LinkedList<>();
        romanLiterals.add(new RomanLiteral("M", 1000));
        romanLiterals.add(new RomanLiteral("CM", 900));
        romanLiterals.add(new RomanLiteral("D", 500));
        romanLiterals.add(new RomanLiteral("CD", 400));
        romanLiterals.add(new RomanLiteral("C", 100));
        romanLiterals.add(new RomanLiteral("XC", 90));
        romanLiterals.add(new RomanLiteral("L", 50));
        romanLiterals.add(new RomanLiteral("XL", 40));
        romanLiterals.add(new RomanLiteral("X", 10));
        romanLiterals.add(new RomanLiteral("IX", 9));
        romanLiterals.add(new RomanLiteral("V", 5));
        romanLiterals.add(new RomanLiteral("IV", 4));
        romanLiterals.add(new RomanLiteral("I", 1));
    }

    public static String toRoman(int i) {
        StringBuilder romanNumber = new StringBuilder();

        for (RomanLiteral rl : romanLiterals) {
            while (i >= rl.getArabicAnalog()) {
                romanNumber.append(rl.getRomanNumber());
                i -= rl.getArabicAnalog();
            }
        }
/*
        while (i >= 50) {
            romanNumber.append("L");
            i -= 50;
        }

        if (i >= 40) {
            romanNumber.append("XL");
            i -= 40;
        }

        while (i >= 10) {
            romanNumber.append("X");
            i -= 10;
        }

        if (i == 9) {
            romanNumber.append("IX");
            i -= 9;
        }

        if (i / 5 > 0) {
            romanNumber.append("V");
            i -= 5;
        }

        if (i == 4)
            romanNumber.append("IV");

        if (i <= 3){
            while(i > 0) {
                romanNumber.append("I");
                i--;
            }
        }
*/
        return romanNumber.toString();
    }

    public static int toArabic(String romanInput) {
        int i = 0;
        StringBuilder input = new StringBuilder(romanInput);

        for (RomanLiteral rl : romanLiterals) {
            while (input.toString().startsWith(rl.getRomanNumber())) {
                input.delete(0, rl.getRomanNumber().length());
                i += rl.getArabicAnalog();
            }
        }

        return i;
    }
}

class RomanLiteral {
    final String romanNumber;
    final int arabicAnalog;

    RomanLiteral(String romanNumber, int arabicAnalog) {
        this.romanNumber = romanNumber;
        this.arabicAnalog = arabicAnalog;
    }

    String getRomanNumber() {
        return romanNumber;
    }

    int getArabicAnalog() {
        return arabicAnalog;
    }
}