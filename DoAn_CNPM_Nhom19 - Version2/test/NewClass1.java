/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class NewClass1 {

    public static void main(String[] args) {
        String a = "11111";
        int b = 0;
        String check = "[0-9]+$";
        if (a.matches(check)) {
            b = 1;
        }
        System.out.println(a);
        System.out.println(b);

    }
}
