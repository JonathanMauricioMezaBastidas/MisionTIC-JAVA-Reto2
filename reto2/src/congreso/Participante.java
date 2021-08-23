package congreso;

public class Participante {
    private String nombre;
    private String especialidad;
    private int documento;
    private String empresa;

    public Participante(String nombre, String especialidad, int documento, String empresa) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.documento = documento;
        this.empresa = empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return " Nombre: " + nombre+"\n" + "\tEspecialidad: " + especialidad+"\n" + "\tDocumento: " + documento+"\n" + "\tEmpresa: " + empresa+"\n";
    }
   
}
