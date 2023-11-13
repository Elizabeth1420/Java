import java.util.ArrayList;

public class Module {
    public String moduleName; 
    public String moduleCode;
    
    public Module(String moduleName, String moduleCode){
       this.moduleName = moduleName;
       this.moduleCode = moduleCode;
       
    
       
    }

    public void print() {
          Module myConst = new module("Programming Concepts", "History");
          System.out.println(myConst.moduleName);
          System.out.println(myConst.moduleCode);

          module[0] = "Programming Concept";
          module[1] = "History"; 
          module[2] = "Physical Education"; 


       }

}