import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int timecount = 1000;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(850, 450, 1);
        addObject( new TARO(), 0, 0 ); 
        addObject( new HANAKO(), 800, 450 );
        for (int i = 0; i < 5; i++) {
            addObject(new APPLE(), Greenfoot.getRandomNumber(801), Greenfoot.getRandomNumber(451));
        }
        for (int i = 0; i < 5; i++) {
            addObject(new ORANGE(), Greenfoot.getRandomNumber(801), Greenfoot.getRandomNumber(451));
        }
    }
    public void act()
    {
        timecount--;
        showText("残り時間: " + timecount, 50, 50);
        if (timecount == 0) {
            showText("TIME OVER", 400, 200);
            Greenfoot.stop();
        }
    }
}
