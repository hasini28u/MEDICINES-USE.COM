package com.MedicinePortal.medicineportal;

import com.MedicinePortal.medicineportal.Medicine;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MedicineRepository extends MongoRepository<Medicine, String> {
}
