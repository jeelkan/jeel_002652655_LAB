/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author jeelkanzaria
 */
public class ContactInfo {
    
    long personalphoneNo;
    String personalemail;
    
    long officephone;
    String officeemail;
    
    public ContactInfo()
    {
        this.personalphoneNo = 0;
        this.personalemail = "";
        this.officephone = 0;
        this.officeemail = "";
        
    }

    public long getPersonalphoneNo() {
        return personalphoneNo;
    }

    public void setPersonalphoneNo(long personalphoneNo) {
        this.personalphoneNo = personalphoneNo;
    }

    public String getPersonalemail() {
        return personalemail;
    }

    public void setPersonalemail(String personalemail) {
        this.personalemail = personalemail;
    }

    public long getOfficephone() {
        return officephone;
    }

    public void setOfficephone(long officephone) {
        this.officephone = officephone;
    }

    public String getOfficeemail() {
        return officeemail;
    }

    public void setOfficeemail(String officeemail) {
        this.officeemail = officeemail;
    }
    
    
    
}
