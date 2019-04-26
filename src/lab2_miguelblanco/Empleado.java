package lab2_miguelblanco;

public class Empleado {

    private String Nombre;
    private String Apellido;
    private String ColorFav;
    private int Edad;
    private String Genero;
    private double Altura;
    private double Peso;
    private String Titulo;
    private String Cargo;

    public Empleado() {
    }

    public Empleado(String Nombre, String Apellido, String ColorFav, int Edad, String Genero, double Altura, double Peso, String Titulo, String Cargo) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.ColorFav = ColorFav;
        this.Edad = Edad;
        this.Genero = Genero;
        this.Altura = Altura;
        this.Peso = Peso;
        this.Titulo = Titulo;
        this.Cargo = Cargo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getGenero() {
        return Genero;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getColorFav() {
        return ColorFav;
    }

    public void setColorFav(String ColorFav) {
        this.ColorFav = ColorFav;
    }

    @Override
    public String toString() {
        return "Empleado[" + "Nombre= " + Nombre + ", Apellido= " + Apellido + ", ColorFav= " + ColorFav + ", Edad= " + Edad + ", Genero= " + Genero + ", Altura= " + Altura + ", Peso= " + Peso + ", Titulo= " + Titulo + ", Cargo= " + Cargo + ']';
    }

}
