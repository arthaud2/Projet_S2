/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.vanelst.projet_s2;
import java.awt.Color;

/**
 *
 * @author Arthaud
 */
public class barre {
    
    private Point début;
    private Point fin;
    
    public Barre(Point début, Point fin, Color couleur){
        //super(couleur);
        this.début=début;
        this.fin=fin;
    }    
    public Barre(Point début, Point fin){
        this(début,fin,Color.blue);
    }
    public Point getDébut(){
    return début;
    }
    public Point getFin(){
    return fin;
    }
    @Override
    public String toString(){
        return "[" + this.début + "," + this.fin + "]";
    }
} 
        