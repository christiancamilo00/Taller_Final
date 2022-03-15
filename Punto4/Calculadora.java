package Taller4.Calculadora;

import java.util.Scanner;

public class Calculadora {
        public static void main(String[] args) {
           
    do  {
        Scanner input=new Scanner(System.in);
  
        System.out.println("Escoga una opcion:");
        System.out.println("a- Sumar.");
        System.out.println("b- Restar.");
        System.out.println("c- Multiplicar.");
        System.out.println("d- Dividir.");
        System.out.print("Opcion: ");

        String op=input.nextLine();

        float[] nums=new float[2];

        float result=0;
      
        boolean error=true;
     
                switch(op){
                    case "a":
                        op="Suma";
                        System.out.println("");
                        for (int i = 0; i < 2; i++) {
                            System.out.print("Numero "+(i+1)+": ");
                            nums[i]=input.nextFloat();                      
                            }
                        result=nums[0] + nums[1];
                        error=false;
                        break;
                    case "b":
                        op="Resta";
                        System.out.println("");
                        for (int i = 0; i < 2; i++) {
                        System.out.print("Numero "+(i+1)+": ");
                        nums[i]=input.nextFloat();
                        }
                        result=(nums[0]) - (nums[1]);
                        error=false;
                        break;
                    case "c":
                        op="Multiplicacion";
                        System.out.println("");
                        for (int i = 0; i < 2; i++) {
                                    System.out.print("Numero "+(i+1)+": ");
                                    nums[i]=input.nextFloat();
                                    }
                        result=(nums[0]) * (nums[1]);
                        error=false;
                        break;
                    case "d":
                        op="Division";
                        System.out.println("");
                        for (int i = 0; i < 2; i++) {
                        System.out.print("Numero "+(i+1)+": ");
                        nums[i]=input.nextFloat();
                        }
                        if(nums[1]!=0){
                            result=(nums[0])/(nums[1]);
                            error=false;
                            }else{
                            error=true;
                        }
                        break;
                   
                    default:
                    error=true;
                    break;
                }
                
        System.out.println("");
      
    } while (op!="Suma" || op!="Resta" || op!="Multiplicacion" || op!="Division" );

        System.out.println("Resultado es " + op);
        if(error==false){
            System.out.println("Resultado de "+op+": "+result);
            }else if(error==true){
                System.out.println("ERROR: No se puede realizar la operacion.");
            }
        }
}