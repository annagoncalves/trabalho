
package classes;

/**
 *
 * @author anna
 */
// aqui aplica se herança pois passageiro herda de pessoa alguns atributos.
public class Passageiro extends Pessoa{

    private String codigoPassageiro;

    public Passageiro(String codigoPassageiro) {
        this.codigoPassageiro = codigoPassageiro;
    }
//sobrecarga de construtores pois a classe passageiro tem varios atributos do mesmo tipo
   
    public Passageiro(String codigoPassageiro, String nome, String telefone, String cpf, String endereco) {
        super(nome, telefone, cpf, endereco);
        this.codigoPassageiro = codigoPassageiro;
    }

    public String getCodigoPassageiro() {
        return codigoPassageiro;
    }

    public void setCodigoPassageiro(String codigoPassageiro) {
        this.codigoPassageiro = codigoPassageiro;
    } 

}
