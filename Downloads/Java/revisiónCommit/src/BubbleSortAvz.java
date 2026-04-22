public class BubbleSortAvz {
    //Variable global
    int[] array; //Tiene valor? NO
                 //Donde le doy valor
    public BubbleSortAvz(int[] arreglo){
        //1ra forma, darle valor directo
        // array = new int[]{10, 5, 0};
        //2da forma, darle un valor en base a parametros
        this.array = arreglo;
    }

    public void sort(boolean asc){
        boolean huboIntercambio;
        int tam = array.length;
        int contradorComparaciones = 0;
        for(int i = 0; i < tam - 1; i++) {
            huboIntercambio = false;
            for(int j = 0; j < tam - 1 - i; j++){
                contradorComparaciones ++;
                if(array[j] > array[j+1]){
                    huboIntercambio = true;
                    int aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] =aux;
                }
            }
            if(!huboIntercambio){
                break;
            }
        }
        System.out.println("Comparaciones totales:" + contradorComparaciones);
    }
    

    public void printArray(int[] numeros) {
        for(int i : numeros){
            System.out.println(i + ",");
        }
        System.out.println();
    }
}
