package congreso;

public class Conferencista extends Participante {
    
    private int horaCharla;

    public Conferencista(int horaCharla, String nombre, int documento, String especialidad, String empresa) {
        super(nombre, especialidad, documento, empresa);
        this.horaCharla = horaCharla;
    }
    
    public int getHoraCharla() {
        return horaCharla;
    }

    public void setHoraCharla(int horaCharla) {
        this.horaCharla = horaCharla;
    }

    @Override
    public String toString() {
        return "\tConferencista -" + super.toString()+ "\tHora charla: " + horaCharla+"\n";
    }
    
}
