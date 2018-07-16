package pl.krepec.service.dto;

import javax.persistence.*;


public class TechnicianDTO {

    private Integer technicianId;

    private String name;

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


    public TechnicianDTO(Integer technicianId, String name, String surname) {
        this.technicianId = technicianId;
        this.name = name;
        this.surname = surname;
    }

    private TechnicianDTO(){}
}
