/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tarea1.Tarea1;

/**
 *
 * @author licho
 */
public class tareaTest {
    
    public tareaTest() {
    }
    
    @Test
    public void leerTest1() {
        String resultado = Tarea1.leerArchivo("C:/Users/licho/Documents/NetBeansProjects/Tarea1/testLeer1.txt");
        String esperado = "Neil Alden Armstrong (August 5, 1930 – August 25, 2012) was an American astronaut\n"
                + "and aeronautical engineer who was the first person to walk on the Moon. He was also\n"
                + "a naval aviator, test pilot, and university professor.\n"
                + "\n"
                + "A graduate of Purdue University, Armstrong studied aeronautical engineering with\n"
                + "his college tuition paid for by the U.S. Navy under the Holloway Plan.\n"
                + "He became a midshipman in 1949, and a naval aviator the following year.\n"
                + "He saw action in the Korean War, flying the Grumman F9F Panther from the aircraft\n"
                + "carrier USS Essex. In September 1951, he was hit by anti-aircraft fire while making\n"
                + "a low bombing run, and was forced to bail out. After the war, he completed his\n"
                + "bachelor's degree at Purdue and became a test pilot at the National Advisory\n"
                + "Committee for Aeronautics (NACA) High-Speed Flight Station at Edwards Air Force\n"
                + "Base in California. He was the project pilot on Century Series fighters and flew\n"
                + "the North American X-15 seven times. He was also a participant in the U.S. Air\n"
                + "Force's Man in Space Soonest and X-20 Dyna-Soar human spaceflight programs.";

        assertEquals(esperado, resultado);
    }
    
    @Test
    public void leertest2() {
        String esperado = "Neil Alden Armstrong (August 5, 1930 – August 25, 2012) was an American astronaut\n"
                + "and aeronautical engineer who was the first person to walk on the Moon. He was also\n"
                + "a naval aviator, test pilot, and university professor.\n"
                + "\n"
                + "A graduate of Purdue University, Armstrong studied aeronautical engineering with\n"
                + "his college tuition paid for by the U.S. Navy under the Holloway Plan.\n"
                + "He became a midshipman in 1949, and a naval aviator the following year.\n"
                + "He saw action in the Korean War, flying the Grumman F9F Panther from the aircraft\n"
                + "carrier USS Essex. In September 1951, he was hit by anti-aircraft fire while making\n"
                + "a low bombing run, and was forced to bail out. After the war, he completed his\n"
                + "bachelor's degree at Purdue and became a test pilot at the National Advisory\n"
                + "Committee for Aeronautics (NACA) High-Speed Flight Station at Edwards Air Force\n"
                + "Base in California. He was the project pilot on Century Series fighters and flew\n"
                + "the North American X-15 seven times. He was also a participant in the U.S. Air\n"
                + "Force's Man in Space Soonest and X-20 Dyna-Soar human spaceflight programs.\n"
                + "The first man who stepped on the moon.";
        String resultado = Tarea1.leerArchivo("C:/Users/licho/Documents/NetBeansProjects/Tarea1/testLeer2.txt");
        assertEquals(esperado, resultado);
    }
    
    

    
}
