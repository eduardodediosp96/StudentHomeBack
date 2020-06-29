package com.studenthome.controllers;

import com.studenthome.entity.models.Student;
import com.studenthome.entity.models.UserLogin;
import com.studenthome.entity.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class mainController {
    @Autowired
    IStudentService studentService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model) {
        return "Hola mundo";
    }

    @PostMapping("/userlogin")
    public Student newStudent(@RequestBody UserLogin userlogin) {
        return studentService.buscarPorEmail(userlogin.getUsername(), userlogin.getPassword());
    }
}
