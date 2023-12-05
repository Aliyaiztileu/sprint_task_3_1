package kz.bitlab.spring.sprintTask1.db;

import kz.bitlab.spring.sprintTask1.model.Student;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class DBManager {
    @Getter
    private static List <Student> students = new ArrayList<>();

    static {
        students.add(new Student(1l, "Ilyas", "Zhuanyshev", 35, "B"));
        students.add(new Student(2l, "Aliya", "Iztileu", 98, "A"));
        students.add(new Student(3l, "Zhansaya", "Baturbek", 90, "A"));
        students.add(new Student(4l, "Miras", "Zhuanyshev", 83, "B"));
        students.add(new Student(5l, "Nurzhan", "Bolatov", 47, "F"));
    }

    private static Long id = 6L;
    public static void addStudent(Student student) {
        student.setId(id);
        students.add(student);
        id++;
    }
}
