package Facade;

import Modelo.ConjuntoNumeros;
import Negocio.OpecacionNumeros;

//comunicacioón con el negocio
public class Facade {

    private OpecacionNumeros operacion;
    //las demás clases del negocio

    public Facade() {
    }

    public void crearConjuntoNumeros(String datos) throws Exception {
        ConjuntoNumeros n = new ConjuntoNumeros(datos);
        this.operacion = new OpecacionNumeros(n);
    }

    public String operacion(String radio) {
        if (null != radio) {
            switch (radio) {
                case "suma":
                    return String.valueOf(this.getSumar());
                case "resta":
                    return String.valueOf(this.getResta());
                case "mp":
                    return this.mPares();
                case "mip":
                    return this.mImPares();
                default:
                    break;
            }
        }
        return "";
    }

    private int getSumar() {
        return this.operacion.getSumar();
    }

    private int getResta() {
        return this.operacion.getRestar();
    }

    private String mPares() {        
        return this.operacion.getPares();
    }

    private String mImPares() {
        return this.operacion.getImpares();
    }

}
