package com.skymate8.module2.three;

import java.util.Comparator;

public class ValueComparator implements Comparator<Card> {

    @Override
    public int compare(Card o1, Card o2) {
        String value1 = o1.getvalue();
        String value2 = o2.getvalue();

        if (value1.equals(value2)) return 0;
        if (o1.isFaceCard()) {
            if (!o2.isFaceCard()) return -1;
            switch (value1) {
                case "K" -> {
                    return -1;
                }
                case "Q" -> {
                    if (value2.equals("K")) return 1;
                    return -1;
                }
                case "J" -> {
                    if (value2.equals("K") || value2.equals("Q")) return 1;
                    return -1;
                }
            }
        } else if (o2.isFaceCard()) {
            return 1;
        }
        return Integer.parseInt(value1) > Integer.parseInt(value2) ? -1 : 1;
    }
}