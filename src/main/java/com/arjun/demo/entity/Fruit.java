package com.arjun.demo.entity;




public class Fruit {


    private Integer id;


    private String name;


    private String colour;

    public Fruit( Integer id, String name,String colour) {
        this.name = name;
        this.id = id;
        this.colour = colour;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
