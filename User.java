import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class User here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class User extends Actor
{
    /**
     * Act - do whatever the User wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public User()
    {
        getImage().setColor(Color.YELLOW);
        getImage().fillRect(0, 0, 100, 20);
    }
    public void act() 
    {
      if(Greenfoot.isKeyDown("Right"))
        setLocation(getX()+4, getY());
      if(Greenfoot.isKeyDown("Left"))
        setLocation(getX()-4, getY());  
    }    
}
