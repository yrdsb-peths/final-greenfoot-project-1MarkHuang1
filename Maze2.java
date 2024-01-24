import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Maze2 extends World
{
    SimpleTimer timer = new SimpleTimer();
    public static boolean back = false;
    Label time;
    Label hp;
    ///
    Real2 real1 = new Real2();
    Real2 real2 = new Real2();
    Real2 real3 = new Real2();
    ///
    public Maze2()
    {    
        super(600, 500, 1); 
        Label Game = new Label("World2",20);
        addObject(Game,100,100);
        //time 
        Label timeLabel = new Label("Time:",30);
        addObject(timeLabel,30,130);
        time = new Label(0,30);
        addObject(time,100,130);
        //health
        Label hpCounter = new Label("Hp:",30);
        addObject(hpCounter,60,160);
        hp = new Label(0,30);
        addObject(hp,100,160);
        //add mimic to cover up solution
        Mimic2 mimic2222 = new Mimic2();
        addObject(mimic2222,100,403);
        //Add first solution 
        addObject(real1,100,403);

        //Player
        Player player = new Player();
        addObject(player, getWidth()/2, getHeight()/2);
        prepare();
    }
    public void act(){
        time();
        hp.setValue(Player.health);
        changeSolution();
    }
    // Keeps track of time continued from world 1
    public void time(){
        if (timer.millisElapsed()>1000){
            Maze1.sec++;
            time.setValue(Maze1.min + ":" + Maze1.sec);
            timer.mark();
        }
        if (Maze1.sec == 60){
            Maze1.sec = 0;
            Maze1.min += 1;
            time.setValue(Maze1.min + ":" + Maze1.sec);
        }
    }
    //check which solution to implant
    public void checkSolution(){
        if (Maze1.which == 1){
            removeObject(real2);
            removeObject(real3);
            addObject(real1,100,403);
        }
        else if (Maze1.which == 2){
            removeObject(real1);
            removeObject(real3);
            addObject(real2,22,31);
        }
        else if (Maze1.which == 3){
            removeObject(real2);
            removeObject(real1);
            addObject(real3,13,430);
        }
    }
    //changes solution
    public void changeSolution(){
        if (FinishScreen.change2){
            Maze1.which = Greenfoot.getRandomNumber(3) + 1;
            checkSolution();
            FinishScreen.change2 = false;
        }
    }
    // maze setup
    private void prepare()
    {
        Walls walls = new Walls();
        addObject(walls,297,194);
        Walls walls2 = new Walls();
        addObject(walls2,343,193);
        Walls walls3 = new Walls();
        addObject(walls3,386,193);
        Walls walls4 = new Walls();
        addObject(walls4,387,239);
        Walls walls5 = new Walls();
        addObject(walls5,576,69);
        Walls walls6 = new Walls();
        addObject(walls6,530,68);
        Walls walls7 = new Walls();
        addObject(walls7,483,67);
        Walls walls8 = new Walls();
        addObject(walls8,532,114);
        Walls walls9 = new Walls();
        addObject(walls9,383,148);
        Walls walls10 = new Walls();
        addObject(walls10,530,208);
        Walls walls11 = new Walls();
        addObject(walls11,530,253);
        Walls walls12 = new Walls();
        addObject(walls12,575,251);
        Walls walls13 = new Walls();
        addObject(walls13,388,371);
        Walls walls14 = new Walls();
        addObject(walls14,435,369);
        Walls walls15 = new Walls();
        addObject(walls15,479,369);
        Walls walls16 = new Walls();
        addObject(walls16,527,369);
        Walls walls17 = new Walls();
        addObject(walls17,573,367);
        Walls walls18 = new Walls();
        addObject(walls18,486,416);
        walls18.setLocation(485,435);
        Walls walls19 = new Walls();
        addObject(walls19,485,435);
        Walls walls20 = new Walls();
        addObject(walls20,192,267);
        Walls walls21 = new Walls();
        addObject(walls21,193,310);
        Walls walls22 = new Walls();
        addObject(walls22,240,310);
        Walls walls23 = new Walls();
        addObject(walls23,147,358);
        Walls walls24 = new Walls();
        addObject(walls24,96,357);
        Walls walls25 = new Walls();
        addObject(walls25,148,405);
        Walls walls26 = new Walls();
        addObject(walls26,148,435);
        Walls walls27 = new Walls();
        addObject(walls27,145,479);
        Walls walls28 = new Walls();
        addObject(walls28,269,414);
        Walls walls29 = new Walls();
        addObject(walls29,267,459);
        walls29.setLocation(267,479);
        Walls walls30 = new Walls();
        addObject(walls30,267,479);
        Walls walls31 = new Walls();
        addObject(walls31,309,482);
        Walls walls32 = new Walls();
        addObject(walls32,24,474);
        Walls walls33 = new Walls();
        addObject(walls33,24,211);
        Walls walls34 = new Walls();
        addObject(walls34,71,210);
        Walls walls35 = new Walls();
        addObject(walls35,106,209);
        removeObject(walls35);
        addObject(walls35,184,21);
        Walls walls36 = new Walls();
        addObject(walls36,185,70);
        Walls walls37 = new Walls();
        addObject(walls37,381,23);
        Walls walls38 = new Walls();
        addObject(walls38,234,69);
        Walls walls39 = new Walls();
        addObject(walls39,182,117);
        Walls walls40 = new Walls();
        addObject(walls40,72,23);
        Walls walls41 = new Walls();
        addObject(walls41,576,415);
        Walls walls42 = new Walls();
        addObject(walls42,265,442);
        Walls walls43 = new Walls();
        addObject(walls43,486,399);
        Mimic2 mimic2 = new Mimic2();
        addObject(mimic2,22,31);
        Mimic2 mimic22 = new Mimic2();
        addObject(mimic22,580,23);
        Mimic2 mimic23 = new Mimic2();
        addObject(mimic23,578,119);
        Mimic2 mimic24 = new Mimic2();
        addObject(mimic24,578,207);
        Mimic2 mimic25 = new Mimic2();
        addObject(mimic25,575,299);
        Mimic2 mimic26 = new Mimic2();
        addObject(mimic26,532,299);
        Mimic2 mimic27 = new Mimic2();
        addObject(mimic27,435,230);
        Mimic2 mimic28 = new Mimic2();
        addObject(mimic28,433,145);
        Mimic2 mimic29 = new Mimic2();
        addObject(mimic29,231,21);
        Mimic2 mimic210 = new Mimic2();
        addObject(mimic210,234,108);
        Mimic2 mimic211 = new Mimic2();
        addObject(mimic211,131,23);
        Mimic2 mimic212 = new Mimic2();
        addObject(mimic212,126,200);
        Mimic2 mimic213 = new Mimic2();
        addObject(mimic213,142,319);
        Mimic2 mimic214 = new Mimic2();
        addObject(mimic214,79,474);
        Mimic2 mimic215 = new Mimic2();
        addObject(mimic215,13,430);
        Mimic2 mimic216 = new Mimic2();
        addObject(mimic216,185,467);
        Mimic2 mimic217 = new Mimic2();
        addObject(mimic217,194,422);
        Mimic2 mimic218 = new Mimic2();
        addObject(mimic218,192,371);
        Mimic2 mimic219 = new Mimic2();
        addObject(mimic219,317,440);
        Mimic2 mimic220 = new Mimic2();
        addObject(mimic220,362,478);
        Mimic2 mimic221 = new Mimic2();
        addObject(mimic221,433,429);
        Mimic2 mimic222 = new Mimic2();
        addObject(mimic222,528,420);
        Mimic2 mimic223 = new Mimic2();
        addObject(mimic223,578,476);
        Mimic2 mimic224 = new Mimic2();
        addObject(mimic224,20,258);
        Mimic2 mimic225 = new Mimic2();
        addObject(mimic225,23,168);
        Mimic2 mimic226 = new Mimic2();
        addObject(mimic226,326,139);

        Spike spike = new Spike();
        addObject(spike,527,337);
        Spike spike2 = new Spike();
        addObject(spike2,548,336);
        Spike spike3 = new Spike();
        addObject(spike3,571,335);
        Spike spike4 = new Spike();
        addObject(spike4,511,449);
        Spike spike5 = new Spike();
        addObject(spike5,533,449);
        Spike spike6 = new Spike();
        addObject(spike6,551,444);
        Spike spike7 = new Spike();
        addObject(spike7,252,381);
        Spike spike8 = new Spike();
        addObject(spike8,174,399);
        Spike spike9 = new Spike();
        addObject(spike9,236,462);
        Spike spike10 = new Spike();
        addObject(spike10,176,488);
        Spike spike11 = new Spike();
        addObject(spike11,36,439);
        Spike spike12 = new Spike();
        addObject(spike12,62,492);
        Spike spike13 = new Spike();
        addObject(spike13,110,419);
        Spike spike14 = new Spike();
        addObject(spike14,64,371);
        Spike spike15 = new Spike();
        addObject(spike15,49,371);
        Spike spike16 = new Spike();
        addObject(spike16,28,367);
        Spike spike17 = new Spike();
        addObject(spike17,114,326);
        Spike spike18 = new Spike();
        addObject(spike18,162,281);
        walls33.setLocation(46,233);
        Spike spike19 = new Spike();
        addObject(spike19,102,222);
        Spike spike20 = new Spike();
        addObject(spike20,263,212);
        Spike spike21 = new Spike();
        addObject(spike21,534,178);
        removeObject(spike21);
        walls33.setLocation(23,208);
        Walls walls44 = new Walls();
        addObject(walls44,22,207);
        removeObject(walls33);
        Spike spike22 = new Spike();
        addObject(spike22,560,128);
        Spike spike23 = new Spike();
        addObject(spike23,559,188);
        Spike spike24 = new Spike();
        addObject(spike24,468,37);
        Spike spike25 = new Spike();
        addObject(spike25,471,23);
        Spike spike26 = new Spike();
        addObject(spike26,413,189);
        Spike spike27 = new Spike();
        addObject(spike27,435,189);
        Spike spike28 = new Spike();
        addObject(spike28,58,51);
        Spike spike29 = new Spike();
        addObject(spike29,82,48);
        Spike spike30 = new Spike();
        addObject(spike30,38,53);
        Spike spike31 = new Spike();
        addObject(spike31,102,55);
        Spike spike32 = new Spike();
        addObject(spike32,249,35);
        Spike spike33 = new Spike();
        addObject(spike33,279,162);
        Spike spike34 = new Spike();
        addObject(spike34,397,490);
        Spike spike35 = new Spike();
        addObject(spike35,418,491);
        Spike spike36 = new Spike();
        addObject(spike36,338,488);
        Spike spike37 = new Spike();
        addObject(spike37,365,490);
        spike37.setLocation(376,490);
        Spike spike38 = new Spike();
        addObject(spike38,376,490);
    }
}
