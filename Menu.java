import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    GreenfootSound bgmusic= new GreenfootSound("pac-man.mp3");
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }
    public void stopped()
    {
        bgmusic.pause();
    }
    public void started()
    {
        bgmusic.setVolume(15);
        bgmusic.playLoop();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        started();
        stopped();

        Mulai mulai = new Mulai();
        addObject(mulai,302,290);
    }
}
