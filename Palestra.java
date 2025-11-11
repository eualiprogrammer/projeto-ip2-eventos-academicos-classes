package projeto_ip2_eventos_academicos;

//ignore esse pull request

public class Palestra {
    private String título;
    private String descrição;
    private int duraçãoHoras;
    private LocalDate horário;
    private Palestrante palestrante;
    private ArrayList<Participante> participantes;
    private Sala sala;

    public Palestra(String título, String descrição, int duraçãoHoras, String horário, Palestrante palestrante, Participante participantes, Sala sala) {
        this.título = título;
        this.descrição = descrição;
        this.duraçãoHoras = duraçãoHoras;
        this.horário = horário;
        this.palestrante = palestrante;
        this.participantes = new ArrayList<>();
        this.sala = sala;
    }

    // Getters e Setters
    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public int getDuraçãoHoras() {
        return duraçãoHoras;
    }

    public void setDuraçãoHoras(int duraçãoHoras) {
        this.duraçãoHoras = duraçãoHoras;
    }

    public String getHorário() {
        return horário;
    }

    public void setHorário(String horário) {
        this.horário = horário;
    }

    public Palestrante getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(Palestrante palestrante) {
        this.palestrante = palestrante;
    }

    public Participante getParticipantes(){
        return participantes;
    }

    public void setParticipantes(Participante participantes){
        this.participantes = participantes;
    }

    public Sala getSala(){
        return sala;
    }

    public void setSala(Sala sala){
        this.sala = sala;
    }

}




















