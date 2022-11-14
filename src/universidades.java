public class universidades {
    String nombre;
    int n_maestros;
    int n_edificios;
    int n_carreras;

    public universidades(){
        nombre = "The National Politechnic School";
        n_maestros=1000;
        n_edificios=26;
        n_carreras=50;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getN_maestros() {
        return n_maestros;
    }

    public void setN_maestros(int n_maestros) {
        this.n_maestros = n_maestros;
    }

    public int getN_edificios() {
        return n_edificios;
    }

    public void setN_edificios(int n_edificios) {
        this.n_edificios = n_edificios;
    }

    public int getN_carreras() {
        return n_carreras;
    }

    public void setN_carreras(int n_carreras) {
        this.n_carreras = n_carreras;
    }
}
