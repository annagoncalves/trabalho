
package classes;

import interfaces.IAviao;
import java.util.ArrayList;

/**
 *
 * @author anna
 */
public class Aviao implements IAviao {
//programação generica pois utiliza a arraylist
    private ArrayList<Poltrona> poltronas = new ArrayList<>();

    private int lugares_livres;
    private int lugares;
    private String origem;
    private String destino;
    private String horario_saida;
    private String horario_chegada;
    private double valor_passagem;

    // origem, destino e quantidade de lugares
    //sobrecarga de metodos pois um classe avião tera varios atributos do mesmo tipo.
    public Aviao(String origem, String destino, int lugares, String saida, String chegada, double valor) {
        this.origem = origem;
        this.destino = destino;
        this.lugares = lugares;
        this.horario_saida = saida;
        this.horario_chegada = chegada;
        this.lugares_livres = lugares;
        this.valor_passagem = valor;

        //Cria todas as posições no arrayList com objeto poltrona
        //Adiciona o numero para poltrona e null para indicar que não tem passageiro        
        for (int i = 1; i < lugares; i++) {
// instancie poltrona
            Poltrona p = new Poltrona(i, null);

            this.poltronas.add(p);
        }

    }

    @Override
    public String adicionarPassageiro(int lugar, Passageiro passageiro) {

        if (this.lugares_livres == 0) {
            return "Avião cheio";
        }

        if (lugar <= 0 || lugar > this.lugares - 1) {
            return "Poltrona inválida";
        }

        Poltrona poltrona = this.poltronas.get(lugar);

        if (poltrona.getPassageiro() != null) {
            return "Essa poltrona já está ocupada";
        }

        poltrona.setPassageiro(passageiro);

        this.poltronas.set(lugar, poltrona);

        this.lugares_livres--;

        return "Passageiro adicionado com sucesso";
    }

    @Override
    // nao esta definido a quantidade de poltronas, sera na execução do programa
    public ArrayList<Poltrona> listaPasageiros() {
       return poltronas;
    }

}
