import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gameover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gameover extends World
{

    /**
     * Constructor for objects of class Gameover.
     * 
     */
    public Gameover()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
        game1();
    }public void prepare()
    {
        Reset reset = new Reset();
        addObject(reset,240,230);
        Selesai selesai = new Selesai();
        addObject(selesai,350,220);
       
    }
    public void game1()
    {
        showText("K  A   L   A   H   !!",getWidth()/2,getHeight()/2);
    }
}

