package pruebaJavaZulu.main.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name ="Clients")
public class Client {

    @Id
    private Long id;

    private String Email;

    private String Password;

    private String FullName;

    private Long Cedula;

    private String Direccional;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public Long getCedula() {
        return Cedula;
    }

    public void setCedula(Long cedula) {
        Cedula = cedula;
    }

    public String getDireccional() {
        return Direccional;
    }

    public void setDireccional(String direccional) {
        Direccional = direccional;
    }
}
