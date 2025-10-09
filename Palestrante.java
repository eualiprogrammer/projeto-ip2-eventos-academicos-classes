package projeto_ip2_eventos_academicos;


public class Palestrante{
    private String nome;
    private String areaEspecialização;
    private long dadosContato;

    public Palestrante(String nome, String areaEspecialização, long dadosContato){
        this.nome = nome;
        this.areaEspecialização = areaEspecialização;
        this.dadosContato = dadosContato;

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

    public long getDadosContato(){
        return dadosContato;
    }

    public void getDadosContato(long dadosContato){
        this.dadosContato = dadosContato;
    }



}