package com.kxland.besarkecil;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bilangan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bilangan extends Counter
{
    /**
     * Act - do whatever the Bilangan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int cacah = 0;
    private int nilai = 1;
    
    public Bilangan(){
        super("WHITE","bilangan.png");
    }
    public void act() 
    {
        // Add your action code here.
        if(cacah >= 90){
            nilai = Greenfoot.getRandomNumber(10) + 1;
            cacah = 0;
            setValue(nilai);            
        }
        
        cacah++;
        //updateImage();
    }    
}
