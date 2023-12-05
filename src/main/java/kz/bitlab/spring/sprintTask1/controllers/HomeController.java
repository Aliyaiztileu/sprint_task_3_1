package kz.bitlab.spring.sprintTask1.controllers;

import kz.bitlab.spring.sprintTask1.db.DBManager;
import kz.bitlab.spring.sprintTask1.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {
    @GetMapping ("/")
        public String homePage (Model model){
            List<Student> students = DBManager.getStudents();
            model.addAttribute("students", students);
            return "index";
    }
    @PostMapping ("/add_student")
    public String addStudent (Student student){
        DBManager.addStudent(student);
        return "redirect:/";
    }
}
