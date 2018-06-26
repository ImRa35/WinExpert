/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package winexpert;

/**
 *
 * @author Ragu Balagi Karuppaiah
 */
public class WinExpert {
    public static void main(String[] R){
        WinKey w=new WinKey();
        w.blockWindowsKey();
        new Welcome();
    }
}
