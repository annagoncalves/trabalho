
package classes;

import classes.Passageiro;

/**
 *
 * @author anna
 */
public class Poltrona {

    private int numero;
    private Passageiro passageiro;

    public Poltrona() {
    }

    public Poltrona(int numero, Passageiro passageiro) {
        //o metodo this acesso o atributo numero...passageiro.
        this.numero = numero;
        this.passageiro = passageiro;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
// para retornar o nome do passageiro...
    public String getPassageiro2() {

        if (passageiro == null) {
            return "Poltrona Vazia";
        } else {
            return passageiro.getNome();
        }
    }

}
