package com.dio;

public class Calculadora {

	public static void adicao(double numero1, double numero2) {

		double result = numero1 + numero2;
		System.out.printf("A adicao de %.1f com o numero %.1f = %.1f%n ", numero1, numero2, result);
	}

	public static void subtracao(double numero1, double numero2) {

		double result = numero1 - numero2;
		System.out.printf("A subtracao de %.1f com o numero %.1f = %.1f%n ", numero1, numero2, result);
	}

	public static void divisao(double numero1, double numero2) {

		double result = numero1 / numero2;
		System.out.printf("A divisao de %.1f com o numero %.1f = %.1f%n ", numero1, numero2, result);
	}

	public static void multiplicacao(double numero1, double numero2) {

		double result = numero1 * numero2;
		System.out.printf("A multiplicacao de %.1f com o numero %.1f = %.1f%n ", numero1, numero2, result);
	}

	public static void main(String[] args) {
		 	
	}
}
