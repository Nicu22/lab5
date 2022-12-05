interface clientA{
    void inscrieClient();
    void comanda();
    void propunere();
}

interface clientB{
    void clientComplaint();
    void clientManager();
}

interface clientPleaca{
    void stergeClient();
}

public class Client extends Om implements clientA, clientB, clientPleaca{
    public int numar;
    public Client(String Nume,int Numar){
        super(Nume);
        numar = Numar;
    }

    void arrClient(){
        System.out.println(nume + " " + numar + " a ajuns\n");
    }
    void payClient(){
        System.out.println(nume + " " + numar + " a platit si a plecat.\n");
    }
    public void comanda(){
        System.out.println("Clientul a facut comanda.");
    }
    public void clientComplaint(){
        System.out.println("Mancarea are un gust oribil, vreau sa vorbesc cu un Manager.");
    }
    public void clientManager(){
        System.out.println("Mancarea are un gust oribil, nu vreau sa achit asa ceva");
    }
    public void stergeClient() {
        System.out.println("Clientul a plecat");
    }
    public void inscrieClient() {
        System.out.println("Chelnerul se apropie de Client");
    }
    public void propunere() {
        System.out.println("Clientul a facut o propunere");
    }
}