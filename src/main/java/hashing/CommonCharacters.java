package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonCharacters {
 /*

    Question :- Given a string array words, return an array of all characters that show up in all strings
    within the words (including duplicates). You may return the answer in any order.

    Approach :-

    step1: create mapper for minFrequencyMapper
    step2: create a-z char and since we need min we initialize the counter to max
    step3: now for each word create a mapper<Character,count> put in the mapper and its count
    step4: iterate minfreq mapper take each character and check if its in mapper<> if yes then
    math.min(currentcount from mapper, currentcount from freqmapper) else min will be 0.


    Time complexity :-

    Space Complexity :-

    */

    public static void main(String[] args) {

        String[] words = new String[]{"bella","label","roller"};
        Map<Character, Integer> minFrequencyMapper = new HashMap<>();

        for(char i='a';i<= 'z';i++){
            minFrequencyMapper.put(i,Integer.MAX_VALUE);
        }

        for(String word: words){
            Map<Character, Integer> frequencyMapper = new HashMap<>();
            for(char c: word.toCharArray()){
                frequencyMapper.put(c,frequencyMapper.getOrDefault(c,0)+1);
            }

            for(Character key:minFrequencyMapper.keySet()){
                if(frequencyMapper.containsKey(key)){
                    minFrequencyMapper.put(key,Math.min(minFrequencyMapper.get(key),frequencyMapper.get(key)));
                }
                else{
                    minFrequencyMapper.put(key,0);
                }
            }
        }

        List<String> list=new ArrayList<>();
        for(Character key:minFrequencyMapper.keySet()){
            if(minFrequencyMapper.get(key)>0){
                for(int i=0;i<minFrequencyMapper.get(key);i++){
                    list.add(key+"");
                }
            }
        }

        System.out.println(list);
    }
}
