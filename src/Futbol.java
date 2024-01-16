public class Futbol extends Deportes{
    private String nombreF;
    private String apellidoF;
    private int edadF;
    private int aptitudF;
    private String posicion;

    public Futbol(String deporte, String sanciones, String Pmedicas, String nombreF, String apellidoF, int edadF, int aptitudF, String posicion) {
        super(deporte, sanciones, Pmedicas);
        this.nombreF = nombreF;
        this.apellidoF = apellidoF;
        this.edadF = edadF;
        this.aptitudF = aptitudF;
        this.posicion = posicion;
    }

    public String getNombreF() {
        return nombreF;
    }

    public String getApellidoF() {
        return apellidoF;
    }

    public int getEdadF() {
        return edadF;
    }
    public int getAptitudF() {
        return aptitudF;
    }
    public String getPosicion() {
        return posicion;
    }
    public void setNombreF(String nombreF) {
        this.nombreF = nombreF;
    }

    public void setApellidoF(String apellidoF) {
        this.apellidoF = apellidoF;
    }

    public void setEdadF(int edadF) {
        this.edadF = edadF;
    }
    public void setAptitudF(int aptitudF) {
        this.aptitudF = aptitudF;
    }
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    public void Desc() {
        System.out.println("Deporte: " + getDeporte());
        System.out.println("Nombre y apellido:" + getNombreF() + " " + getApellidoF());
        System.out.println("Edad: " + getEdadF());
        System.out.println("Posicion: " +getPosicion());
        System.out.println("Reporte_Sanciones: " + getSanciones());
        System.out.println("Pruebas_medicas: " +getPmedicas());
    }
    public void Validar_Edad(int edadF){
        try{
            System.out.println("Verificando edad");
            if(getEdadF() >= 18){
                System.out.println("El estudiante es mayor de edad");
            }else{System.out.println("El jugador es menor de edad");}
        }catch (Exception e) {
            if (e.getMessage() != null && e.getMessage().equals("0")) {
                System.out.println("Error inesperado: LA EDAD NO PUEDE SER CERO");
            } else {
                System.out.println("Error inesperado: " + e.getMessage());
            }
        }finally {
            System.out.println("Requerimientos: ");
        }
    }
}
