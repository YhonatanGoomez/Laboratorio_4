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
        return 0;
    }
}
