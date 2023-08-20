package view;

import javax.swing.JOptionPane;

import controller.ApareceController;

public class Principal {

	public static void main(String[] args) {
		ApareceController pc = new ApareceController();
		int a = Integer.parseInt(JOptionPane.showInputDialog("Insira um número entre 10 e 999999"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Insira um número entre 0 e 9"));
		int resultado = pc.QtdAparece(a, b, 0);
		System.out.println("quantidade de vezes que "+b+ " aparece em "+a+ " = "+resultado);
	}
}
