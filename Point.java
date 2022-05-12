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
public class Point {
    private double x;
    private double y;

	public Point(double x, double y, Color couleur) {
            //super(couleur);
		this.x = x;
		this.y = y;
	}
        public Point(double x, double y){
            this(x,y,Color.black);
        }
        public Point(){
            this(0,0);
        }

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "("+ x +","+ y +")";
	}
}

