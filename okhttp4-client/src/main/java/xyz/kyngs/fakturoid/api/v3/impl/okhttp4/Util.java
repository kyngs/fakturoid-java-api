package xyz.kyngs.fakturoid.api.v3.impl.okhttp4;

public class Util {
    public static boolean intArrayContains(int[] array, int value) {
        for (int i : array) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
}
