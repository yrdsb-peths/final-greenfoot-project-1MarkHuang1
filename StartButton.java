import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class StartButton extends Actor
{
    SimpleTimer animationTimer;
    boolean gameStarted = false;
    GreenfootSound pressSound = new GreenfootSound("real.mp3");

    public StartButton() {
        animationTimer = new SimpleTimer();
        setImage("images/Start1.png");
    }
    public void act()
    {
        //Change World when pressed
        animate();
        if (Greenfoot.mouseClicked(this)){
            pressSound.play();
            animationTimer.mark();
            gameStarted = true;
        }
        if(gameStarted){
            if(animationTimer.millisElapsed() > 120){
                startGame();
            }
        }
    }

    private void startGame() {
        Maze1.min = 0;
        Maze1.sec = 0;
        Player.health = 20;
        Maze1 maze1 = new Maze1();
        Greenfoot.setWorld(maze1);
    }

    // animate on press
    public void animate(){
        if (Greenfoot.mouseClicked(this))
        {
            
            setImage("images/Start2.png");
        }   
    }

}
