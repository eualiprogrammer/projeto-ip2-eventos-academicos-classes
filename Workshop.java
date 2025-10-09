package projeto_ip2_eventos_academicos;

public class Workshop{

    private String título;
    private String descrição;
    private float duraçãoHoras;
    private String horário;
    private Palestra palestra;
    private Participante participante;

    public Workshop(String título, String descrição, float duraçãoHoras, String horário, Palestra palestra, Participante participante) {
        this.título = título;
        this.descrição = descrição;
        this.duraçãoHoras = duraçãoHoras;
        this.horário = horário;
        this.palestra = palestra;
        this.participante = participante;
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

    public float getDuraçãoHoras() {
        return duraçãoHoras;
    }

    public void setDuraçãoHoras(float duraçãoHoras) {
        this.duraçãoHoras = duraçãoHoras;
    }

    public String getHorário() {
        return horário;
    }

    public void setHorário(String horário) {
        this.horário = horário;
    }

    public Palestra getPalestra() {
        return palestra;
    }

    public void setPalestra(Palestra palestra) {
        this.palestra = palestra;
    }

    public Participante getParticipante(){
        return participante;
    }

    public void setParticipante(Participante participante){
        this.participante = participante;
    }

}
    

