/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author tmatsika39
 */
public class Student {
    private String number;
    private String name;
    private String program;
    private String email;
    private String book1_barcode;
    private String book2_barcode;
    private String book3_barcode;
    private byte [] pic;
    private String password ;

    public Student(String number, String name, String program, String email, String book1_barcode, String book2_barcode, String book3_barcode, byte[] pic, String password) {
        this.number = number;
        this.name = name;
        this.program = program;
        this.email = email;
        this.book1_barcode = book1_barcode;
        this.book2_barcode = book2_barcode;
        this.book3_barcode = book3_barcode;
        this.pic = pic;
        this.password = password;
    }

   

    public Student(String number, String name, String program, String email, String book1_barcode, String book2_barcode, String book3_barcode, byte[] pic) {
        this.number = number;
        this.name = name;
        this.program = program;
        this.email = email;
        this.book1_barcode = book1_barcode;
        this.book2_barcode = book2_barcode;
        this.book3_barcode = book3_barcode;
        this.pic = pic;
    }

    public Student(String number, String name, String program, String email, String book1_barcode, String book2_barcode, String book3_barcode) {
        this.number = number;
        this.name = name;
        this.program = program;
        this.email = email;
        this.book1_barcode = book1_barcode;
        this.book2_barcode = book2_barcode;
        this.book3_barcode = book3_barcode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
     public byte[] getPic() {
        return pic;
    }

    public void setPic(byte[] pic) {
        this.pic = pic;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBook1_barcode() {
        return book1_barcode;
    }

    public void setBook1_barcode(String book1_barcode) {
        this.book1_barcode = book1_barcode;
    }

    public String getBook2_barcode() {
        return book2_barcode;
    }

    public void setBook2_barcode(String book2_barcode) {
        this.book2_barcode = book2_barcode;
    }

    public String getBook3_barcode() {
        return book3_barcode;
    }

    public void setBook3_barcode(String book3_barcode) {
        this.book3_barcode = book3_barcode;
    }

    @Override
    public String toString() {
        return "Student{" + "number=" + number + ", name=" + name + ", program=" + program + ", email=" + email + ", book1_barcode=" + book1_barcode + ", book2_barcode=" + book2_barcode + ", book3_barcode=" + book3_barcode + '}';
    }
    
    
    
    
}
