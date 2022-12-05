import java.util.ArrayList;

public class Kalean extends  Meniu{

    public ArrayList<String> articol;

    Kalean(String Nume){
        super(Nume);
        articol = new ArrayList<>();
        articol.add("Serbetli Ice Peach");
        articol.add("Serbetli Green Mix");
        articol.add("Darkside Fructe de Padure");
        articol.add("Darkside Fresh\n");
    }

    void showArticole(){
        for(int i = 0; i < articol.size(); i++){
            System.out.println(articol.get(i));
        }
    }
}