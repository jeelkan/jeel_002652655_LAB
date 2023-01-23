/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author jeelkanzaria
 */
public class Address {
    String currstreetName;
    int currapartno;
    String currcity;
    long currzipcode;
    
    String perstreetName;
    int perapartno;
    String percity;
    long perzipcode;
    
    public Address(){
        this.currstreetName = "";
        this.currapartno = 00;
        this.currcity = "";
        this.currzipcode = 0;
        this.perstreetName = "";
        this.perapartno = 00;
        this.percity = "";
        this.perzipcode = 0;
    }

    public String getCurrstreetName() {
        return currstreetName;
    }

    public void setCurrstreetName(String currstreetName) {
        this.currstreetName = currstreetName;
    }

    public int getCurrapartno() {
        return currapartno;
    }

    public void setCurrapartno(int currapartno) {
        this.currapartno = currapartno;
    }

    public String getCurrcity() {
        return currcity;
    }

    public void setCurrcity(String currcity) {
        this.currcity = currcity;
    }

    public long getCurrzipcode() {
        return currzipcode;
    }

    public void setCurrzipcode(long currzipcode) {
        this.currzipcode = currzipcode;
    }

    public String getPerstreetName() {
        return perstreetName;
    }

    public void setPerstreetName(String perstreetName) {
        this.perstreetName = perstreetName;
    }

    public int getPerapartno() {
        return perapartno;
    }

    public void setPerapartno(int perapartno) {
        this.perapartno = perapartno;
    }

    public String getPercity() {
        return percity;
    }

    public void setPercity(String percity) {
        this.percity = percity;
    }

    public long getPerzipcode() {
        return perzipcode;
    }

    public void setPerzipcode(long perzipcode) {
        this.perzipcode = perzipcode;
    }

    
    
}
