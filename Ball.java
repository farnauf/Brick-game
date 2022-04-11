


















import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int dy = 5;
    int dx = 0;
    int count = 0;
    public User user;
    public World myWorld;
    public Ball(User user, World world )
    {
     myWorld = world;
     this.user = user;
     getImage().scale(getImage().getWidth()/2, getImage().getHeight()/2);
    }
    
    public void act() 
    {
        Move();
        Bounce ();
        BounceEdge();
        Hit();
        Lose();
        Win();
    }
    
    public void Move()
    {
     setLocation(getX() + dx, getY() + dy);
    }
    
    public void Bounce()
    {
     if(isTouching(User.class) && this.user.getX() > getX()+50)
     {
       dy = -dy;
       dx-= 6;
       Greenfoot.playSound("Hit.mp3");
     }
     else if(isTouching(User.class) && this.user.getX() < getX()-50)
     {
       dy = -dy;
       dx+= 6;
       Greenfoot.playSound("Hit.mp3");
     }
     else if(isTouching(User.class) && this.user.getX() > getX()+40)
     {
       dy = -dy;
       dx-= 5;
       Greenfoot.playSound("Hit.mp3");
     }
     else if(isTouching(User.class) && this.user.getX() < getX()-40)
     {
       dy = -dy;
       dx+= 5;
       Greenfoot.playSound("Hit.mp3");
     }
     else if(isTouching(User.class) && this.user.getX() > getX()+30)
     {
       dy = -dy;
       dx-= 4;
       Greenfoot.playSound("Hit.mp3");
     }
     else if(isTouching(User.class) && this.user.getX() < getX()-30)
     {
       dy = -dy;
       dx+= 4;
       Greenfoot.playSound("Hit.mp3");
     }
     else if(isTouching(User.class) && this.user.getX() > getX()+20)
     {
       dy = -dy;
       dx-= 3;
       Greenfoot.playSound("Hit.mp3");
     }
     else if(isTouching(User.class) && this.user.getX() < getX()-20)
     {
       dy = -dy;
       dx+= 3;
       Greenfoot.playSound("Hit.mp3");
     }
     else if(isTouching(User.class) && this.user.getX() > getX()+10)
     {
       dy = -dy;
       dx-= 2;
       Greenfoot.playSound("Hit.mp3");
     }
     else if(isTouching(User.class) && this.user.getX() < getX()-10)
     {
       dy = -dy;
       dx+= 2;
       Greenfoot.playSound("Hit.mp3");
     }
     else if((isTouching(User.class) || isTouching(Block.class)))
     {
      dy = -dy;
      Greenfoot.playSound("Hit.mp3");
     } 
    }
    
    public void BounceEdge()
    {
     if(getX() >= getWorld().getWidth() - 1)
     {
         //Greenfoot.playSound("Hit.mp3");
         dx = -dx;
     }
     if(getX() <= 0)
     {
         //Greenfoot.playSound("Hit.mp3");
         dx = -dx;
     }
     if(getY() <= 0)
     {   
        //Greenfoot.playSound("Hit.mp3");   
        dy = -dy;
     }
     if(getY() >= getWorld().getHeight() -1)
     {  
         //Greenfoot.playSound("Hit.mp3");
         dy = -dy;
     }   
    }
    
    public void Hit()
    {
     Actor block = getOneIntersectingObject(Block.class);
     if(block != null && block.getX() > getX()+30)
     {
         getWorld().removeObject(block);
         dx = -dx;
         count++;
         Greenfoot.playSound("Ting.mp3");
     }
     else if(block != null && block.getX() < getX()-30)
     {
         getWorld().removeObject(block);
         dx = -dx;
         count++;
         Greenfoot.playSound("Ting.mp3");
     }
     else if(block != null)
     {
         getWorld().removeObject(block);
         count++;
         Greenfoot.playSound("Ting.mp3");
     }
    }
    
    public void Lose()
    {
        if(getY() >= getWorld().getHeight() -1)
        {
           Greenfoot.playSound("mario.mp3");
           
           Greenfoot.setWorld(new Gameover());
            }
        }
    
    
    public void Win()
    {
      if(count == 1){
 
      Greenfoot.playSound("victory.mp3");
      Greenfoot.setWorld(new Win());
     }
}
}


