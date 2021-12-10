
/* A ideia aqui e para execultar uma calculadora 
sem ter que finalizar o programa.
    podemos finalizar na hora que quiser.!
*/



import javax.swing.JOptionPane;

public class Estudo_E_GLASS {
   
    public static void main(String[] args){
        //declaramos variaveis
     String continual;
     String  escolha;
     float conversao;
     String Nome;
    
     
    //recebemos dados e convertemos 
    continual = JOptionPane.showInputDialog("Digite (1) para Iniciar o Programa \n Digite (2) para Sair");
    conversao = Float.parseFloat(continual);
    
    //variaveis para soma
    String valor1,valor2;
     float soma;
    

// emquanto a conversao = 1 ele sempre vai ficar execultando
while(conversao == 1)
{
        //dizendo que deu certo
         JOptionPane.showMessageDialog(null, "Aplicativo Iniciado ");
         // pergunta o que queremos fazer e depois convertendo
         escolha = JOptionPane.showInputDialog("Digite (*) para conta de vazes \n Digite (/) para conta de divisão \n Digite (-) para conta de menos \n Digite (+) para conta de mais ");
        
         // umas das auternativas 
         switch(escolha){
               
             //caso seja conta de vezes
             case "*":
                    
            valor1 = JOptionPane.showInputDialog("Digite o valor");
            valor2  = JOptionPane.showInputDialog("Digite o valor que quer multiplicar");
            soma = Float.parseFloat(valor1) * Float.parseFloat(valor2);
            JOptionPane.showMessageDialog(null, "resposta é " + soma);
            
     // o aqui mudaremos a variavel continuar assim que digitar vamos sair desta opção e a laço while vai ser execultado 
     // se escolher 1 se escolher 2 ele para.
            continual = JOptionPane.showInputDialog("Digite (1) para Iniciar o Programa \n Digite (2) para Sair");
    conversao = Float.parseFloat(continual);
            
            
            
               
            break;
            // caso o usuario digita 2 vai para o programa
             case "2":
                conversao = 2;
                break;
             
                // conta de Divisão
             case "/":
             valor1 = JOptionPane.showInputDialog("Digite o valor");
            valor2  = JOptionPane.showInputDialog("Digite o valor que quer Dividir");
            soma = Float.parseFloat(valor1) / Float.parseFloat(valor2);
            JOptionPane.showMessageDialog(null, "resposta é " + soma);
          
            // o aqui mudaremos a variavel continuar assim que digitar vamos sair desta opção e a laço while vai ser execultado 
     // se escolher 1 se escolher 2 ele para.
     continual = JOptionPane.showInputDialog("Digite (1) para Iniciar o Programa \n Digite (2) para Sair");
    conversao = Float.parseFloat(continual);
            break;
            
            //Caso seja conta de dividir
             case "-":
          valor1 = JOptionPane.showInputDialog("Digite o valor");
            valor2  = JOptionPane.showInputDialog("Digite o valor que quer Subitrair");
            soma = Float.parseFloat(valor1) - Float.parseFloat(valor2);
            JOptionPane.showMessageDialog(null, "resposta é " + soma);
        
            // o aqui mudaremos a variavel continuar assim que digitar vamos sair desta opção e a laço while vai ser execultado 
     // se escolher 1 se escolher 2 ele para.
 continual = JOptionPane.showInputDialog("Digite (1) para Iniciar o Programa \n Digite (2) para Sair");
    conversao = Float.parseFloat(continual);
            break;
            
            // caso seja conta de mais
             case "+":
          valor1 = JOptionPane.showInputDialog("Digite o valor");
            valor2  = JOptionPane.showInputDialog("Digite o valor que quer soma");
            soma = Float.parseFloat(valor1) + Float.parseFloat(valor2);
            JOptionPane.showMessageDialog(null, "resposta é " + soma);
           
            // o aqui mudaremos a variavel continuar assim que digitar vamos sair desta opção e a laço while vai ser execultado 
     // se escolher 1 se escolher 2 ele para.
              continual = JOptionPane.showInputDialog("Digite (1) para Iniciar o Programa \n Digite (2) para Sair");
    conversao = Float.parseFloat(continual);
    break;                 
}
        
         
         //se o usuario  digitar 2 o comado while vai ver que nao e mais 1 e vai parar
        
         if(conversao == 2)
     {
         conversao = 2;
             JOptionPane.showMessageDialog(null, "Programa Encerrado "); 
             }
         
     }
    
        
       
        
    }
    
}
