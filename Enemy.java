import greenfoot.*;

/**
 * Write a description of class enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor 
{
    GifImage myGif = new GifImage("enemy fighter.gif"); //uploading gif image 
    /**
     * Act - do whatever the enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int health = 1; 
    Gamer gamer; 
    Counter counter; 
    public Enemy ()
    {
        this.counter = counter;
        //gamer = mainGamer; 
        getImage().scale(80,80);
    }

    
    public void act() //act function allowing image and user to move/act 
    {
       setImage( myGif.getCurrentImage() );
       boxerMovement();
       hitByPunchingFighter(); 
    }
    public void hitByPunchingFighter()
    {
        Actor Gamer = getOneIntersectingObject(Gamer.class);
        if (Gamer != null)
        {
            health--; 
            getWorld().removeObject(Gamer); 
        }
        if(health ==0)
        {
            counter.score++;
            counter.money+=5;
            getWorld().removeObject(this); 
        }
    }
    private void boxerMovement() // allowing the user to move key to left or right to move fighter 
    {
        if (Greenfoot.isKeyDown("left") )
        {
            move(-4); 
        }
        
        {
        if (Greenfoot.isKeyDown("right") )
        {
            move(4);
        }
    }
    }
    public void moveAround()
    {
        //if (getX() >= 
    }
    public boolean hitbyGamer()
    {
        Actor gamer = getOneObjectAtOffset(0,0, Gamer.class);
        if(gamer!=null)
        {
            return true;
        }
        else 
        return false;
    }
}

