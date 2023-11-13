import java.util.ArrayList;

public class CourseCode {
    String code; 
    String name; 
    ArrayList<Module> modules = new ArrayList();
    
    ArrayList<String> strings = new ArrayList<String>();
    public void print() { 
        System.out.println("Code: " + this.code);
        System.out.println("Name: " + this.code);
        for(int i = 0; i < modules.size(); i++){
            System.out.println(modules.get(i).moduleName +" " + modules.get(i).moduleCode);
        }

    }
}