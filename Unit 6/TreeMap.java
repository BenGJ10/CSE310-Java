import java.util.*;
import java.util.TreeMap;

public class TreeMap {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> freqMap = new TreeMap<>();

        while(scanner.hasNextLine()){
            String line = scanner.nextLine();

            for(char ch: line.toCharArray()){
                freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println("Character Frequency Count:");
        for(Map.Entry<Character, Integer> entry: freqMap.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        scanner.close();
    }
}
