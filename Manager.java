interface clientTalk{
    void clientNervos();
}

public class Manager extends Om implements clientTalk{ 

    public String pozitia;
    Manager(String Name, String Pozitia){
        super(Name);
        pozitia = Pozitia;
    }

    void openRestaurnt(){
        System.out.println("Restaurantul este acum deschis\n");
    }
    void vorbesteClient(){
        System.out.println("\nBuna ziua, Numele meu este " + nume + ", Eu sunt " + pozitia + ". Cu ce va pot ajuta?");
    }

    void comandaAnulata(){
        System.out.println("\nNu veti fi taxat pentru mancare. Ne cerem scuze pentru inconveniente, o seara placuta.");
    }

    void closeRestaurant(){
        System.out.println("Restaurantul a fost inchis");
    }
    public void clientNervos() {
        System.out.println("Please calm down!");
    }
}