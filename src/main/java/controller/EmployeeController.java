package controller;

import model.dto.EmployeeDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/save")
    public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto) {
        EmployeeDto saved = employeeService.saveEmployee(employeeDto);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable Long id,
                                                      @RequestBody EmployeeDto employeeDto) {
        EmployeeDto updated = employeeService.updateEmployee(id, employeeDto);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> getSingleEmployee(@PathVariable Long id) {
        EmployeeDto employee = employeeService.getSingleEmployee(id);
        return ResponseEntity.ok(employee);
    }

    @GetMapping("/all")
    public ResponseEntity<List<EmployeeDto>> getAllEmployees() {
        List<EmployeeDto> employees = employeeService.getAllEmployees();
        return ResponseEntity.ok(employees);
    }
}
