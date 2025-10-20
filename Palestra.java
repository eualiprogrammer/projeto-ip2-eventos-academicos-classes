package projeto_ip2_eventos_academicos;

public class Palestra {
    private String titulo;
    private String descrição;
    private int duraçãoHoras;
    private LocalDate horario;
    private Palestrante palestrante;
    private ArrayList<Participante> participantes;
    private Sala sala;

    public Palestra(String titulo, String descrição, int duraçãoHoras, String horario, Palestrante palestrante, Participante participantes, Sala sala) {
        this.titulo = titulo;
        this.descrição = descrição;
        this.duraçãoHoras = duraçãoHoras;
        this.horario = horario;
        this.palestrante = palestrante;
        this.participantes = new ArrayList<>();
        this.sala = sala;
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public void setHorario(String horario) {
        this.horario = horario;
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




















