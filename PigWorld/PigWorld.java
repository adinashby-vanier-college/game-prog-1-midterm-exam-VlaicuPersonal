// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class PigWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public PigWorld()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Burger burger =  new  Burger();
        addObject(burger, 369, 56);
        Burger burger2 =  new  Burger();
        addObject(burger2, 459, 127);
        Burger burger3 =  new  Burger();
        addObject(burger3, 98, 79);
        Burger burger4 =  new  Burger();
        addObject(burger4, 172, 83);
        Burger burger5 =  new  Burger();
        addObject(burger5, 163, 143);
        Burger burger6 =  new  Burger();
        addObject(burger6, 153, 369);
        Burger burger7 =  new  Burger();
        addObject(burger7, 455, 370);
        Burger burger8 =  new  Burger();
        addObject(burger8, 561, 244);
        Pig pig =  new  Pig();
        addObject(pig, 63, 218);
        Snake snake =  new  Snake();
        addObject(snake, 574, 350);
    }
}
