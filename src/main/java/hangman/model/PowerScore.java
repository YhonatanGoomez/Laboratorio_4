package hangman.model;

public class PowerScore {
    /**
     * @pre No aplica
     * @param correctCount Recibe cuantas letras están bien
     * @param incorrectCount Recibe cuantas letras están incorrectas
     * @pos El resultado no puede ser menor que cero
     * @pos El puntaje inicia en 0, por cada letra correcta se multiplica 5 por si mismo, tantas veces como letras
     * correctas se tengan: Ej: correctCount=3, por tanto el puntaje positivo será 5*5*5=125, el puntaje negativo
     * funcionará multiplicando el número de letras incorrectas por 8, por tanto, tenemos que restar el puntaje
     * positivo menos el puntaje negativo; Si da negativo, el puntaje será 0
     * @pos El puntaje no puede ser mayor de 500 puntos
     * @throws Exception Los valores ingresados no pueden ser negativos
     */
    public int calculateScore(int correctCount, int incorrectCount){

        return 0;
    }
}
