package labyrinth;

import java.util.HashMap;
import java.util.Map;

public class Lab1 extends Lab{
    int[][] field;
    int hight;
    int width;
    HashMap<Player, Coordinates> players=new HashMap<Player, Coordinates>();
    public Lab1(int[][] field,int h, int w){
        this.field=field;
        this.hight=h;
        this.width=w;
    }
    
    public Coordinates getPosition(Player p){
        return players.get(p);
    }
    
    public void putPosition(Player p, Coordinates coord){
        this.players.put(p, coord);
    }
    
    public void addPlayer(Player p, Coordinates coord){
        this.players.put(p, coord);
    }
    
    public void moveLeft(Player p){
        Coordinates c=this.getPosition(p);
        c.x-=1;
    }
    public void moveRight(Player p){
        Coordinates c=this.getPosition(p);
        c.x+=1;
    }
    public void moveUp(Player p){
        Coordinates c=this.getPosition(p);
        c.y+=1;
    }
    public void moveDown(Player p){
        Coordinates c=this.getPosition(p);
        c.y-=1;
    }
    
    public boolean canMoveLeft(Player p){
        Coordinates c=this.getPosition(p);
        if(c.x-1==1 || c.x==0)
            return false;
        else
            return true;
    }
    public boolean canMoveRight(Player p){
        Coordinates c=this.getPosition(p);
        if(c.x+1==1 || c.x==width)
            return false;
        else
            return true;
    }
    public boolean canMoveUp(Player p){
        Coordinates c=this.getPosition(p);
        if(c.y+1==1 || c.y==hight)
            return false;
        else
            return true;
    }
    public boolean canMoveDown(Player p){
        Coordinates c=this.getPosition(p);
        if(c.y-1==1 || c.y==0)
            return false;
        else
            return true;
    }
    @Override
    public String toString(){
        String t="";
        boolean b=false;
        for(int i=0;i<hight;i++){
            for(int j=0;j<width;j++){
                for(Map.Entry<Player, Coordinates> entry:players.entrySet()){
                    if(i==entry.getValue().x && j==entry.getValue().y){
                        b=true;
                    }
                }
                if(b){
                    t=t+"P";
                }
                else{
                    if(field[i][j]==1){
                    t=t+"#";
                }
                if(field[i][j]==0){
                    t=t+" ";
                }
                }                
                b=false;
            }
            t=t+"\n";
        }  
        return t;
    }
}
