package br.com.tsi.construcao;
/** Classe principal do executável. */
public class Main {
 public static void main(String[] args){
  Calculadora c=new Calculadora();
  System.out.println("Sistema de Construção - GitHub Actions");
  System.out.println("2 + 3 = "+c.somar(2,3));
  System.out.println("4 x 5 = "+c.multiplicar(4,5));
 }
}
