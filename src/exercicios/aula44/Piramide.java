/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula44;

/**
 *
 * @author Luan
 */
public class Piramide extends Figura3D implements DimensaoVolumetrica{

    @Override
    public int calcularVolume(int areaBase, int altura) {
        return (areaBase * altura ) / 3;
    }

   
    
}