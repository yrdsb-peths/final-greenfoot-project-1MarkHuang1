import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Maze1 extends World
{
    public static int sec =0;
    public static int min =0;
    public static int tries = 0;
    SimpleTimer timer = new SimpleTimer();
    Player player;
    Label time;
    Label hp;
    public static int which = 1;
    //Real buttons
    Real1 real1 = new Real1();
    Real1 real2 = new Real1();
    Real1 real3 = new Real1();
    //bg music
    public static boolean stopMusic = false;
    public static boolean playMusic = false;
    GreenfootSound mazeMusic = new GreenfootSound("mazeMusic.mp3");

    public Maze1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 500,1); 
        Label Game = new Label("World1",20);
        addObject(Game,100,100);
        //time
        Label timeLabel = new Label("Time:",30);
        addObject(timeLabel,50,130);
        time = new Label(0,30);
        addObject(time,120,130);
        //health
        hp = new Label(0,30);
        addObject(hp,120,160);
        //mimic
        Mimic mimic = new Mimic();
        addObject(mimic,50,200);
        //Add first solution
        addObject(real1,359,23);
        //
        prepare();
        //add a mimic to cover one solution
        Mimic mimic50 = new Mimic();
        addObject(mimic50,359,23);
        //player
        player = new Player();
        addObject(player, getWidth()/2, getHeight()/2);
        //
        FinishButton finishButton2 = new FinishButton();
        addObject(finishButton2,391,269);
    }
    public void act(){
        playMusic();
        stopMusic();
        if (Maze2.back){
            player.setLocation(340,484);
        }
        Maze2.back = false;
        time();
        changeSolution();
        hp.setValue(Player.health);
    }
    public void playMusic(){
        if (playMusic){
            System.out.println(playMusic);
            mazeMusic.playLoop();
            playMusic = false;
        }
    }
    public void stopMusic(){
        if (stopMusic){
            mazeMusic.stop();
            stopMusic = false;
        }
        if (Player.health == 0){
            mazeMusic.stop();
        }
    }
    public void time(){
        if (timer.millisElapsed()>1000){
            sec++;
            time.setValue(min + ":" + sec);
            timer.mark();
        }
        if (sec == 60){
            sec = 0;
            min += 1;
            time.setValue(min + ":" + sec);
        }
    }
    public void checkSolution(){
        if (which == 1){
            removeObject(real2);
            removeObject(real3);
            addObject(real1,359,23);
        }
        else if (which == 2){
            removeObject(real1);
            removeObject(real3);
            addObject(real2,568,28);
        }
        else if (which == 3){
            removeObject(real2);
            removeObject(real1);
            addObject(real3,22,385);
        }
    }
    public void changeSolution(){
        if (FinishScreen.change1){
            which = Greenfoot.getRandomNumber(3) + 1;
            checkSolution();
            FinishScreen.change2 = true;
            FinishScreen.change1 = false;
            }
    }
    private void prepare()
    {
        ////
        FinishButton finishButton = new FinishButton();
        addObject(finishButton,417,484);
        ////

        Walls walls = new Walls();
        addObject(walls,377,441);
        Walls walls2 = new Walls();
        addObject(walls2,425,440);
        Walls walls3 = new Walls();
        addObject(walls3,467,442);
        Walls walls4 = new Walls();
        addObject(walls4,464,478);
        Walls walls5 = new Walls();
        addObject(walls5,329,440);
        Walls walls6 = new Walls();
        addObject(walls6,285,439);
        Walls walls7 = new Walls();
        addObject(walls7,284,480);
        Walls walls8 = new Walls();
        addObject(walls8,507,22);

        Walls walls9 = new Walls();
        addObject(walls9,507,69);
        Walls walls10 = new Walls();
        addObject(walls10,506,116);
        Walls walls11 = new Walls();
        addObject(walls11,467,392);
        Walls walls12 = new Walls();
        addObject(walls12,511,392);

        Walls walls13 = new Walls();
        addObject(walls13,24,438);
        Walls walls14 = new Walls();
        addObject(walls14,74,436);
        Walls walls15 = new Walls();
        addObject(walls15,74,389);
        Walls walls16 = new Walls();
        addObject(walls16,178,435);
        Walls walls17 = new Walls();
        addObject(walls17,177,480);
        Walls walls18 = new Walls();
        addObject(walls18,177,383);
        Walls walls19 = new Walls();
        addObject(walls19,184,180);
        Walls walls20 = new Walls();
        addObject(walls20,234,178);
        Walls walls21 = new Walls();
        addObject(walls21,281,179);
        Walls walls22 = new Walls();
        addObject(walls22,329,180);
        Walls walls23 = new Walls();
        addObject(walls23,230,23);
        Walls walls24 = new Walls();
        addObject(walls24,230,71);
        Walls walls25 = new Walls();
        addObject(walls25,234,225);
        Walls walls26 = new Walls();
        addObject(walls26,234,275);
        Walls walls27 = new Walls();
        addObject(walls27,576,232);
        Walls walls28 = new Walls();
        addObject(walls28,528,232);
        Walls walls29 = new Walls();
        addObject(walls29,528,280);
        Walls walls30 = new Walls();
        addObject(walls30,477,231);
        Walls walls31 = new Walls();
        addObject(walls31,331,390);
        Walls walls32 = new Walls();
        addObject(walls32,329,339);
        Walls walls34 = new Walls();
        addObject(walls34,22,81);
        Walls walls35 = new Walls();
        addObject(walls35,337,72);
        Walls walls36 = new Walls();
        addObject(walls36,371,72);
        Walls walls37 = new Walls();
        addObject(walls37,405,72);
        Walls walls38 = new Walls();
        addObject(walls38,21,246);
        Walls walls39 = new Walls();
        addObject(walls39,68,244);
        Walls walls40 = new Walls();
        addObject(walls40,374,179);
        Mimic mimic = new Mimic();
        addObject(mimic,568,28);
        Mimic mimic2 = new Mimic();
        addObject(mimic2,513,483);
        Mimic mimic3 = new Mimic();
        addObject(mimic3,510,453);
        Mimic mimic4 = new Mimic();
        addObject(mimic4,567,282);
        Mimic mimic5 = new Mimic();
        addObject(mimic5,548,453);
        Mimic mimic6 = new Mimic();
        addObject(mimic6,550,477);
        Mimic mimic7 = new Mimic();
        addObject(mimic7,26,482);
        Mimic mimic8 = new Mimic();
        addObject(mimic8,331,481);
        Mimic mimic9 = new Mimic();
        addObject(mimic9,370,482);
        Mimic mimic10 = new Mimic();
        addObject(mimic10,228,478);
        Mimic mimic11 = new Mimic();
        addObject(mimic11,287,385);
        Mimic mimic12 = new Mimic();
        addObject(mimic12,378,385);
        Mimic mimic13 = new Mimic();
        addObject(mimic13,409,387);
        Mimic mimic14 = new Mimic();
        addObject(mimic14,273,19);
        Mimic mimic15 = new Mimic();
        addObject(mimic15,457,13);
        Mimic mimic16 = new Mimic();
        addObject(mimic16,14,19);
        Mimic mimic17 = new Mimic();
        addObject(mimic17,177,15);
        Mimic mimic18 = new Mimic();
        addObject(mimic18,12,202);
        Mimic mimic19 = new Mimic();
        addObject(mimic19,22,385);
        Mimic mimic20 = new Mimic();
        addObject(mimic20,18,296);
        Mimic mimic21 = new Mimic();
        addObject(mimic21,190,226);
        Mimic mimic22 = new Mimic();
        addObject(mimic22,177,336);
        Mimic mimic23 = new Mimic();
        addObject(mimic23,123,475);
        Mimic mimic24 = new Mimic();
        addObject(mimic24,475,179);
        Mimic mimic25 = new Mimic();
        addObject(mimic25,224,117);

        Spike spike = new Spike();
        addObject(spike,389,286);
        spike.setLocation(557,404);
        removeObject(spike);
        Spike spike2 = new Spike();
        addObject(spike2,104,392);
        Spike spike3 = new Spike();
        addObject(spike3,150,441);
        Spike spike4 = new Spike();
        addObject(spike4,325,11);
        Spike spike5 = new Spike();
        addObject(spike5,324,27);
        Spike spike6 = new Spike();
        addObject(spike6,321,40);
        Spike spike7 = new Spike();
        addObject(spike7,471,73);
        Spike spike8 = new Spike();
        addObject(spike8,533,67);
        Spike spike9 = new Spike();
        addObject(spike9,564,71);
        Spike spike10 = new Spike();
        addObject(spike10,582,65);
        Spike spike11 = new Spike();
        addObject(spike11,596,81);
        Spike spike12 = new Spike();
        addObject(spike12,524,357);
        Spike spike13 = new Spike();
        addObject(spike13,594,353);
        Spike spike14 = new Spike();
        addObject(spike14,544,403);
        Spike spike15 = new Spike();
        addObject(spike15,594,442);
        removeObject(spike15);
        addObject(spike15,594,463);
        Spike spike16 = new Spike();
        addObject(spike16,366,496);
        Spike spike17 = new Spike();
        addObject(spike17,250,435);
        Spike spike18 = new Spike();
        addObject(spike18,40,47);
        Spike spike19 = new Spike();
        addObject(spike19,196,282);
        Spike spike20 = new Spike();
        addObject(spike20,82,211);
        Spike spike21 = new Spike();
        addObject(spike21,498,205);
        Spike spike22 = new Spike();
        addObject(spike22,38,365);
        Mimic mimic26 = new Mimic();
        addObject(mimic26,329,222);
        Mimic mimic27 = new Mimic();
        addObject(mimic27,370,218);
        Mimic mimic28 = new Mimic();
        addObject(mimic28,529,184);
        Mimic mimic29 = new Mimic();
        addObject(mimic29,584,186);
        Mimic mimic30 = new Mimic();
        addObject(mimic30,593,429);
        Mimic mimic31 = new Mimic();
        addObject(mimic31,384,17);
        mimic31.setLocation(390,23);
        Mimic mimic32 = new Mimic();
        addObject(mimic32,390,23);
        Mimic mimic33 = new Mimic();
        addObject(mimic33,424,35);
        Mimic mimic34 = new Mimic();
        addObject(mimic34,128,39);
        Mimic mimic35 = new Mimic();
        addObject(mimic35,94,30);
        Mimic mimic36 = new Mimic();
        addObject(mimic36,76,347);
        Mimic mimic37 = new Mimic();
        addObject(mimic37,66,476);
        mimic33.setLocation(415,38);
        Spike spike23 = new Spike();
        addObject(spike23,409,36);
        Spike spike24 = new Spike();
        addObject(spike24,307,303);
        Spike spike25 = new Spike();
        addObject(spike25,329,302);
        Spike spike26 = new Spike();
        addObject(spike26,347,299);
        walls24.setLocation(224,82);

        Walls walls33 = new Walls();
        addObject(walls33,224,55);
        Walls walls41 = new Walls();
        addObject(walls41,177,79);
    }
}
