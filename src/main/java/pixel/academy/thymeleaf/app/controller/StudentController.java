package pixel.academy.thymeleaf.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pixel.academy.thymeleaf.app.model.Student;

@Controller
public class StudentController {

    @GetMapping
    public String showFrom(Model theModel) {

        //create a nre sudent object
        Student stheStudent = new Student();

        //add st object to the model

        theModel.addAttribute("student" , stheStudent);

        return "student-from";

    }

}
