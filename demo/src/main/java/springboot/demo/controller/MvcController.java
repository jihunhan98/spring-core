package springboot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MvcController {
    @GetMapping("hello-api")
    @ResponseBody
    public Student helloApi(@RequestParam("name") String name){
        Student student = new Student();
        student.setName(name);
        return student;
    }

    static class Student{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}