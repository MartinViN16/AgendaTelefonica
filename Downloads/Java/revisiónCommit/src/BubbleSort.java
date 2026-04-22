public class BubbleSort {
    public BubbleSort () {
        System.out.println("Se creó la clase dentro del constructor");
    }

    public void sortAscendente (int numeros[]) {
        for(int i = 0; i < numeros.length; i++) {
            for(int j = i+1; j < numeros.length; j++) {
                //Comparación
                if (numeros[i] > numeros[j]) {
                    //si sumple -> intercambio
                    int aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
    }
    public void sortDescendente (int numeros[]) {
        for(int i = 0; i < numeros.length; i++) {
            for(int j = i+1; j < numeros.length; j++) {
                //Comparación
                if (numeros[i] < numeros[j]) {
                    //si sumple -> intercambio
                    int aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
    }

    public void printArreglo(int numeros[]){
        for(int i : numeros){
            System.out.print(i + ", ");
        }
    }


    public void sort(int[] numeros, boolean asc){
        if (asc== true){
            sortAscendente(numeros);
        }else{
            sortDescendente(numeros);
        }
        printArreglo(numeros);
    }
}