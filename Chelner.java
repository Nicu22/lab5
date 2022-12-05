interface sarbatori{
    void tortSurpriza();
    void cantec();
}

interface anulareComanda{
    void stergeComanda();
    void schimbaComanda();
}

public class Chelner extends Om implements sarbatori, anulareComanda{


    public Chelner(String Nume){
        super(Nume);
    }

    public void intalnesteClient(){
        System.out.println("Buna ziua, numele meu este " + nume + ", astazi voi fi chelnerul dumneavoastra");
    }

    public void showMeniu(){
        System.out.println("Avem 2 meniuri pentru dumneavoastra: Bar si Bufet, iar daca doriti avem si Kalean. Care vreti sa il vedeti?\n");
    }

    public void comanda(){
        System.out.println("Aici este comanda dumneavoastra, pofta buna!\n");
    }

    public  void stergeComanda(){
        System.out.println("Chelnerul a anulat comanda");
        System.out.println("Ne cerem scuze, doriti sa faceti alta comanda?\n");
    }
    public void schimbaComanda(){
        System.out.println("Ne cerem scuze de inconviniente, poftim comanda noua. Pofta Buna!\n");
    }

    public void tortSurpriza(){
        System.out.println("Un tort surpriza a fost adus la masa");
    }
    public void cantec() {
        System.out.println("Un grup de chelneri incep a canta HAPPY BIRTHDAY");
    }
}