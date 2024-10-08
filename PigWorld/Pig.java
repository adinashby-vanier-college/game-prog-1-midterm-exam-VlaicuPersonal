// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Pig extends Actor
{

    /**
     * Act - do whatever the Pig wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAndTurn(1);
        eat();
        win();
    }

    /* pig moves only if user wants*/

    /**
     * 
     */
    public void moveAndTurn(int distance)
    {
        if (Greenfoot.isKeyDown("left")) {
            turn(-6);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(6);
        }
        if (Greenfoot.isKeyDown("up")) {
            move(6);
        }
        if (Greenfoot.isKeyDown("down")) {
            move(-6);
        }
    }

    /* eats indiviudual burger*/

    /**
     * 
     */
    public void eat()
    {
        if (isTouching(Burger.class)) {
            removeTouching(Burger.class);
            Greenfoot.playSound("eating.wav");
        }
    }

    /* pig eats all burgers*/

    /**
     * 
     */
    public void win()
    {
        Actor burger = getOneIntersectingObject(Burger.class);
        if (burger != null) {
            World world = getWorld();
            world.removeObject(burger);
            Greenfoot.playSound("win.wav");
        }
    }
}
