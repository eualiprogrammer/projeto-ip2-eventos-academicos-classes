package projeto_ip2_eventos_academicos;

public class Sala {
    private int numeroMaximoAssentos;
    private int numeroProjetores;
    private int numeroCaixasSom;

     
    public Sala(int numeroMaximoAssentos, int numeroProjetores, int numeroCaixasSom) {
        this.numeroMaximoAssentos = numeroMaximoAssentos;
        this.numeroProjetores = numeroProjetores;
        this.numeroCaixasSom = numeroCaixasSom;
    }

    // Getters e Setters
    public int getNumeroMaximoAssentos() {
        return numeroMaximoAssentos;
    }

    public void setNumeroMaximoAssentos(int numeroMaximoAssentos) {
        this.numeroMaximoAssentos = numeroMaximoAssentos;
    }

    public int getNumeroProjetores() {
        return numeroProjetores;
    }

    public void setNumeroProjetores(int numeroProjetores) {
        this.numeroProjetores = numeroProjetores;
    }

    public int getNumeroCaixasSom(){
        return numeroCaixasSom;
    }

    public void setNumeroCaixasSom(int numeroCaixasSom){
        this.numeroCaixasSom = numeroCaixasSom;
    }


} 