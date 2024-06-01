package com.MedicinePortal.medicineportal;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;


@Document(collection = "medicines")
public class Medicine {

    @Id
    private String id; 
    private String name;
    private String use;
    private String dosage;
    private String sideEffects;


    public Medicine(String id, String name, String use, String dosage, String sideEffects) {
        this.id = id;
        this.name = name;
        this.use = use;
        this.dosage = dosage;
        this.sideEffects = sideEffects;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getSideEffects() {
        return sideEffects;
    }

    public void setSideEffects(String sideEffects) {
        this.sideEffects = sideEffects;
    }
}

