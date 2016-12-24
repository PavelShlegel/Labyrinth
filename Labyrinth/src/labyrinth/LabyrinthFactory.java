package labyrinth;

import java.io.File;
import java.io.FileNotFoundException;

public abstract class LabyrinthFactory {
    public abstract Lab CreateNew(File f)throws FileNotFoundException;
}
