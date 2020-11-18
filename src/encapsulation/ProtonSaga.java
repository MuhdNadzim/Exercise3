package encapsulation;
//extends = inheritance
public class ProtonSaga extends mainProton{
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
    System.out.println("Proton Saga is running");
    super.run();
}}
