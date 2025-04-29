import java.util.Scanner;

public class Number_of_Words{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        scanner.close();

        int wordCount = 0;
        boolean inWord = false;

        for(int i = 0; i < sentence.length(); i++){
            char ch = sentence.charAt(i);

            if(Character.isLetter(ch)){
                if(!inWord){
                    inWord = true;
                    wordCount++;
                }
            } else{
                inWord = false;
            }
        }
        System.out.println("Number of words in the sentence are: " + wordCount);
    }
}