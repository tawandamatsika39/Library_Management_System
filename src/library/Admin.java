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
public class Admin {
    
    private String id;
    private String name;
    private String surname;
    private String email;
    private String contact;
    private String password;
    private byte [] pic;

    public Admin(String id, String name, String surname, String email, String contact, String password, byte[] pic) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.contact = contact;
        this.password = password;
        this.pic = pic;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte[] getPic() {
        return pic;
    }

    public void setPic(byte[] pic) {
        this.pic = pic;
    }

    @Override
    public String toString() {
        return "Admin{" + "id=" + id + ", name=" + name + ", surname=" + surname + ", email=" + email + ", contact=" + contact + ", password=" + password + '}';
    }
    
    
    
}
