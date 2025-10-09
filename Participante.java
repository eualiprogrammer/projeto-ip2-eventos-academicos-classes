package projeto_ip2_eventos_academicos;

public class Participante {
    private String nome;
    private String email;
    private String instituição;
    private long cpf;

 
    public Participante(String nome, String email, String instituição, long cpf) {
        this.nome = nome;
        this.email = email;
        this.instituição = instituição;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInstituição() {
        return instituição;
    }

    public void setInstituição(String instituição) {
        this.instituição = instituição;
    }

    public long getCpf(){
        return cpf;
    }

    public void setCpf(long cpf){
        this.cpf = cpf;
    }

}