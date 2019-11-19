/* 
 * Copyright 2019 User.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Casimiro Ondo Obiang casimiro.ondo.alum@iescamp.es
 */
public class Main {
    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");
    public static void main(String[] args) {
        //ejercicio: 03308-EntradaEnteroRepeticion
        
        //Constante
        final int MIN;
        final int MAX;
        
        //variable
        int usuario;
        //usuario = SCN.nextInt();
        int usuario2;
        //usuario = SCN.nextInt();
       
        //Advertencia
        try {
            System.out.println("Escribe un numero minimo");
            usuario = SCN.nextInt();
            System.out.println("Escribe un numero maximo");
            usuario2 = SCN.nextInt();
            //bucle
            for(int i=usuario;i<=usuario2;i++)
            System.out.println("Entrada"+i);

        } catch (Exception e) {
        }
    }
}