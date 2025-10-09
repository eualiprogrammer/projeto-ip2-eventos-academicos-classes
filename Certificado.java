package projeto_ip2_eventos_academicos;

public class Certificado {
    private String nome;
    private String areaEspecialização;
    private int cpfConcluinte;


    public Certificado(String nome, String areaEspecialização, int cpfConcluinte){
        this.nome = nome;
        this.areaEspecialização = areaEspecialização;
        this.cpfConcluinte = cpfConcluinte;
    }


    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getAreaEspecialização(){
        return areaEspecialização;
    }

    public void setAreaEspecialização(String areaEspecialização){
        this.areaEspecialização = areaEspecialização;
    }

    public int getCpfConcluinte(){
        return cpfConcluinte;
    }

    public void setCpfConcluinte(int cpfConcluinte){
        this.cpfConcluinte = cpfConcluinte;

    }










}
