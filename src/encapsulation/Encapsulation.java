package encapsulation;

public class Encapsulation {

    public static void main(String[] args) {
        System.out.println("This is Encapsulation and Polymorphism\n");
        
        ProtonPersona x1 = new ProtonPersona();
        ProtonSaga x2 = new ProtonSaga();
        ProtonX50 x3 = new ProtonX50();
        ProtonX70 x4 = new ProtonX70();
        
        //ProtonPersona
        x1.setName("Proton Persona");
        System.out.println(x1.getName());
        x1.printProton();
        x1.run();
        x1.setTyre(150);
        System.out.println("Speed Limit: "+x1.getTyre()+"\n");
        
        //ProtonSaga
        x2.setName("Proton Saga");
        System.out.println(x2.getName());
        x2.printProton();
        x2.run();
        x2.setTyre(160);
        System.out.println("Speed Limit: "+x2.getTyre()+"\n");

        //ProtonX50
        x3.setName("Proton X50");
        System.out.println(x3.getName());
        x3.printProton();
        x3.run();
        x3.setTyre(180);
        System.out.println("Speed Limit: "+x3.getTyre()+"\n");

        //ProtonX70
        x4.setName("Proton x70");
        System.out.println(x4.getName());
        x4.printProton();
        x4.run();
        x4.setTyre(200);
        System.out.println("Speed Limit: "+x4.getTyre());
    }
    
}
    
