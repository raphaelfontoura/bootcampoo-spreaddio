package com.spreaddio.bootcampoo;

import java.time.LocalDate;

import com.spreaddio.bootcampoo.domain.Bootcamp;
import com.spreaddio.bootcampoo.domain.Curso;
import com.spreaddio.bootcampoo.domain.Dev;
import com.spreaddio.bootcampoo.domain.Mentoria;

public class App 
{
    public static void main( String[] args )
    {
        Curso curso1 = new Curso("Operadores Java", "Conceitos sobre os principais operadores em Java", 2);
        Curso curso2 = new Curso("Curso OO Java", "Curso sobre Orientação a Objetos com Java", 6);

        Mentoria mentoria = new Mentoria("Mentoria de Java", "Descrição da Mentoria de Java", LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Dayse");
        Dev dev2 = new Dev();
        dev2.setNome("Raphael");
        System.out.println("************************");
        printConteudos(dev1);
        printConteudos(dev2);

        dev1.inscreverBootcamp(bootcamp);
        dev2.inscreverBootcamp(bootcamp);

        System.out.println("************************");
        printConteudos(dev1);
        printConteudos(dev2);

        dev1.progredir();
        dev2.progredir();
        dev2.progredir();

        System.out.println("************************");
        printConteudos(dev1);
        printConteudos(dev2);

        System.out.println("************************");
        System.out.printf("XP %s: %.2f \n", dev1.getNome(), dev1.calcularTotalXp());
        System.out.printf("XP %s: %.2f \n", dev2.getNome(), dev2.calcularTotalXp());

    }

    private static void printConteudos(Dev dev) {
        System.out.println("==== Conteúdos inscritos " + dev.getNome() + " ====");
        System.out.println(dev.getConteudosInscritos());
        System.out.println("==== Conteúdos concluídos " + dev.getNome() + " ====");
        System.out.println(dev.getConteudosConcluidos());
    }

}
