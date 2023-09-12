import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TARO here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TARO extends Actor
{
    private GreenfootImage img_bkup = null;
    private int width=50;
    private int height= 57;

    public TARO(){
        img_bkup = new GreenfootImage( getImage() );
        getImage().scale( width,height );
    }
    /**
     * Act - do whatever the TARO wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage img = new GreenfootImage(img_bkup);
        img.scale( width,height );
        setImage(img);
        if( Greenfoot.isKeyDown( "right" ) ){
        setRotation(0);
        move(4);
        }
        if( Greenfoot.isKeyDown( "left" ) ){
        setRotation(0);
        move(-4);
        }
        if( Greenfoot.isKeyDown( "up" ) ){
        setRotation(90);
        move(-4);
        }
        if( Greenfoot.isKeyDown( "down" ) ){
        setRotation(90);
        move(4);
        }
        Actor actor = getOneIntersectingObject( APPLE.class );
        if( actor != null ){
            getWorld().showText("GAME OVER", 400, 200);
            Greenfoot.stop();
        }
        actor = getOneIntersectingObject( ORANGE.class );
        if( actor != null ){
            getWorld().showText("GAME OVER", 400, 200);
            Greenfoot.stop();
        }
    }
}
