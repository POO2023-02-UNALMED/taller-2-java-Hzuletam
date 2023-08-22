package test;
public class Motor{
    int numeroCilindros;
    String tipo;
    int registro;
    void cambiarRegistro(int registro)
    {
        this.registro = registro;
    }
    void asignarTipo(String Tipo)
    {
        if (Tipo == "electrico" || Tipo=="gasolina")
        {
            this.tipo = Tipo;
        }
    }
}