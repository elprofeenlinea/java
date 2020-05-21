package cursojava;


import static cursojava.EjercicioFinal.n;
import javax.swing.*;


public class Baloto {

    static int a[] = new int [6],max=46;
    static double min=1,cp=0,cr=0,n;
    static int op;
    static String cad="";
    public static void main(String[] args) {
       
        
        
        do{
        
        op=Integer.parseInt( JOptionPane.showInputDialog(null,"1.generar el random\n 2.mostrar el random\n 3.mostrar los primos\n4.salir"));
        
        switch(op) {
            case 1:
                cad="";
                for(int i=0;i<a.length;i++){
                   // a[i]=(double)Math.random()*max + min));
                   // cad=cad +"posicion["+i+"] = "+a[i]+"\n";
                     System.out.println(" "); 
                    for( i = 0; i<=5; i++)
                       
                        System.out.print((int)(Math.random()* max + min ) + " , ");
                        
                        
                 }
                
                    
                               
                break;
                case 2:
                JOptionPane.showMessageDialog(null,cad);
                
                break;
                    
                case 3:
                   int contador=0, j;
                    cad="";
                    for (int i=0; i<a.length; i++) {
                       n=a[i];
               
                    for (j=1; j<(n+1); j++)

                {            

                    if (n%j==0)

                {

                contador++;

                }

                  }

                if (contador!=2)

                {

                   cad=cad;

                }

                else

               {

               cad=cad+n+"\n";

               }
        
               }
        
               JOptionPane.showMessageDialog(null, cad);
                       break;
                     }
            }while(op !=4); 
        }
   }
