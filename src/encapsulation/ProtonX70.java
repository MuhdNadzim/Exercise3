package encapsulation;
//extends = inheritance
public class ProtonX70 extends mainProton {
     //Encapsulation   
    private String name;
    private int tyre;
    
    public void setName(String newName){
       name = newName;
    }  
    
    public String getName(){
        return name;
    }
    
    public void setTyre(int newTyre){
        tyre = newTyre;
    }
    
    public int getTyre(){
        return tyre;
    }
void run() {//polymorphism
	System.out.println("Proton X70 is running");
        super.run();   
}
}