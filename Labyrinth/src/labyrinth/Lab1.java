package labyrinth;

public class Lab1 extends Lab {
    int[][] field;
    int hight;
    int width;
    public Lab1(int[][] field,int h, int w){
        this.field=field;
        this.hight=h;
        this.width=w;
    }
    @Override
    public String toString(){
        String t="";
        for(int i=0;i<hight;i++){
            for(int j=0;j<width;j++){
                if(field[i][j]==1){
                    t=t+"0";
                }
                if(field[i][j]==0){
                    t=t+" ";
                }
            }
            t=t+"\n";
        }  
        return t;
    }
}
