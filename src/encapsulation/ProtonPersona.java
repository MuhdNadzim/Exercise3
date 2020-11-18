package encapsulation;

public class ProtonPersona extends mainProton {
    //Encapsulation   
    private String name;
    private int tyre;
  
class Persona{
    public void sound(){
        System.out.println("Voice Control");
    }
}
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
	System.out.println("Proton Persona is running");
        super.run();
}
}