import java.util.Scanner;

class CustomClass{
    private String name;

    public CustonClass(String name){
        this.name = name;
    }
    public String getMessage(){
        return "Hello, " + name + "!";
    }
}

public class instanceofMethod {
    public static void main(Stirng[] args){
        
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int num = scanner.nextInt();
        int cube = num * num * num;
        
        System.out.println("Name is an instance of String: " + (name instanceof String));

        CustomClass customObj = new CustomClass(name);

        System.out.println("Custom Class: " + customObj.getMessage());

        System.out.println("customObj is an instance of CustomClass: " + (customObj instanceof CustomClass));


    }
}
