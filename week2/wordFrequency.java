//1. Write a program to count word frequencies in a given text.
import java.util.*;

public class wordFrequency {

    public static Map<String, Integer> mostFrequent(String str) {

        str = str.replaceAll("[^a-zA-Z0-9]", " ");
        String[] allWords = str.split(" +");
    
        Map<String, Integer> countingMap = new HashMap<>();
    
        for (String word : allWords) {
          word = word.toLowerCase();
          countingMap.put(word, countingMap.getOrDefault(word, 0) + 1);
        }
        TreeMap<String, Integer> mostFrequentMap = new TreeMap<>((e1, e2) -> {
            int freq1 = countingMap.get(e1);
            int freq2 = countingMap.get(e2);
      
            if (freq1 != freq2) {
              return freq2 - freq1;
            }
      
            return e1.compareTo(e2);
          });
      
          mostFrequentMap.putAll(countingMap); 
          
          return mostFrequentMap; 
        
    }
    
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the text to get word frequency: ");
        String word = scan.nextLine();
        System.out.println(wordFrequency.mostFrequent(word));
        scan.close();   
    }
}