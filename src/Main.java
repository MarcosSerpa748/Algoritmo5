import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Estoque e1 = new Estoque();

        Medicamento m1 = new Medicamento("Lorazepam",75.99,true,5);
        Medicamento m2 = new Medicamento("Clonazepam",20.99,false,2);

        e1.adicionarMedicamento(m1);
        e1.adicionarMedicamento(m2);

        ArrayList<Medicamento> medicamentosBaratosSemReceita = e1.medicamentosBaratosSemReceita();

        for (int i = 0;i<=medicamentosBaratosSemReceita.size()-1;i++){
            System.out.println(medicamentosBaratosSemReceita.get(i));
        }
    }
}