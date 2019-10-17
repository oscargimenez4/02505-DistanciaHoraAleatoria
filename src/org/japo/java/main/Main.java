/* 
 * Copyright 2019 Oscar G.4 - oscargimenez4@gmail.com.
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

import java.util.Calendar;
import java.util.Random;

/**
 *
 * @author Oscar G.4 - oscargimenez4@gmail.com
 */
public class Main {

    public static final Random RND = new Random();
    public static final Calendar CAL = Calendar.getInstance();

    public static void main(String[] args) {
        //Constantes
        final int H_INI = 8;
        final int M_INI = 20;
        final int S_INI = 0;

        //Calendario
        int hAct = CAL.get(Calendar.HOUR_OF_DAY);
        int mAct = CAL.get(Calendar.MINUTE);
        int sAct = CAL.get(Calendar.SECOND);

        //Tiempos > Segundos
        int tiempoIni = H_INI * 3600 + M_INI * 60 + S_INI;
        int tiempoAct = hAct * 3600 + mAct * 60 + sAct;
        int tiempoRnd = RND.nextInt(tiempoAct - tiempoIni + 1) + tiempoIni;
        int tiempoDis = tiempoAct - tiempoRnd;

        //Hora Aleatoria
        int hRnd = tiempoRnd / 3600;
        tiempoRnd = tiempoRnd % 3600;
        int mRnd = tiempoRnd / 60;
        int sRnd = tiempoRnd % 60;

        //Distancia
        int hDis = tiempoDis / 3600;
        tiempoDis = tiempoDis % 3600;
        int mDis = tiempoDis / 60;
        int sDis = tiempoDis % 60;

        //Salidas
        System.out.printf("Hora actual .....: %02d:%02d:%02d%n", hAct, mAct, sAct);
        System.out.printf("Hora inicio .....:%02d:%02d:%02d%n", hRnd, mRnd, sRnd);
        System.out.printf("Tiempo de clase .:%02d:%02d:%02d%n", hDis, mDis, sDis);
    }
}
