import java.util.ArrayList;

public class Bufet extends  Meniu{

    public ArrayList<String> articol;

    Bufet(String Nume){
        super(Nume);
        articol = new ArrayList<>();
        articol.add("Burgher");
        articol.add("Zeama");
        articol.add("Salata Greceasca");
        articol.add("Pasta Bolognese\n");
    }

    void showArticole(){
        for(int i = 0; i < articol.size(); i++){
            System.out.println(articol.get(i));
        }
    }
}