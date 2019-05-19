package com.sda.algorytmy;

import java.util.Arrays;
import java.util.Random;

/**

 *
 */
public class App 
{
    public static int [] sort(int [] tab){
        for (int j=0; j<tab.length; j++){



        for (int i=0; i<tab.length - 1; i++) {

            if (tab[i] > tab[i + 1]) {
                //zmien miejscami
                int tmp = tab[i + 1];
                tab[i + 1] = tab[i];
                tab[i] = tmp;
            }
        }
        }
        System.out.println(Arrays.toString(tab));
        return tab;
    }

    public static void main( String[] args ) throws InterruptedException
    {
        /*Random random = new Random();
        int max = 200;
        int min = -1000;
        int randomNumber = random.nextInt(max-min +1) + min;
        System.out.println(randomNumber);*/

        Random random = new Random();

        int [] tab = new int [20];
        int max = 5000;
        int min = -5000;
        long startTime = System.currentTimeMillis();
        for (int i =0; i<tab.length; i++) {
            tab[i] = random.nextInt(max - min) + min;

        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println(" Czas wykonania: " + totalTime);
        startTime = System.currentTimeMillis();
        sort(tab);
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println("Czas sortowania: " + totalTime);
        }

    }
