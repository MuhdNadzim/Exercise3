package encapsulation;

public class mainProton {    
    
    String brand, windows, headlight;
    int tyreSize;
    
mainProton(){
    this.brand="Dunlop";
    this.tyreSize=28;
}
mainProton(String a, String b){
    this.windows=a;
    this.headlight=b;
}

public void printProton(){
    mainProton m = new mainProton();
    mainProton m1 = new mainProton("Up","On");
        
    System.out.println("Tyre Brand: "+m.brand);
    System.out.println("Tyre Size: "+m.tyreSize);
    System.out.println("Windows: "+m1.windows);
    System.out.println("Headlight: "+m1.headlight);

}
void run() {//polymorphism
	System.out.println("This vehicle is running");
}
}