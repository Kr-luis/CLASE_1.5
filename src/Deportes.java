public class Deportes {
    private String deporte;
    private String sanciones;
    private String Pmedicas;

    public Deportes(String deporte, String sanciones, String pmedicas) {
        this.deporte = deporte;
        this.sanciones = sanciones;
        Pmedicas = pmedicas;
    }

    public String getDeporte() {
        return deporte;
    }

    public String getSanciones() {
        return sanciones;
    }

    public String getPmedicas() {
        return Pmedicas;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public void setSanciones(String sanciones) {
        this.sanciones = sanciones;
    }

    public void setPmedicas(String pmedicas) {
        Pmedicas = pmedicas;
    }

    public void Validar_Edad(){ }
    public void Desc(){ }
    public void Validar_requerimientos(String sanciones, String Pmedicas) {
        if(getSanciones().equals("SI") && getPmedicas().equals("SI")) {
            System.out.println("Cumple con la entrega de sanciones y de pruebas medicas");
        }else{System.out.println("No cumple con los requisitos solicitados");}

    }

    public static void main(String[] args){
        Futbol niño1 = new Futbol("Futbol","SI","SI","Juan","Perez",17,3,"Delantero");
        Basquet niño2 = new Basquet("Basquet","SI","NO","Luis","Garcia",18,4,"Libero");

        System.out.println("Niño uno");
        niño1.Desc();
        niño1.Validar_Edad(17);
        niño1.Validar_requerimientos("SI","SI");
        System.out.println( );
        System.out.println("Niño dos");
        niño2.Desc();
        niño2.Validar_Edad(18);
        niño2.Validar_requerimientos("SI","NO");
    }
}

