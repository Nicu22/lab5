import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
   
    public static  void main(String[] args){

        //String numele[];
        String nume[] = new String[11];
        int a = 0;
       try {
            File myObj = new File("nume.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                nume[a] = data;
                a++;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        int numeRandom = (int) ((Math.random() * (11 - 1)) + 1);
        Restaurant res = new Restaurant();
        res.showRestaurant();


        Chelner ch1 = new Chelner(nume[numeRandom]);
        Client c1 = new Client("Clientul", 1);
        Manager m1 = new Manager("Ion", "Manager General");
        m1.openRestaurnt();
        Bar b1 = new Bar("Bar");
        Bufet bufet1 = new Bufet("Bufet");
        Kalean k1 = new Kalean("Kalean");

        int ch;
        Scanner scan = new Scanner(System.in);
        
        

        do {
            System.out.println("Introduceti 1 pentru scenariul normal");
            System.out.println("Introduceti 2 pentru scenariul in care se anuleaza comanda");
            System.out.println("Introduceti 3 pentru scenariul in care se schimba comanda");
            System.out.println("Introduceti 4 pentru eveniment special");
            System.out.println("Introduceti 0 pentru a opri programul");
            System.out.println("Introduceti alegerea dumneavoastra");
            ch = scan.nextInt();
            switch (ch){
                case 1://Everything is normal
                    c1.arrClient();
                    ch1.intalnesteClient();
                    ch1.showMeniu();
                    int meniu1 = (int) ((Math.random() * (4 - 1)) + 1);
                    if(meniu1 == 1) {
                        System.out.println("Clientul a ales meniul " + b1.nume);
                        b1.showArticole();
                    } else if (meniu1 == 2) {
                        System.out.println("Clientul a ales meniul " + bufet1.nume);
                        bufet1.showArticole();
                    }else {
                        System.out.println("Clientul a ales meniul " + k1.nume);
                        k1.showArticole();
                    }
                    c1.comanda();
                    ch1.comanda();
                    c1.payClient();
                    break;
                case 2:
                    c1.arrClient();
                    ch1.intalnesteClient();
                    ch1.showMeniu();
                    int m2 = (int) ((Math.random() * (4 - 1)) + 1);
                    if(m2 == 1) {
                        System.out.println("Clientul a ales meniul " + b1.nume);
                        b1.showArticole();
                    } else if (m2 == 2) {
                        System.out.println("Clientul a ales meniul " + bufet1.nume);
                        bufet1.showArticole();
                    }else {
                        System.out.println("Clientul a ales meniul " + k1.nume);
                        k1.showArticole();
                    }
                    c1.comanda();
                    ch1.stergeComanda();
                    int i = (int) ((Math.random() * (3 - 1)) + 1);
                    if(i == 1){
                        ch1.schimbaComanda();
                        c1.payClient();
                    }else{
                        c1.stergeClient();
                    }
                    break;
                case 3:
                    c1.arrClient();
                    ch1.intalnesteClient();
                    ch1.showMeniu();
                    int m3 = (int) ((Math.random() * (4 - 1)) + 1);
                    if(m3 == 1) {
                        System.out.println("Clientul a ales meniul " + b1.nume);
                        b1.showArticole();
                    } else if (m3 == 2) {
                        System.out.println("Clientul a ales meniul " + bufet1.nume);
                        bufet1.showArticole();
                    }else {
                        System.out.println("Clientul a ales meniul " + k1.nume);
                        k1.showArticole();
                    }
                    c1.comanda();
                    c1.clientManager();
                    m1.vorbesteClient();
                    c1.clientComplaint();
                    m1.comandaAnulata();
                    c1.payClient();
                    break;
                case 4:
                    c1.arrClient();
                    c1.inscrieClient();
                    ch1.intalnesteClient();
                    
                    ch1.showMeniu();
                    c1.comanda();
                    c1.propunere();
                    ch1.tortSurpriza();
                    ch1.cantec();
                    c1.payClient();

                    break;
                case 0: break;
                default:
                    System.out.println("Ati introdus gresit");
                    break;

            }
            //scan.close();


        }while(ch != 0);
        m1.closeRestaurant();

    }
}
