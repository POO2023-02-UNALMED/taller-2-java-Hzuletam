package test;
public class Auto{
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

    int cantidadAsientos()
    {
        int numAsientos = 0;
        for(int i = 0; i< asientos.lenght; i++)
        {
            if ( asientos[i] != null)
            {
                numAsientos++;
            }

        }
        return numAsientos;
    }
    public String verificarIntegridad() {
        if (registro == motor.registro)
        {
            for (int =0;i < asientos.lenght;i++)
            {
                if (asientos[i] != null) {
                    if (asientos[i].registro != registro) {
                        return "Las piezas no son originales";
                    }
                }

            }
            return "Auto original"
        } else
        {
            return "Las piezas no son originales"
        }

    }

}