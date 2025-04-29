import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        
        StringBuilder input = new StringBuilder(sentence);
        
        int vowelCount = 0, consonantCount = 0;
        String vowels = "aeiouAEIOU";
        
        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if(Character.isLetter(ch)){
                if(vowels.indexOf(ch) != -1){
                    vowelCount++;
                } else{
                    consonantCount++;
                }
            }
        }
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
        scanner.close();
    }
}
