public class Counter extends Actor
{
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int score; 
    int money;
    public Counter()
    {
        setImage(new GreenfootImage("Score: " + score + "\n Cash:" + money, 40, Color.BLACK, new Color(0,0,0,0)));
    }
    public void act()
    {
        setImage(new GreenfootImage("Score: " + score  + "\n Cash:" + money, 40, Color.BLACK, new Color(0,0,0,0)));
        // Add your action code here.
    }
}