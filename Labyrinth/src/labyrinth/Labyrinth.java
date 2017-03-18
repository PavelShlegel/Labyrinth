package labyrinth;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Labyrinth {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Школа программиста\\Documents\\NetBeansProjects\\Labyrinth\\file.txt");
        //Scanner scanner = new Scanner(new FileInputStream(file));
        LabyrinthFactory1 factory= new LabyrinthFactory1();
        Lab lab=factory.CreateNew(file);
        System.out.print(lab.toString());
        
    }
    
}
