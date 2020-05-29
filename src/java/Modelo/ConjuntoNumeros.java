
package Modelo;

public class ConjuntoNumeros {

    private int numeros[];

    public ConjuntoNumeros() {
    }
    //solamente lee, transforma y guarda el vector de los números
    public ConjuntoNumeros(String numeros) throws Exception {
        String datos[] = numeros.split(",");
        this.numeros=new int[datos.length];
        int i = 0;
        for (String dato : datos) {
           try{
                this.numeros[i++]=Integer.parseInt(dato);
            }catch(NumberFormatException e)
            {
                //Runtime --> no es necesario try-catch
            throw new Exception("mal formateado los datos, existe un dato que no es númerico");
            }
        }
    }
    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

}
