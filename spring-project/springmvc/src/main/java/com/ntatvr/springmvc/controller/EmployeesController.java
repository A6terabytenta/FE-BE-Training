package com.ntatvr.springmvc.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ntatvr.springmvc.entity.Employee;
import io.swagger.annotations.Api;

/**
 * [@Api] � We can add this Annotation to the controller to add basic information regarding the
 * controller.
 * 
 * [@ApiOperation] and [@ApiResponses] � We can add these annotations to any rest method in the
 * controller to add basic information related to that method. e.g.
 * 
 * @author AnhNT
 *
 */
@CrossOrigin(maxAge = 3600)
@Api(value = "EmployeesController", description = "REST APIs related to Employees Entity!",
    tags = "employees-controller")
@Controller
@RequestMapping("/employees")
public class EmployeesController extends RESTController<Employee, Integer> {

  public EmployeesController(JpaRepository<Employee, Integer> repository) {
    super(repository);
  }

}
