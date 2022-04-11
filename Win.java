import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Win here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Win extends World
{

    /**
     * Constructor for objects of class Win.
     * 
     */
    public Win()
    {    super(600, 600, 1); 
        prepareWin();
        gamewin();
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
    }
    public void prepareWin()
    {
        Reset reset = new Reset();
        addObject(reset,240,230);
        Selesai selesai = new Selesai();
        addObject(selesai,350,220);
       
    }
    public void gamewin()
    {
        showText("M  E  N   A   N   G   !!",getWidth()/2,getHeight()/2);
    }
}


