package labyrinth;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LabyrinthFactory1 extends LabyrinthFactory {
    @Override
    public Lab CreateNew(File f) throws FileNotFoundException{
        int hight;
        int width;
        Scanner scanner = new Scanner(new FileInputStream(f));
        hight=scanner.nextInt();
        width=scanner.nextInt();
        int [][] field= new int[hight][width];
        for(int i=0;i<hight;i++){
            for(int j=0;j<width;j++){
                field[i][j]=scanner.nextInt();
            }
        }
        Lab lab= new Lab1(field,hight,width);
        return(lab);
    }
}
