package com.example.attendanceviewmodel.models;

public class Attend {
    private String name, nim, classes;

    public Attend(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public Attend(String name, String nim, String classes){
        this.name = name;
        this.nim = nim;
        this.classes = classes;
    }

}
