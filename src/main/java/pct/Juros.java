/* Abra o NetBeans e crie um novo projeto JAVA com o nome aula1202_conversor e clique em proximo
 * Desmarque a caixinha de baixo
 * Clique em Pacote de Codigo Fonte > Novo > Pacote Java com o nome pct
 * Clique com botão direito em ptc > NOVA > CLASE JAVA
 * 
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author EtecMorato
 */
public class Juros {
    public static void main(String[] args) { 
        //Declaraçao de variavel 
        double capital,taxa,prazo,juros;
        int op; //Opçãó a ser inf prlo usuário 
        
        //Criação de instancia do objeto da clase scanner (scan + crtl + barra)
        Scanner entrada = new Scanner(System.in);
         
       do{ 
            //Apresentação
            System.out.println("\n\t\t\t -- Calc. Finaceira 1.0 -- \n"); 
            
            //Menu
            System.out.println("[1]. Juros");
            System.out.println("[2]. Capital");
            System.out.println("[3]. Taxa");
            System.out.println("[4]. Prazo");
            System.out.println("[5]. Sair");
            
            //Ler opção
            System.out.print("Opção: "); 
            op = entrada.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("\n\t\t\t -- Juros -- \n");
            
                    //Entrada
                    System.out.print("Capital (R$) :");
                    capital = entrada.nextDouble();
                    System.out.print("Taxa (%): ");
                    taxa = entrada.nextDouble();
                    System.out.print("Prazo: ");
                    prazo = entrada.nextDouble();
        
                    //Processamento
                    juros = capital * taxa * prazo / 100; 
        
                    //Saida
                    System.out.printf("\n\tJuros : (R$) %.2f\n", juros);
                    
                    break;
                    
                case 2:
                    //Apresaentação
                    System.out.println("\n\t\t\t -- CAPITAL -- \n");
                    
                    //Entrada
                    System.out.print("prazo:");
                    prazo = entrada.nextDouble();
                    System.out.print("Taxa (%): ");
                    taxa = entrada.nextDouble();
                    System.out.print("juros (R$): ");
                    juros = entrada.nextDouble();
        
                    //Processamento
                    capital = juros / (taxa / 100 * prazo);
        
                    //Saida
                    System.out.printf("\n\t Capital : R$ %.2f\n", capital);
                    
                    break;
                    
                case 3:
                   //Apresentação
                    System.out.println("\n\t\t\t -- TAXA -- \n");
                    
                    //Entrada 
                    System.out.print("Prazo:");
                    prazo = entrada.nextDouble();
                    System.out.print("Capital (R$): ");
                    capital = entrada.nextDouble();
                    System.out.print("juros (R$): ");
                    juros = entrada.nextDouble();
        
                    //Processamento
                    taxa = juros / (capital / 100 * prazo);
                    
                    //Saida
                    System.out.printf("\n\t\t Taxa :  %.2f\n", taxa);

                    break;
                    
                case 4:
                   //Apresentação
                    System.out.println("\n\t\t\t -- PRAZO -- \n");
                    
                    //Entrada 
                    System.out.print("juros (R$) :");
                    juros = entrada.nextDouble();
                    System.out.print("Capital (R$): ");
                    capital = entrada.nextDouble();
                    System.out.print("taxa(%): ");
                    taxa = entrada.nextDouble();
        
                    //Processamento
                    prazo = juros / (taxa / 100 * capital);
                    
                    //Saida
                    System.out.printf("\n\t\t PRAZO : %.0f\n", prazo);
                    
                    break;
                    
                case 5:
                    //SAIR
                    System.out.println("exit");
                  
                    break;
                    default:
                        System.out.println("Opção incorreta!");
            }
                    
       }while(op != 5);
    }
}