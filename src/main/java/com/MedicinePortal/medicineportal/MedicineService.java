package com.MedicinePortal.medicineportal;

import com.MedicinePortal.medicineportal.Medicine;
import com.MedicinePortal.medicineportal.MedicineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineService {

    @Autowired
    private MedicineRepository medicineRepository;

    public List<Medicine> getAllMedicines() {
        return medicineRepository.findAll();
    }
}
