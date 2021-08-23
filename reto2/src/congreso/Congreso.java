package congreso;

import java.util.Scanner;

public class Congreso {

    protected String nameCongreso;
    protected Participante[] participantes;
    private int n;

    public Congreso(String nombreCongreso) {
        this.nameCongreso = nombreCongreso;
        this.participantes = new Participante[100];
        this.n = 0;
    }

    public void addConferencista(Conferencista profesor) {
        this.participantes[n] = profesor;
        n++;
    }

    public void addParticipante(Asistente asistente) {
        this.participantes[n] = asistente;
        n++;
    }

    public void listarParticipantes() {
        System.out.println("***Participantes Congreso***");
        for (int i = 0; i < n; i++) {
            System.out.println(this.participantes[i]);
        }
    }

    public void procesarComandos() {
        int opc;
        Scanner sc = new Scanner(System.in);
        String nombre, empresa, especialidad;
        int documento, horaCharla, nroTicket;
        do {
            String x = sc.nextLine();
            String[] arreglo = x.split(";");
            opc = Integer.parseInt(arreglo[0]);
            switch (opc) {
                case 1:
                    nombre = arreglo[2];
                    especialidad = arreglo[3];
                    documento = Integer.parseInt(arreglo[4]);
                    empresa = arreglo[5];
                    horaCharla = Integer.parseInt(arreglo[6]);
                    if (arreglo[1].equals("Conferencista")) {
                        Conferencista profesor = new Conferencista(horaCharla, nombre, documento, especialidad, empresa);
                        this.addConferencista(profesor);
                    } else {
                        nroTicket = Integer.parseInt(arreglo[6]);
                        Asistente asistente = new Asistente(nroTicket, nombre, documento, especialidad, empresa);
                        this.addParticipante(asistente);
                    }
                    break;
                case 2:
                    listarParticipantes();
                    break;
                case 3:

                    break;

            }
        } while (opc != 3);

    }
    // FUNCIÓN PRINCIPAL
    public static void main(String[] args) {
        Congreso congreso1 = new Congreso("Congreso Nacional de Computacion");
        congreso1.procesarComandos();
    }

}
