package pixel.academy.thymeleaf.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pixel.academy.thymeleaf.app.model.Student;

@Controller
public class StudentController {

    @GetMapping
    public String showFrom(Model theModel) {

        //create a nre sudent object
        Student theStudent = new Student();

        //add st object to the model

        theModel.addAttribute("student" , theStudent);

        return "student-form";

    }
    @PostMapping("/processStudentForm")
    public String processForm(@ModelAttribute("student") Student theStudent) {

        //log the input data
        System.out.println("theStudent: " + theStudent.getFirstName() + " " + theStudent.getLastName());

        return "student-confirmation";

    }

}
