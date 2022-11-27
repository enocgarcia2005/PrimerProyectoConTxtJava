package Code;

public class Empleados {

    String Nombre;
    String ApellidoP;
    String ApellidoM;
    String Area;
    double Tiempo;
    String Categoria;
    double Sueldo;
    double AsignacionDeM;
    int Hijos;
    double AFP;
    double SueldoF;

    public Empleados(String Nombre, String Area, double Tiempo, double Sueldo, String Categoria) {
        this.Nombre = Nombre;
        this.Area = Area;
        this.Tiempo = Tiempo;
        this.Sueldo = Sueldo;
        this.Categoria = Categoria;
    }

    public Empleados() {
    }

    public Empleados(String Nombre, String ApellidoP, String ApellidoM, String Area, double Tiempo, String Categoria, double Sueldo, double AsignacionDeM, int Hijos, double AFP, double SueldoF) {
        this.Nombre = Nombre;
        this.ApellidoP = ApellidoP;
        this.ApellidoM = ApellidoM;
        this.Area = Area;
        this.Tiempo = Tiempo;
        this.Categoria = Categoria;
        this.Sueldo = Sueldo;
        this.AsignacionDeM = AsignacionDeM;
        this.Hijos = Hijos;
        this.AFP = AFP;
        this.SueldoF = SueldoF;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public double getTiempo() {
        return Tiempo;
    }

    public void setTiempo(double Tiempo) {
        this.Tiempo = Tiempo;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getApellidoP() {
        return ApellidoP;
    }

    public void setApellidoP(String ApellidoP) {
        this.ApellidoP = ApellidoP;
    }

    public String getApellidoM() {
        return ApellidoM;
    }

    public void setApellidoM(String ApellidoM) {
        this.ApellidoM = ApellidoM;
    }

    public double getAsignacionDeM() {
        return AsignacionDeM;
    }

    public void setAsignacionDeM(double AsignacionDeM) {
        this.AsignacionDeM = AsignacionDeM;
    }

    public int getHijos() {
        return Hijos;
    }

    public void setHijos(int Hijos) {
        this.Hijos = Hijos;
    }

    public double getAFP() {
        return AFP;
    }

    public void setAFP(double AFP) {
        this.AFP = AFP;
    }

    public double getSueldoF() {
        return SueldoF;
    }

    public void setSueldoF(double SueldoF) {
        this.SueldoF = SueldoF;
    }

}
