
import java.util.Collections;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brian
 */
public class Estadisticas {

    // Implementa la nueva función aquí
    public static double mediana(List<Double> numeros) {
        Collections.sort(numeros);
        int middle = numeros.size() / 2;
        if (numeros.size() % 2 == 1) {
            return numeros.get(middle);
        } else {
            return (numeros.get(middle - 1) + numeros.get(middle)) / 2.0;
        }
    }
}
