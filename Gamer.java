public class Gamer extends Actor
{
    /**
     * Act - do whatever the Fighter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count;
    int health = 100; 
    Enemy enemy; 
    Counter counter;
    public Gamer()
    {
        this.counter = counter; 
        setImage("Opponent .png");
        getImage().scale(80,80);
    }
    public void act()
    {
        moveGamer();
    }
    public void moveGamer()
    {
        setLocation(getX(),getY());
    }
    public void moveAround()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() +5,getY());
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() +5,getY());
        }
    }
    public boolean hitbyEnemy()
    {
        Actor Enemy = getOneObjectAtOffset(0,0, Enemy.class);
        if (Enemy != null)
        {
            return true;
        }
        else 
        {
            return false;
        }
            
            //health--; 
            //getWorld().removeObject(Enemy); 
        }
        //if(health ==0)
       // {
            //counter.score++;
            //getWorld().removeObject(this); 
        //}
}
