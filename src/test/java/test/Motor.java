package test;

public class Motor{
    int numeroCilindros;
    String tipo;
    int registro;
    public void cambiarRegistro(int nregistro){
        this.registro = nregistro;
    }
    public void asignarTipo(String Tipo){
        if (tipo == 'electrico' || tipo=='gasolina'){
            this.tipo = Tipo;
        }
    }
}