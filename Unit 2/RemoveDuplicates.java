import java.util.Scanner;

class RemoveDuplicatesUtility {
    public static String removeDuplicates(String input){
        StringBuilder res = new StringBuilder();
        
        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if(res.indexOf(String.valueOf(ch)) == -1){
                res.append(ch);
            }
        }
        return res.toString();
    }
}
class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();
        String result = RemoveDuplicatesUtility.removeDuplicates(userInput);
        System.out.println(result);

        scanner.close();
    }
}