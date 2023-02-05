/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author jeelkanzaria
 */
public class MedicineCatalog {
    
    ArrayList<Medicine> medicineList;
    
    public MedicineCatalog(){
        this.medicineList = new ArrayList<Medicine>();
    }

    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(ArrayList<Medicine> medicineList) {
        this.medicineList = medicineList;
    }
    
    public Medicine createMedicine(String name, double dosage){
        Medicine medicine = new Medicine();
        
        medicine.setMedicineName(name);
        medicine.setDosage(dosage);
        
        this.medicineList.add(medicine);
        
        return medicine;
    }
    
    public Boolean checkMedicine(String name){
        for(Medicine m: this.medicineList){
            if(m.getMedicineName().equals(name) ){
                return false;
            }
        }
        return true;
    }
    
    public void deleteMedicine(String name){
        //find medicine from the list
        
        for(Medicine med: this.medicineList){
            if(med.getMedicineName().equals(name)){
                this.medicineList.remove(med);
                break;
            }
        }
    }
}
