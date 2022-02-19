package hangman.model;

public class OriginalScore {
    /**
     * @pre No aplica
     * @param correctCount Recibe cuantas letras están bien
     * @param incorrectCount Recibe cuantas letras están incorrectas
     * @pos El resultado no puede ser menor que cero
     * @pos Como el puntaje inicia en 100, y no suman las letras correctas, para calcular el puntaje tenemos que
     * el puntaje que se tiene, menos cada letra incorrecta multiplicado por 10, si da negativo, el puntaje será 0
     * @throws Exception Los valores ingresados no pueden ser negativos
    */
    public int calculateScore(int correctCount, int incorrectCount){
        int puntaje;
        if (correctCount<0 || incorrectCount<0){
            puntaje=-1;
        }
        else{
            puntaje=100-incorrectCount*10;
            if (puntaje<0){
                puntaje=0;
            }

        }
        return puntaje;
    }
}
