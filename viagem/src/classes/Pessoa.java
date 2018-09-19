
package classes;

/**
 *
 * @author anna
 */
public class Pessoa {

    private String nome;
    private String telefone;
    private String cpf;
    private String endereco;

    public Pessoa() {
    }
    //Aqui tem sobrecarga de construtores pois a classe pessoa tem varios atributos 
    //do mesmo tipo 'parametro'
    
    public Pessoa(String nome, String telefone, String cpf, String endereco) {
       //permite que o metodo acesso o atributo (this )
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
}