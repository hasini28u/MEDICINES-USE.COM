package com.MedicinePortal.medicineportal;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.RestController;
import com.MedicinePortal.medicineportal.MedicineService;

@RestController
public class MedicineController {
	
	@Autowired
	public MedicineService medservice ;
	
	@GetMapping("/")
	public ResponseEntity<String> visited() {
		return ResponseEntity.ok("hi");
	}
	
	@GetMapping("/medicines")
	public List<Medicine> getAllMedicines() {
        return medservice.getAllMedicines();
    }
	
	
	
	
	
	
	
}
