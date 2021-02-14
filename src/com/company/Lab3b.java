package com.company;

/* Варіант 4
Скласти програму, що визначає, чи є заданий рядок IP адресою.
Приклад правильних виразів: 127.0.0.1; 255.255.255.0.
Приклад неправильних виразів: 1300.6.7.8, abc.def.gha.bcd.*/

import java.util.Scanner;

public class Lab3b {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input an IP address: ");
        String ip = in.next();
        System.out.print("Input a subnet mask: ");
        String mask = in.next();
        in.close();

        String pattern_ip = "^(25[0-5]|2[0-4][0-9]|1?[1-9][0-9]?)(\\.(25[0-5]|2[0-4][0-9]|[1]?[0-9][0-9]?)){3}$";
        String pattern_mask = "^(25[0-5]|2[0-4][0-9]|[0-9]?[0-9][0-9]?)(\\.(25[0-5]|2[0-4][0-9]|[1]?[0-9][0-9]?)){3}$";
        boolean res_ip = ip.matches(pattern_ip);
        boolean res_mask = mask.matches(pattern_mask);
        if(res_ip & res_mask){
            System.out.println("It is an IP address");
        }
        else{
            System.out.println("It is not an IP address");
        }
    }
}
