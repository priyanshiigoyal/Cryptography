package Homophinic;

import java.util.ArrayList;
import java.util.Random;

public class Homophone {
   HomophonicKey homophonicKey = new HomophonicKey();
    private ArrayList<ArrayList<Character>> key = homophonicKey.keyGenerator();
    public String Encryption(String data){
        StringBuilder response= new StringBuilder();
        for (int i = 0; i < data.length(); i++) {
            char c = data.charAt(i);
            int b = c;
            if(c>=65 && c<=92){
                ArrayList<Character> a1 = key.get(b-65);
                Random rn = new Random();
                c = a1.get(rn.nextInt(a1.size()));
                if(c>=97 && c<=122){
                    c=(char)(c-32);
                }
                response.append(c);
            }
            else if(c>=97 &&c<=122) {
                ArrayList<Character> a1 = key.get(c-97);
                Random rn = new Random();
                c = a1.get(rn.nextInt(a1.size()));
                response.append(c);
            }
        }
        return response.toString();
    }
}
