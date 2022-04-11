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
    public User user=new User();
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }
    
    public void prepare()
    {
        //getBackground().setColor(Color.YELLOW);
        //getBackground().fill();
        addObject(user,300,550);
        for(int i=0; i < 8; i++)
        for(int j=0; j < 4; j++)
        addObject(new Block(), 50 + 70 * i, 20 + 30 * j);
        Ball ball=new Ball(user, this);
        addObject(ball,300,450);
    }
}
