package Rodrigo;
import java.util.Scanner;

 class Nota {
        double Nota1,Nota2;
              
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do Aluno ");
		double Nota1 = leitor.nextDouble();
		
		System.out.println("Digite a segunda nota do aluno: ");
		double Nota2 = leitor.nextDouble();
		System.out.println("A media do aluno foi "+(Nota1*2+Nota2*3)/5);
	}

}