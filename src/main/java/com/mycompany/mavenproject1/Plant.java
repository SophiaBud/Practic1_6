/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Alisa
 */
public class Plant {
    public String name;
    public String colour;
    public int age;
    

    public Plant(String name, String colour, int age) {
        this.name = name;
        this.colour = colour;
        this.age = age;
    }

    /*public void setName(String name) {
        this.name = name;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public int getAge() {
        return age;
    }*/
    public void filter(String plantName){
        plantName = name.replaceAll("[a,e,i,o,u,y]", "");
        System.out.println ("Result: "+plantName+" VGTBL");
    }
}
