package com.example.c1220518._2;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;

    @RestController

    public class ordercontainer {



        private final serviceorder service;



        public ordercontainer (serviceorder service) {

            this.service = service;

        }



        //get all students

        @GetMapping("/all")

        public Collection<order> getAllStudents(){

            return service.getAllStudents();

        }



        // Add students



        @PostMapping()

        public void CreateStudent(@RequestBody order std){

            service.createStudent(std);

        }







        // update student



        @PutMapping("{id}")

        public void updateStudents(@RequestBody order std, @PathVariable int id){

            service.updateStudent(std,id);

        }



    }
