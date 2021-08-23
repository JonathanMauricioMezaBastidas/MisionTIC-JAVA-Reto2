package congreso;

public class Asistente extends Participante {
    
    private int nroTicket;

    public Asistente(int nroTicket, String nombre, int documento, String especialidad, String empresa) {
        super(nombre, especialidad, documento, empresa);
        this.nroTicket = nroTicket;
    }

    public int getNroTicket() {
        return nroTicket;
    }

    public void setNroTicket(int nroTicket) {
        this.nroTicket = nroTicket;
    }

    @Override
    public String toString() {
        return "\tAsistente -" + super.toString() + "\tNo ticket: " + nroTicket+"\n";
    }
        
}
