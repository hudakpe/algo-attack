package com.geeksforgeeks;

public class ReverseArrayWithoutSpecial {


    public static String reverseWithTemporaryArray(String text) {

        char[] chars = text.toCharArray();

        StringBuilder sb = new StringBuilder();
        for (Character c : chars) {
            if (Character.isAlphabetic(c)) {
                sb.append(c);
            }
        }

        sb.reverse();

        for (int i = 0, offset = 0; i < chars.length; i++) {
            if (Character.isAlphabetic(chars[i])) {
                chars[i] = sb.charAt(i - offset);
            } else {
                offset++;
            }
        }


        return new String(chars);
    }

    public static String reverseWithoutExtraSpace(String text) {
        char[] chars = text.toCharArray();
        for (int leftIndex = 0, rightIndex = chars.length - 1; leftIndex < rightIndex; ) {
            if (!Character.isAlphabetic(chars[leftIndex])) {
                leftIndex++;
            } else if (!Character.isAlphabetic(chars[rightIndex])) {
                rightIndex--;
            } else {
                swap(chars, leftIndex, rightIndex);
                leftIndex++;
                rightIndex--;
            }
        }

        return new String(chars);
    }

    public static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
