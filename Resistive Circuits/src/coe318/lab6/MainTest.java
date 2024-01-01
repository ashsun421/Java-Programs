/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab6;

/**
 *
 * @author ashsu
 */
public class MainTest {
    
    public static void main(String[] args) {
        
        Circuit c1 = Circuit.getInstance();
        
        Node A = new Node();
        Node B = new Node();
        Node C = new Node();
        Node D = new Node();
        Node E = new Node();
        Node F = new Node();
        Node G = new Node();
        
        
        Resistor r1 = new Resistor(50.0, A, B);
        Resistor r2 = new Resistor(100, B, C);
        Resistor r3 = new Resistor(90.0, null,D );
        Resistor r4 = new Resistor(40.0, D, E);
        Resistor r5 = new Resistor(200.0, E, F);
        Resistor r6 = new Resistor(30.0, F, G);

       
        System.out.println("Circuit:");
        
        c1.add(r1);
        c1.add(r2);
        c1.add(r3);
        c1.add(r4);
        c1.add(r5);
        c1.add(r6);
        System.out.println(c1.toString());
    }
    
}