/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import org.apache.xmlrpc.WebServer;


/**
 *
 * @author Dreizehn
 */
public class utama {
    public static void main(String[] args) {
        WebServer ws = new WebServer(1402);//buat object webserver dr xml-rpc 3232 = port
        ws.addHandler("melisabecek", new aksicrud());
        ws.start();
        System.out.println("RPC SERVER RUNNING!");
    }
}
