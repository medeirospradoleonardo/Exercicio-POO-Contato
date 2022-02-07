import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        ArrayList<Contato> Contatos = new ArrayList<Contato>();

        Contato contato1 = new Contato();
        contato1.setNome("Leonardo Medeiros Prado");
        contato1.setTelefone("18991459434");
        // contato1.exibeContato();

        Contato contato2 = new Contato();
        contato2.setNome("Raimunda");
        contato2.setTelefone("18991896572");
        // contato2.exibeContato();

        Contatos.add(contato1);
        Contatos.add(contato2);

        System.out.println(Contatos);

        for(Contato c : Contatos){
            c.exibeContato();
        }


        
    }
    
}
