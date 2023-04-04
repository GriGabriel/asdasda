/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.encontrarnumerojava;

import java.util.Scanner;

/**
 *
 * @author Barna live sessions
 */
public class EncontrarNumerojava {

    public static void main(String[] args) {
   
         
        Scanner sc = new Scanner(System.in);
         
            System.out.println("ingresa el primer numero:");
            int num1 = sc.nextInt();
            System.out.println("ingresa el segundo numero:");
            int num2 = sc.nextInt();
            System.out.println("ingresa el tercer numero:");
            int num3 = sc.nextInt();
            
            int bajo,medio,alto;
            
            if  (num1 >= num2 && num1 >= num3)
            {alto=num1;}
            if (num2>=num3)
            {medio=num2; bajo=num3;}
            else
            {medio=num3; bajo=num2;} 
            else if
            

    }
    }

