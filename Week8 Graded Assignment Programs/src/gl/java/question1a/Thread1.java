package gl.java.question1a;

import java.util.ArrayList;
import java.util.HashMap;

public class Thread1 {

	private HashMap<Project, ArrayList<Employee>> hMap;

    public Thread1(HashMap<Project, ArrayList<Employee>> hMap) {
        this.hMap = hMap;
    }

    public synchronized void serialize() {
        // Serialization logic
        System.out.println("Serialize called by Producer");
        // ..... Code to invoke serialization
        
        
        
        
    }

    public synchronized void deserialize() {
        // DeSerialization logic
        System.out.println("DeSerialize Called by Consumer");
        // ..... Code to invoke DeSerialization
        
        
        
    }

}
