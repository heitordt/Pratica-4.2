/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import utfpr.ct.dainf.if62c.pratica.Elipse;
import utfpr.ct.dainf.if62c.pratica.Circulo;

/**
 *
 * @author a1611810
 */
public class Pratica42 {
    public static void main (String[] args)
    {
        Elipse elip = new Elipse(2, 5);
        System.out.println("Área da Elipse: " + elip.getArea() + "Perímetro da Elise: " + elip.getPerimetro());
        Circulo circ = new Circulo(2);
        System.out.println("Área do círculo: " + circ.getArea() + "Perímetro do círculo: " + circ.getPerimetro());
    }
}
