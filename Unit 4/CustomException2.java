import java.util.*;

class InvalidFileNameException extends Exception{
    public InvalidFileNameException(String message){
        super(message); 
    }
}

public class CustomException2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            String filename = sc.nextLine();
            validate(filename);
            System.out.println("Valid filename");
        } catch(InvalidFileNameException e){
            System.out.println(e.getMessage());
        } finally{
            sc.close();
        }
    }    
}

private static void validate(String filename) throws InvalidFileNameException{
    if(filename.length() < 3){
        throw new InvalidFileNameException("Error: Invalid file name. It must be alphanumeric and have a minimum length of 3 characters.");
    }
    if(!filename.matches["a-zA-Z0-9+"]){
        throw new InvalidFileNameException("Error: Invalid file name. It must be alphanumeric and have a minimum length of 3 characters.");
    }        
}
