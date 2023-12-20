public class HealthBar extends Actor
{
    /**
     * Act - do whatever the HealthBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int health = 4; //how many times the enemy can hit you till you lose 
    int healthBarWidth = 80;
    int healthBarHeight = 15;
    int pixelsPerHealthPoint = (int)healthBarWidth/health;
    public HealthBar()
    {
        update(); 
    }
    public void act()
    {
       //GifImage myGif = new GifImage("Health Bar.gif"); //uploading gif image
       //GreenfootImage myGif = getGifImage();
        update();
        
    }
    public void update()
    {
        setImage(new GreenfootImage(healthBarWidth + 2, healthBarHeight + 2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.WHITE);
        myImage.drawRect(0,0, healthBarWidth + 1, healthBarHeight + 1);
        myImage.setColor(Color.RED); 
        myImage.fillRect(1,1, health*pixelsPerHealthPoint, healthBarHeight); 
        loseHealth();
    }
    
    public void loseHealth()
    {
        World World = getWorld();
        //MyWorld myWorld = (MyWorld)world;
        //if(MyWorld.getEnemy().hitByGamer())
        {
            health--;
        }
    }
}
