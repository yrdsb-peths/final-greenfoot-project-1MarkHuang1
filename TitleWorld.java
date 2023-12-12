import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleWorld extends World
{
    // Title
    Label gamNam = new Label("Game Name",100);
    public TitleWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addObject(gamNam,300,150);
        prepare();
        Button PlayBut = new Button("Start1tes.png", new GameWorld());
        addObject(PlayBut,getWidth()/2,300);
    }
    public void prepare(){

    }
}

