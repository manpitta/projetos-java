package Atividade1;

public class Funcionarios {
    private String nome;
    private int idade;
    private String cargo;
    private String situacao;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getSituacao() {
        return situacao;
    }

    public Funcionarios(String nome, int idade, String cargo, String situacao) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setCargo(cargo);
        this.setSituacao(situacao);
    }

    public String demitirFuncionario(){
        return this.situacao = "Inativo";
    }
    public int aniversario(){
        return this.idade = ++idade;
    }

    public String pagarSalario(){

        return "seu salário foi devidamente pago!" ;
    }

    public String trocarCargoFuncionario(String cargo){
        if (cargo == "Cientista Político" ){
            return this.cargo ="Pesquisador Head no Instituto Vero.";
        } else {
            return this.cargo ="Analista de testes SR";
        }
    }
}
