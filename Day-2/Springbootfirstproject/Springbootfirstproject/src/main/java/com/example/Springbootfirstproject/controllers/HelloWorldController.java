package com.example.Springbootfirstproject.controllers;

import com.example.Springbootfirstproject.models.Employee;
import com.example.Springbootfirstproject.serviece.HelloWorldServiece;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloWorldController
{
    @Autowired
    HelloWorldServiece  hws;
//  ShasiKumarR
    @GetMapping("/abc")
    public String hello()
    {
        return hws.get();
        //System.out.println("hello world");
        //return "Hello From Hello World dc from rest controller";
    }

    @PostMapping("/abc")
    public String postMethod()
    {
        return hws.post();
    }

    @PutMapping("/abc")
    public String putMethod()
    {
        return hws.put();
    }

    @DeleteMapping("/abc")
    public String deleteMethod()
    {
        return hws.del();
    }

   @GetMapping("/emp")
    public ArrayList<Employee> emp(){
        return hws.getallEmp();
   }

   @PostMapping("/emp")
    public void setarray(@RequestBody Employee emp)
   {
       hws.setvalue(emp);
   }
}

public class HelloWorldService{
    public String deleteEmployeeById(int empID){ 1 usage
            int ind = 0;
        boolean flag = false;
        for(int i = 0; i < employees.size(); i++){
            System.out.println("Emp_ID: "+ employees.get(i).getEmpID() + employees.get(i));
            ind = i;
            flag = true;
            break;
        }
    }
    if(flag){
        employees.remove(ind);
        return "Employee Deleted Successfully ! ";
    }


    @PutMapping


}

