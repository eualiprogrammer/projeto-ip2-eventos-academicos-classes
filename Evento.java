package projeto_ip2_eventos_academicos;

public class Evento {
    private String workshop;


    public Evento(String workshop){
    this.workshop = workshop;
}

public String getWorkshop(){
    return workshop;
}

public void setWorkshop(String workshop){
    this.workshop = workshop;
}


}