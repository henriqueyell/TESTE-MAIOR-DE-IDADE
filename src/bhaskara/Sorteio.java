
package bhaskara;

import java.util.Random;
import java.util.Scanner;


public class Sorteio {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
     
       System.out.println("Qual é sua idade? ");
               int idade = console.nextInt();
        boolean MaiorIdade = 18<=idade;
        if (MaiorIdade == false){
            
                       System.out.println("Você é menor de idade!!!");
        }
        else {
            System.out.println("Parabéns!!!\nVocê ja pode beber!");
        }
    }
}
    
    

