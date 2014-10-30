/*
 * Copyright (C) 2014 Cristobal Ocampo, Cesar Arango
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package eafit.dis.st0250;

/**
 * @author Cesar
 * @author Cristobal
 */
public class Maker {

    /**
     * Metodo main que crea una fabrica de Chocolates y de acuerdo al parametro
     * pasado crea una instancia diferente de la clase Chocolate
     * @param args 
     */
    public static void main(String args[]) {
        FabricaChocolates fdc = new FabricaChocolates();
        fdc.getChocolate("blanco");
        System.out.println("Listo");
        fdc.getChocolate("amargo");
        System.out.println("Listo");
        fdc.getChocolate("leche");
        System.out.println("Listo");
    }
}
