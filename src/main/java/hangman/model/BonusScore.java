package hangman.model;

public class BonusScore {
    /**
     * @pre No aplica
     * @param correctCount Recibe cuantas letras están bien
     * @param incorrectCount Recibe cuantas letras están incorrectas
     * @pos El resultado no puede ser menor que cero
     * @pos El puntaje inicia en 0, por cada letra correcta se dan 10 puntos, y se restarán 5 por cada incorrecta,
     * por tanto, tenemos que para hallar el puntaje se tiene que multiplicar la cantidad de letras correctas por 10
     * y la cantidad de letras incorrectas por 5, luego sumar el puntaje que se tiene con la cantidad de correctas
     * y le restamos el valor que se obtuvo de las letras incorrectas, si da negativo, el puntaje será 0
     * @throws Exception Los valores ingresados no pueden ser negativos
     */
    public int calculateScore(int correctCount, int incorrectCount){
        return 0;
    }
}
