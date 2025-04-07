import java.util.*;
import java.util.stream.*;

class Student {

    private String name;
    private int rno;
    private String Department;

    Student(String name, int rno, String Department) {
        this.name = name;
        this.rno = rno;
        this.Department = Department;
    }

    String getName() {
        return name;
    }

    int getRollno() {
        return rno;
    }

    String getDepartment() {
        return Department;
    }

    public String toString() {
        return name + " " + rno + " " + Department;
    }
}

class studentSorter {

    public static void main(String args[]) {
        Scanner P = new Scanner(System.in);
        List<Student> al = new ArrayList<>();
        System.out.println("Enter the number of students:");
        int n = P.nextInt();
        P.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Name of Student " + i + ":");
            String name = P.nextLine();
            System.out.println("Enter Roll No. of Student " + i + ":");
            int rno = P.nextInt();
            P.nextLine();
            System.out.println("Enter Department of Student " + i + ":");
            String dep = P.nextLine();

            al.add(new Student(name, rno, dep));
        }
        Map<String, List<Student>> mp = al
            .stream()
            .collect(Collectors.groupingBy(Student::getDepartment));
        mp.forEach((name, studs) -> {
            studs.sort(Comparator.comparingInt(Student::getRollno));
        });
        System.out.println("====== Details =======");
        mp.forEach((name, depList) -> {
            System.out.println("Name:" + name);
            depList.forEach(x -> System.out.println(" " + x));
        });
    }
}
