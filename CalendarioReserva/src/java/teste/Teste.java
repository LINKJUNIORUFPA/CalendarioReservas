package teste;


import model.Professor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sandio
 */
public class Teste {
    public static void main(String[] args) {
           System.out.println("começando");
           Professor p = new Professor();
           p.setNome("Antonio");
           p.setFaculdade("letras");
           PDao p1  = new PDao();
           p1.persist(p);
           System.out.println("acabando.........");
    }
}
