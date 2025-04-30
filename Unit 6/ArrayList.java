import java.util.*;

public class ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<String> students = new ArrayList<>();

        
        for (int i = 0; i < n; i++) {
            students.add(sc.nextLine());
        }

        int index = sc.nextInt();

        sc.close();

        if (index >= 0 && index < students.size()) {
            System.out.println("Element at index [" + index + "]: " + students.get(index));
        } else {
            System.out.println("Invalid Index");
        }
    }
}
