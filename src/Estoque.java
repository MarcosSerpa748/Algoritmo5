import java.util.ArrayList;

public class Estoque{
    private ArrayList<Medicamento> medicamentos = new ArrayList<>();


    public void adicionarMedicamento(Medicamento m){
        this.medicamentos.add(m);
    }

    public void percorrerList(){

        for(int i = 0;i<=medicamentos.size()-1;i++){
            System.out.println(medicamentos.get(i));
        }
    }

    public ArrayList<Medicamento> medicamentosBaratosSemReceita(){
        ArrayList<Medicamento> medicamentosBaratosSemReceita = new ArrayList<>();

        for(int i = 0;i<=this.medicamentos.size()-1;i++){

            Medicamento m = this.medicamentos.get(i);

            if (m.getPreco() < 50.00 && !m.getPrecisaReceita()){
                medicamentosBaratosSemReceita.add(m);
            }
        }
        return medicamentosBaratosSemReceita;
    }
}
