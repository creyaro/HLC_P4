package com.hlc.studentsservice;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "students")
public class Student {
    @Id
    private String id;
    private String nombre;
    private String birthDate;
    private String dni;



    public String getId() {
        return id;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}
