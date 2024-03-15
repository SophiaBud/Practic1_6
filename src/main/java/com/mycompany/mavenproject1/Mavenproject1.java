/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Alisa
 */
import java.util.Scanner;
public class Mavenproject1 {

    public static void main(String[] args) {
        System.out.println("Practical task 1.6, Student Budrik Sophia, RIBO-04-22, Variant 4");
        Sadovnik sadovnik = new Sadovnik("Vladimir",56);
        System.out.println("I'm a gardener. My name is "+sadovnik.name+", I'am "+sadovnik.age+" years old");
        
        System.out.println ("Please, enter plant:");
        Scanner scan = new Scanner (System.in);
        String value = scan.nextLine () ;
        System.out.println ("Please, enter colour of the plant:");
        String value1 = scan.nextLine () ;
        System.out.println ("Please, enter age of the plant plant:");
        int value2 = scan.nextInt () ;
        Plant plant = new Plant(value, value1, value2);
        System.out.println("Plant: "+plant.name+", colour: "+plant.colour+", age:"+plant.age);
        
        plant.filter(value);
    }
    
}
