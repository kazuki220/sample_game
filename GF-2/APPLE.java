import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class APPLE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class APPLE extends Actor
{
    private GreenfootImage img_bkup = null;
    private int width=50;
    private int height= 50;

    public APPLE(){
        img_bkup = new GreenfootImage( getImage() );
        getImage().scale( width,height );
    }
    /**
     * Act - do whatever the APPLE wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage img = new GreenfootImage(img_bkup);
        img.scale( width,height );
        setImage(img);
        int A = 0;
        int B = 360;
        int C = A + (int)(Math.random()*((B-A)+1));
        setRotation(C);
        move(5);
    }
}
