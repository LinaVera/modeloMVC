package Negocio;

import Modelo.ConjuntoNumeros;

public class OpecacionNumeros {

    private ConjuntoNumeros myNumeros;

    public OpecacionNumeros(ConjuntoNumeros myNumeros) {
        this.myNumeros = myNumeros;
    }

    public ConjuntoNumeros getMyNumeros() {
        return myNumeros;
    }

    public void setMyNumeros(ConjuntoNumeros myNumeros) {
        this.myNumeros = myNumeros;
    }

    public OpecacionNumeros() {

    }

    public int getSumar() {
        if (this.myNumeros.getNumeros() == null) {
            return 0;
        }
        int s = 0;
        int i = 0;
        for (int dato : this.myNumeros.getNumeros()) {
            s += this.myNumeros.getNumeros()[i++];
        }
        return s;
    }

    public int getRestar() {
        if (this.myNumeros.getNumeros() == null) {
            return 0;
        }
        int s = this.myNumeros.getNumeros()[0];
        for (byte i = 1; i < this.myNumeros.getNumeros().length; i++) {
            s -= this.myNumeros.getNumeros()[i];
        }
        return s;
    }

    public String getPares() {
        if (this.myNumeros.getNumeros() == null) {
            return "No hay números pares";
        }
        String s = "";
        for (byte i = 0; i < this.myNumeros.getNumeros().length; i++) {
            if (this.myNumeros.getNumeros()[i] % 2 == 0) {
                s += "[" + String.valueOf(this.myNumeros.getNumeros()[i]) + "] ";
            }
        }
        return s;
    }

    public String getImpares() {
        if (this.myNumeros.getNumeros() == null) {
            return "No hay números impares";
        }
        String s = "";
        for (byte i = 0; i < this.myNumeros.getNumeros().length; i++) {
            if (this.myNumeros.getNumeros()[i] % 2 != 0) {
                s += "[" + String.valueOf(this.myNumeros.getNumeros()[i]) + "]";
            }
        }
        return s;
    }
}
