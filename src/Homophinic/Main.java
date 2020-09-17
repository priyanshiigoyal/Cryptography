package Homophinic;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HomophonicKey homophonicKey = new HomophonicKey();
        ArrayList<ArrayList<Character>> arr =homophonicKey.keyGenerator();
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
        Homophone homophone = new Homophone();
        System.out.println(homophone.Encryption("AEaerte"));

    }
}
