package Homophinic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class HomophonicKey {
    private ArrayList<ArrayList<Character>> arr = new ArrayList<>();
    private ArrayList<ArrayList<Character>> arrUpper = new ArrayList<>();
    List<Character> list=new ArrayList<>();
    private void shuffle(){

        for (int i = 0; i < 26; i++) {
            Character c =(char )(i+97);
            list.add(c);
        }
        Collections.shuffle(list);
    }
     public ArrayList<ArrayList<Character>> keyGenerator(){

         for (int i = 0; i < 26; i++) {
             ArrayList<Character> ar = new ArrayList<>();
             ar.add(list.get(i));
             arr.add(ar);
         }
         ArrayList<Character> a1 = new ArrayList<>();
         a1 = arr.get(4);
         a1.add('5');
         a1.add('7');
         ArrayList<Character> a2 =new ArrayList<>();
         a2 = arr.get(0);
         a2.add('9');
         arr.set(4,a1);
         arr.set(0,a2);
         return arr;
     }


}
