import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HANAKO here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HANAKO extends Actor
{
    private GreenfootImage img_bkup = null;
    private int width=50;
    private int height= 57;

    public HANAKO(){
        img_bkup = new GreenfootImage( getImage() );
        getImage().scale( width,height );
    }
    private int fruits = 0;
    /**
     * Act - do whatever the HANAKO wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage img = new GreenfootImage(img_bkup);
        img.scale( width,height );
        setImage(img);
        if( Greenfoot.isKeyDown( "right" ) ){
        setRotation(0);
        move(-4);
        }
        if( Greenfoot.isKeyDown( "left" ) ){
        setRotation(0);
        move(4);
        }
        if( Greenfoot.isKeyDown( "up" ) ){
        setRotation(90);
        move(4);
        }
        if( Greenfoot.isKeyDown( "down" ) ){
        setRotation(90);
        move(-4);
        }
        Actor actor = getOneIntersectingObject( APPLE.class );
        if( actor != null ){
            fruits++;
            getWorld().removeObject(actor);
        }
        actor = getOneIntersectingObject( ORANGE.class );
        if( actor != null ){
            fruits++;
            getWorld().removeObject(actor);
        }
        if (fruits == 10) {
            getWorld().showText("CLEAR", 400, 200);
            Greenfoot.stop();
        }
    }
}
