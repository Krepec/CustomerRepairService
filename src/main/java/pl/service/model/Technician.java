package pl.service.model;

import javax.persistence.*;

@Entity
@Table(name = "technicians")
public class Technician {

    @Id
    @GeneratedValue
    @Column(name = "TechnicianID")
    private Integer technicianId;

    @Column(name = "Name")
    private String name;

    @Column(name = "Surname")
    private String surname;

    public Integer getTechnicianId() {
        return technicianId;
    }

    public void setTechnicianId(Integer technicianId) {
        this.technicianId = technicianId;
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


    public Technician(Integer technicianId, String name, String surname) {
        this.technicianId = technicianId;
        this.name = name;
        this.surname = surname;
    }

    private Technician(){}
}
