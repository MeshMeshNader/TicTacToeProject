/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeclient;

import java.io.Serializable;

/**
 *
 * @author dell
 */
public class temp implements Serializable{
    public int id;
    public String str;
    public int n;
     
    public temp(){
    id = 1;
    str = "noha";
    n= 1020;
    }
    public String getName(){return str;}
     public int getIP(){return id;}
    
}
