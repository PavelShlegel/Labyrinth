package labyrinth;

import java.util.Random;

public class Strategy implements Runnable {
    Player p;
    Lab1 l;
    public void Strategy(Player p, Lab1 l){
        this.p=p;
        this.l=l;
    }
    @Override
    public void run(){
        int t;
        boolean b=true;
        Random rand=new Random();
        while(b){
            t=rand.nextInt(4);
            switch(t){
                case 0:{
                    if(l.canMoveLeft(p)){
                        l.moveLeft(p);
                        b=false;
                        break;
                    }
                    else                        
                        break;                    
                }
                case 1:{
                    if(l.canMoveUp(p)){
                        l.moveUp(p);
                        b=false;
                        break;
                    }
                    else                        
                        break;
                }
                case 2:{
                    if(l.canMoveRight(p)){
                        l.moveRight(p);
                        b=false;
                        break;
                    }
                    else                        
                        break;
                }
                case 3:{
                    if(l.canMoveDown(p)){
                        l.moveDown(p);
                        b=false;
                        break;
                    }
                    else                        
                        break;
                }
            }
        }
    }
}
