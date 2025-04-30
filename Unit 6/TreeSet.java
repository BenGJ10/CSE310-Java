import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;
    double gpa;

    Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Student other) {
        if (this.gpa != other.gpa) {
            return Double.compare(this.gpa, other.gpa); 
        } else {
            return this.name.compareTo(other.name);     
        }
    }

    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.2f", gpa);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        sc.nextLine(); 

        TreeSet<Student> studentSet = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            double gpa = sc.nextDouble();
            studentSet.add(new Student(id, name, gpa));
        }

        for (Student s : studentSet) {
            System.out.println(s);
        }
    }
}
