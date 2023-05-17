
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brian
 */
public class MatLib {
    public static double media(List<Double> numeros) {
        double suma = 0;
        for (Double num : numeros) {
            suma += num;
        }
        return suma / numeros.size();
    }
}
