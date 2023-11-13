import java.util.ArrayList;

public class Module {
    public String moduleName; 
    public String moduleCode;
    
    public Module(String moduleName, String moduleCode){
       this.moduleName = moduleName;
       this.moduleCode = moduleCode;
       
    
       
    }

    ArrayList<Module> modules = new ArrayList<Module>();

    public void print() {
          Module myModule = new Module("Programming Concepts", "History");
          
        modules.add(myModule);

        modules.add(new Module("Maths", "Science"));

        for (Module module : modules) {
         System.out.println(module.moduleName);   
        }

          


    }

}

