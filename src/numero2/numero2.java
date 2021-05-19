/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero2;

/**
 *
 * @author SESI_SENAI
 */
import java.util.Scanner;

public class numero2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
	int IdadeAnos, IdadeMeses, IdadeDias, IdadeTotalDias;
	
	System.out.print("Calculadora de idade em dias\n\n"); //Existe algum exercício mais aleatório do que esse?!


	System.out.print("Digite os anos: ");
	IdadeAnos = entrada.nextInt();
	
	System.out.print("Digite os meses: ");
	IdadeMeses = entrada.nextInt();

	System.out.print("Digite os dias: ");
	IdadeDias = entrada.nextInt();


	IdadeTotalDias = IdadeAnos * 365 + IdadeMeses * 30 + IdadeDias;
	System.out.print("Idade total em dias = "+IdadeTotalDias+"\n");
	
    }

}
    
    

