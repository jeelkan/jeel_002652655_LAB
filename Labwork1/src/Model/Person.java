/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author jeelkanzaria
 */
public class Person {
    
    long NUID;
    String firstName;
    String lastName;
    String collegeName;
    
    Address Address;
    ContactInfo ContacInfo;
    
    public Person(){
        this.NUID = 0;
        this.firstName = "";
        this.lastName = "";
        this.collegeName = "";
        this.Address = new Address();
        this.ContacInfo = new ContactInfo();
        
    }

    public long getNUID() {
        return NUID;
    }

    public void setNUID(int NUID) {
        this.NUID = NUID;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
    
    public Address getAddress() {
        return Address;
    }

    public void setAddress(Address Address) {
        this.Address = Address;
    }

    public ContactInfo getContacInfo() {
        return ContacInfo;
    }

    public void setContacInfo(ContactInfo ContacInfo) {
        this.ContacInfo = ContacInfo;
    }
    
    
    
    public static void main(String Args[])
    {
        Person obj = new Person();
        obj.setNUID(002652655);
        obj.setFirstName("Jeel");
        obj.setLastName("Kanzaria");
        obj.setCollegeName("Noetheastern University");
        
        
        Address addr = obj.getAddress();
        addr.setCurrstreetName(("Allston Street"));
        addr.setCurrapartno(2);
        addr.setCurrcity("Boston");
        addr.setCurrzipcode(02134);
        
        addr.setPerstreetName("Dev Darshan Complex");
        addr.setPerapartno(7);
        addr.setPercity("Kharghar");
        addr.setPerzipcode(410210);
        
        ContactInfo con = obj.getContacInfo();
        con.setPersonalphoneNo(797711);
        con.setPersonalemail("jeelkanzaria1997@gmail.com");
        con.setOfficephone(63728);
        con.setOfficeemail(("kanzaria.j@northeastern.edu"));
        
        
        System.out.println("NUID: " + obj.getNUID());
        System.out.println("First Name: " + obj.getFirstName());
        System.out.println("Last Name: " + obj.getLastName());
        System.out.println("College Name: " + obj.getCollegeName());
        System.out.println("Current Street Name: " + obj.getAddress().getCurrstreetName());
        System.out.println("Current Apartment No: " + obj.getAddress().getCurrapartno());
        System.out.println("Current City/State: " + obj.getAddress().getCurrcity());
        System.out.println("Current ZipCode: " + obj.getAddress().getCurrzipcode());
        System.out.println("Permanent Street Name: " + obj.getAddress().getPerstreetName());
        System.out.println("Permanent Apartment No: " + obj.getAddress().getPerapartno());
        System.out.println("Permanent City/State: " + obj.getAddress().getPercity());
        System.out.println("Permanent ZipCode: " + obj.getAddress().getPerzipcode());
        System.out.println("Personal Phone No: " + obj.getContacInfo().getPersonalphoneNo());
        System.out.println("Personal Email Ido: " + obj.getContacInfo().getPersonalemail());
        System.out.println("Office Phone No: " + obj.getContacInfo().getOfficephone());
        System.out.println("Office Email Id: " + obj.getContacInfo().getOfficeemail());
        
        
        
    }
}
