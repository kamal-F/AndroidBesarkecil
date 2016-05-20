package com.kxland.besarkecil;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Operator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Operator extends Actor
{
    /**
     * Act - do whatever the Operator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int defposX, defposY;
    boolean lebihdari;
    
    public Operator(){}
    public Operator(String gambarLoc, int posX, int posY, boolean lebihdari){
        setImage(gambarLoc);
        this.defposX = posX;
        this.defposY = posY;
        this.lebihdari = lebihdari;
        
    }
    
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseDragged(this)){
            
            if(lebihdari){
                if(Greenfoot.getMouseInfo().getY() <= defposY){
                    setLocation(getX() , Greenfoot.getMouseInfo().getY());
                }
            } else {
                if(Greenfoot.getMouseInfo().getY() >= defposY){
                    setLocation(getX() , Greenfoot.getMouseInfo().getY());
                }
            }
            
        } else{
            
            if(Greenfoot.mouseDragEnded(this) && isTouching(Cek.class)){
                setLocation(defposX, defposY);
                
                //cek bil1, bil2
            
                if(lebihdari){
                    if(MyWorld.bilangan1.getValue() >= MyWorld.bilangan2.getValue()){
                       MyWorld.skore.add(10);
                       Greenfoot.playSound("hit.wav");
                    }
                    else {
                        //nyawa berkurang
                        MyWorld.nyawa.add(-1);
                        Greenfoot.playSound("blast.wav");
                        
                    }
                        
                } else {
                    if(MyWorld.bilangan1.getValue() <= MyWorld.bilangan2.getValue()){
                        MyWorld.skore.add(10);
                        Greenfoot.playSound("hit.wav");
                    }
                    else {
                        //nyawa berkurang
                        MyWorld.nyawa.add(-1);
                        Greenfoot.playSound("blast.wav");
                    }
                }
                
                if(MyWorld.nyawa.getValue()==0){                  
                   getWorld().addObject(new GameOver(),
                    getWorld().getWidth()/2, getWorld().getHeight()/2);
                    Greenfoot.stop();
                   
                }
              
            }
          
            
        }
       
    
    }    
}
