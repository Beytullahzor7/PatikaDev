package FolksDev;

import java.util.ArrayList;
import java.util.List;

public class _15_GameOfThronesHackerrank {
    public static void main(String[] args) {

    }

    public static String gameOfThrones(String s){
        List<Integer> alphabet = new ArrayList<>();
        for(int i=0; i<26; i++){ //Alfabenin harfleri kadar dolandık
            alphabet.add(i,0); //Listenin tüm elemanlarını 0 yaptık.  [0,0,0,0,0,0,0,0,0...]
        }

        int currentIndex, currentValue;
        for(int i=0; i<s.length(); i++){
            currentIndex = (int)s.charAt(i)-97; //97 ASCII Tablosuna gore ayarlama yaptık
            currentValue = alphabet.get(currentIndex);
            alphabet.set(currentIndex, currentValue+1);
        }
        int counter = 0;
        for(int i=0; i<alphabet.size(); i++){
            if(alphabet.get(i) %2 == 1){
                counter+=1;
                if(counter>1) return "NO";
            }
        }
        return "YES";
    }
}
