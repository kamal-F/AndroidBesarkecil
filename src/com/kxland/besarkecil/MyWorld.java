package com.kxland.besarkecil;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    static Bilangan bilangan1 = new Bilangan();
    static Bilangan bilangan2 = new Bilangan();
    
    static Counter skore = new Counter("Skore: ");
    static Counter nyawa = new Counter("hp: ");
    
    GreenfootSound bg = new GreenfootSound("bg1.wav");
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        setBackground("bg-hitam.png");
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        addObject(bilangan1,136,202);

        addObject(bilangan2,427,204);

        //bilangan2.nilai = 9;
        Operator operator1 = new Operator("lebihkecil.png",300,124, false);
        addObject(operator1,300,124);
        Operator operator2 = new Operator("lebihbesar.png", 300,321, true);
        addObject(operator2,300,321);
        Cek cek = new Cek();
        addObject(cek,300,217);

        addObject(skore,84,43);        
        addObject(nyawa,501,43);
        skore.setValue(0);
        nyawa.setValue(5);

        bilangan1.setLocation(201,212);
        bilangan2.setLocation(400,212);

        skore.setLocation(186,47);
        nyawa.setLocation(426,47);
    }
    
    //overloading
    public void started(){
         bg.playLoop();
    }
}
