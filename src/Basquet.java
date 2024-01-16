public class Basquet extends Deportes{
    private String nombreB;
    private String apellidoB;
    private int edadB;
    private int aptitudB;
    private String posicionB;

    public Basquet(String deporte, String sanciones, String Pmedicas,String nombreB, String apellidoB, int edadB, int aptitudB, String posicionB) {
        super(deporte, sanciones, Pmedicas);
        this.nombreB = nombreB;
        this.apellidoB = apellidoB;
        this.edadB = edadB;
        this.apellidoB = apellidoB;
        this.posicionB = posicionB;
    }

    public String getNombreB() {
        return nombreB;
    }

    public String getApellidoB() {
        return apellidoB;
    }

    public int getEdadB() {
        return edadB;
    }

    public int getAptitudB() {
        return aptitudB;
    }

    public String getPosicionB() {
        return posicionB;
    }

    public void setNombreB(String nombreB) {
        this.nombreB = nombreB;
    }

    public void setApellidoB(String apellidoB) {
        this.apellidoB = apellidoB;
    }

    public void setEdadB(int edadB) {
        this.edadB = edadB;
    }

    public void setAptitudB(int aptitudB) {
        this.aptitudB = aptitudB;
    }

    public void setPosicionB(String posicionB) {
        this.posicionB = posicionB;
    }

    public void Desc() {
        System.out.println("Deporte: " + getDeporte());
        System.out.println("Nombre y apellido:" + getNombreB() + " " + getApellidoB());
        System.out.println("Edad: " + getEdadB());
        System.out.println("Reporte_Sanciones: " + getSanciones());
        System.out.println("Pruebas_medicas: " +getPmedicas());
    }
    public void Validar_Edad(int edadB){
        try{
            System.out.println("Verificando edad");
            if(getEdadB() >= 18){
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
