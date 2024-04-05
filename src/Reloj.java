public class Reloj {

    String horaFalsa;
    String minFalso;
    String segFalso;
    private int hora, minuto, segundo;
    int horas;
    String minutos;
    boolean tarde = true;


    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public Reloj() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
    public String getHoraFalsa() {
        return horaFalsa;
    }
    public void setHoraFalsa(String horaFalsa) {
        this.horaFalsa = horaFalsa;
    }
    public String getMinFalso() {
        return minFalso;
    }
    public void setMinFalso(String minFalso) {
        this.minFalso = minFalso;
    }
    public String getSegFalso() {
        return segFalso;
    }
    public void setSegFalso(String segFalso) {
        // Esta es el comentario para modificar la rama
        this.segFalso = segFalso;
    }
        public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void setSegundo(int segundo) {
        //Este es el comentario para crear conflicto rama
        this.segundo = segundo;
    }

        public int getHoras() {
            return horas;
        }
    
        public void setHoras(int horas) {
            this.horas = horas;
        }
    
        public String getMinutos() {
            return minutos;
        }
    
        public void setMinutos(String minutos) {
            this.minutos = minutos;
        }
    
        public boolean isTarde() {
            return tarde;
        }
    
        public void setTarde(boolean tarde) {
    
            // estamos probando los cambios en las ramas de los demas Jose Borras
    
            this.tarde = tarde;

        } 
}

