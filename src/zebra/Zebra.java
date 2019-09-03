/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zebra;

import org.chocosolver.solver.Model;
import org.chocosolver.solver.Solution;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.Constraint;
import org.chocosolver.solver.variables.IntVar;

/**
 *
 * @author Thiago Artur Schumann
 * @since 30/08/2019
 */
public class Zebra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Choco suporta variaveis inteiras, booleanas, e decimais. Portanto,
        // vamos representar cada estado com uma variavel inteira.
        // O dominio entao precisa ser um conjunto de valores inteiros. Entao, vamos
        // adotar a seguinte codificacao para as cores possiveis:
        // Vermelho = 0; Verde = 1; Azul = 2
        // O array a seguir representa o dominio das variaveis com estes valores das
        // cores.
        int dominio[] = {1, 2, 3, 4, 5};

        // O objeto 'model' representa um CSP
        Model model = new Model("Problema da Zebra");

        // O metodo model.intVar(nome, dominio) cria uma nova variavel no model do CSP
        IntVar ing = model.intVar("ING", dominio);
        IntVar esp = model.intVar("ESP", dominio);
        IntVar nor = model.intVar("NOR", dominio);
        IntVar ucr = model.intVar("UCR", dominio);
        IntVar jap = model.intVar("JAP", dominio);
        IntVar vrm = model.intVar("VRM", dominio);
        IntVar amr = model.intVar("AMR", dominio);
        IntVar vrd = model.intVar("VRD", dominio);
        IntVar azl = model.intVar("AZL", dominio);
        IntVar mrf = model.intVar("MRF", dominio);
        IntVar dog = model.intVar("DOG", dominio);
        IntVar cmj = model.intVar("CMJ", dominio);
        IntVar cvl = model.intVar("CVL", dominio);
        IntVar rps = model.intVar("RPS", dominio);
        IntVar zbr = model.intVar("ZBR", dominio);
        IntVar cha = model.intVar("CHA", dominio);
        IntVar sco = model.intVar("SCO", dominio);
        IntVar cof = model.intVar("COF", dominio);
        IntVar let = model.intVar("LET", dominio);
        IntVar aga = model.intVar("AGA", dominio);
        IntVar kool = model.intVar("KOOL", dominio);
        IntVar chesterfield = model.intVar("CHESTERFIELD", dominio);
        IntVar winston = model.intVar("WINSTON", dominio);
        IntVar luckstryke = model.intVar("LUCKSTRYKE", dominio);
        IntVar parliament = model.intVar("PARLIAMENT", dominio);

        // TODO: adicionar as demais variaveis
        // Restricoes
        // O metodo 'model.arithm' cria uma constraint aritmetica (ver documentacao)
        // O metodo 'model.post' adiciona a constraint criada no model do CSP
        model.post(model.arithm(ing, "!=", esp));
        model.post(model.arithm(ing, "!=", nor));
        model.post(model.arithm(ing, "!=", ucr));
        model.post(model.arithm(ing, "!=", jap));
        model.post(model.arithm(esp, "!=", nor));
        model.post(model.arithm(esp, "!=", ucr));
        model.post(model.arithm(esp, "!=", jap));
        model.post(model.arithm(nor, "!=", ucr));
        model.post(model.arithm(nor, "!=", jap));
        model.post(model.arithm(ucr, "!=", jap));
        model.post(model.arithm(vrm, "!=", amr));
        model.post(model.arithm(vrm, "!=", vrd));
        model.post(model.arithm(vrm, "!=", azl));
        model.post(model.arithm(vrm, "!=", mrf));
        model.post(model.arithm(amr, "!=", vrd));
        model.post(model.arithm(amr, "!=", azl));
        model.post(model.arithm(amr, "!=", mrf));
        model.post(model.arithm(vrd, "!=", azl));
        model.post(model.arithm(vrd, "!=", mrf));
        model.post(model.arithm(azl, "!=", mrf));
        model.post(model.arithm(ing, "!=", esp));
        model.post(model.arithm(ing, "!=", nor));
        model.post(model.arithm(ing, "!=", ucr));
        model.post(model.arithm(ing, "!=", jap));
        model.post(model.arithm(esp, "!=", nor));
        model.post(model.arithm(esp, "!=", ucr));
        model.post(model.arithm(esp, "!=", jap));
        model.post(model.arithm(nor, "!=", ucr));
        model.post(model.arithm(nor, "!=", jap));
        model.post(model.arithm(ucr, "!=", jap));
        model.post(model.arithm(vrm, "!=", amr));
        model.post(model.arithm(vrm, "!=", vrd));
        model.post(model.arithm(vrm, "!=", azl));
        model.post(model.arithm(vrm, "!=", mrf));
        model.post(model.arithm(amr, "!=", vrd));
        model.post(model.arithm(amr, "!=", azl));
        model.post(model.arithm(amr, "!=", mrf));
        model.post(model.arithm(vrd, "!=", azl));
        model.post(model.arithm(vrd, "!=", mrf));
        model.post(model.arithm(azl, "!=", mrf));
        model.post(model.arithm(dog, "!=", cmj));
        model.post(model.arithm(dog, "!=", cvl));
        model.post(model.arithm(dog, "!=", rps));
        model.post(model.arithm(dog, "!=", zbr));
        model.post(model.arithm(cmj, "!=", cvl));
        model.post(model.arithm(cmj, "!=", rps));
        model.post(model.arithm(cmj, "!=", zbr));
        model.post(model.arithm(cvl, "!=", rps));
        model.post(model.arithm(cvl, "!=", zbr));
        model.post(model.arithm(rps, "!=", zbr));
        model.post(model.arithm(cha, "!=", sco));
        model.post(model.arithm(cha, "!=", cof));
        model.post(model.arithm(cha, "!=", let));
        model.post(model.arithm(cha, "!=", aga));
        model.post(model.arithm(sco, "!=", cof));
        model.post(model.arithm(sco, "!=", let));
        model.post(model.arithm(sco, "!=", aga));
        model.post(model.arithm(cof, "!=", let));
        model.post(model.arithm(cof, "!=", aga));
        model.post(model.arithm(let, "!=", aga));
        model.post(model.arithm(kool, "!=", chesterfield));
        model.post(model.arithm(kool, "!=", winston));
        model.post(model.arithm(kool, "!=", luckstryke));
        model.post(model.arithm(kool, "!=", parliament));
        model.post(model.arithm(chesterfield, "!=", winston));
        model.post(model.arithm(chesterfield, "!=", luckstryke));
        model.post(model.arithm(chesterfield, "!=", parliament));
        model.post(model.arithm(winston, "!=", luckstryke));
        model.post(model.arithm(winston, "!=", parliament));
        model.post(model.arithm(luckstryke, "!=", parliament));

        //1 - O inglês mora na casa vermelha
        model.post(model.arithm(ing, "=", vrm));
        //2 - O espanhol é o dono do cachorro
        model.post(model.arithm(esp, "=", dog));
        //3 - O norueguês mora na primeira casa à esquerda
        model.post(model.arithm(nor, "=", 1));
        //4 - Fumam-se cigarros Kool na casa amarela
        model.post(model.arithm(kool, "=", amr));
        //5 - O homem que fuma cigarros Chesterfield mora na casa ao lado do homem que mora com a raposa.      
        Constraint antesRaposa = model.arithm(chesterfield, "=", rps, "-", 1);
        Constraint depoisRaposa = model.arithm(chesterfield, "=", rps, "+", 1);
        model.post(model.or(antesRaposa, depoisRaposa));
        //6 - O norueguês mora ao lado da casa azul
        Constraint antesCasaAzul = model.arithm(nor, "=", azl, "-", 1);
        Constraint depoisCasaAzul = model.arithm(nor, "=", azl, "+", 1);
        model.post(model.or(antesCasaAzul, depoisCasaAzul));
        //7 - O fumante de cigarros Winston cria caramujos
        model.post(model.arithm(winston, "=", cmj));
        //8 - O fumante de cigarros Lucky Strike bebe suco de laranja
        model.post(model.arithm(luckstryke, "=", sco));
        //9 - O ucraniano bebe chá
        model.post(model.arithm(ucr, "=", cha));
        //10 - O japonês fuma cigarros Parliament
        model.post(model.arithm(jap, "=", parliament));
        //11 - Fumam-se cigarros Kool na casa ao lado da casa em que fica o cavalo
        Constraint antesCavalo = model.arithm(kool, "=", cvl, "-", 1);
        Constraint depoisCavalo = model.arithm(kool, "=", cvl, "+", 1);
        model.post(model.or(antesCavalo, depoisCavalo));
        //12 - Bebe-se café na casa verde
        model.post(model.arithm(cof, "=", vrd));
        //13 - A casa verde está imediatamente à direita (à sua direita) da casa marfim
        model.post(model.arithm(vrd, "=", mrf, "-", 1));
        //14 - Bebe-se leite na casa do meio.
        model.post(model.arithm(let, "=", 3));

        // TODO: adicionar as demais restricoes
        Solver solver = model.getSolver();
        Solution solution = solver.findSolution();
        // Se quiser encontrar todas as solucoes, use o metodo solver.findAllSolutions()

        if (solution != null) {
            // Encontrou solucao. Imprime o valor das variaveis
            String casa1[] = new String[5];
            String casa2[] = new String[5];
            String casa3[] = new String[5];
            String casa4[] = new String[5];
            String casa5[] = new String[5];
            switch (solution.getIntVal(vrm)) {
                case 1:
                    casa1[0] = "Vermelho";
                    break;
                case 2:
                    casa2[0] = "Vermelho";
                    break;
                case 3:
                    casa3[0] = "Vermelho";
                    break;
                case 4:
                    casa4[0] = "Vermelho";
                    break;
                case 5:
                    casa5[0] = "Vermelho";
                    break;
            }
            switch (solution.getIntVal(vrd)) {
                case 1:
                    casa1[0] = "Verde";
                    break;
                case 2:
                    casa2[0] = "Verde";
                    break;
                case 3:
                    casa3[0] = "Verde";
                    break;
                case 4:
                    casa4[0] = "Verde";
                    break;
                case 5:
                    casa5[0] = "Verde";
                    break;
            }
            switch (solution.getIntVal(azl)) {
                case 1:
                    casa1[0] = "Azul";
                    break;
                case 2:
                    casa2[0] = "Azul";
                    break;
                case 3:
                    casa3[0] = "Azul";
                    break;
                case 4:
                    casa4[0] = "Azul";
                    break;
                case 5:
                    casa5[0] = "Azul";
                    break;
            }
            switch (solution.getIntVal(amr)) {
                case 1:
                    casa1[0] = "Amarelo";
                    break;
                case 2:
                    casa2[0] = "Amarelo";
                    break;
                case 3:
                    casa3[0] = "Amarelo";
                    break;
                case 4:
                    casa4[0] = "Amarelo";
                    break;
                case 5:
                    casa5[0] = "Amarelo";
                    break;
            }
            switch (solution.getIntVal(mrf)) {
                case 1:
                    casa1[0] = "Marfim";
                    break;
                case 2:
                    casa2[0] = "Marfim";
                    break;
                case 3:
                    casa3[0] = "Marfim";
                    break;
                case 4:
                    casa4[0] = "Marfim";
                    break;
                case 5:
                    casa5[0] = "Marfim";
                    break;
            }
            switch (solution.getIntVal(ing)) {
                case 1:
                    casa1[1] = "Inglês";
                    break;
                case 2:
                    casa2[1] = "Inglês";
                    break;
                case 3:
                    casa3[1] = "Inglês";
                    break;
                case 4:
                    casa4[1] = "Inglês";
                    break;
                case 5:
                    casa5[1] = "Inglês";
                    break;
            }
            switch (solution.getIntVal(esp)) {
                case 1:
                    casa1[1] = "Espanhol";
                    break;
                case 2:
                    casa2[1] = "Espanhol";
                    break;
                case 3:
                    casa3[1] = "Espanhol";
                    break;
                case 4:
                    casa4[1] = "Espanhol";
                    break;
                case 5:
                    casa5[1] = "Espanhol";
                    break;
            }
            switch (solution.getIntVal(nor)) {
                case 1:
                    casa1[1] = "Norueguês";
                    break;
                case 2:
                    casa2[1] = "Norueguês";
                    break;
                case 3:
                    casa3[1] = "Norueguês";
                    break;
                case 4:
                    casa4[1] = "Norueguês";
                    break;
                case 5:
                    casa5[1] = "Norueguês";
                    break;
            }
            switch (solution.getIntVal(ucr)) {
                case 1:
                    casa1[1] = "Ucraniano";
                    break;
                case 2:
                    casa2[1] = "Ucraniano";
                    break;
                case 3:
                    casa3[1] = "Ucraniano";
                    break;
                case 4:
                    casa4[1] = "Ucraniano";
                    break;
                case 5:
                    casa5[1] = "Ucraniano";
                    break;
            }
            switch (solution.getIntVal(jap)) {
                case 1:
                    casa1[1] = "Japonês";
                    break;
                case 2:
                    casa2[1] = "Japonês";
                    break;
                case 3:
                    casa3[1] = "Japonês";
                    break;
                case 4:
                    casa4[1] = "Japonês";
                    break;
                case 5:
                    casa5[1] = "Japonês";
                    break;
            }
            switch (solution.getIntVal(dog)) {
                case 1:
                    casa1[2] = "Cachorro";
                    break;
                case 2:
                    casa2[2] = "Cachorro";
                    break;
                case 3:
                    casa3[2] = "Cachorro";
                    break;
                case 4:
                    casa4[2] = "Cachorro";
                    break;
                case 5:
                    casa5[2] = "Cachorro";
                    break;
            }
            switch (solution.getIntVal(cmj)) {
                case 1:
                    casa1[2] = "Caramujo";
                    break;
                case 2:
                    casa2[2] = "Caramujo";
                    break;
                case 3:
                    casa3[2] = "Caramujo";
                    break;
                case 4:
                    casa4[2] = "Caramujo";
                    break;
                case 5:
                    casa5[2] = "Caramujo";
                    break;
            }
            switch (solution.getIntVal(cvl)) {
                case 1:
                    casa1[2] = "Cavalo";
                    break;
                case 2:
                    casa2[2] = "Cavalo";
                    break;
                case 3:
                    casa3[2] = "Cavalo";
                    break;
                case 4:
                    casa4[2] = "Cavalo";
                    break;
                case 5:
                    casa5[2] = "Cavalo";
                    break;
            }
            switch (solution.getIntVal(rps)) {
                case 1:
                    casa1[2] = "Raposa";
                    break;
                case 2:
                    casa2[2] = "Raposa";
                    break;
                case 3:
                    casa3[2] = "Raposa";
                    break;
                case 4:
                    casa4[2] = "Raposa";
                    break;
                case 5:
                    casa5[2] = "Raposa";
                    break;
            }
            switch (solution.getIntVal(zbr)) {
                case 1:
                    casa1[2] = "Zebra";
                    break;
                case 2:
                    casa2[2] = "Zebra";
                    break;
                case 3:
                    casa3[2] = "Zebra";
                    break;
                case 4:
                    casa4[2] = "Zebra";
                    break;
                case 5:
                    casa5[2] = "Zebra";
                    break;
            }
                        switch (solution.getIntVal(cha)) {
                case 1:
                    casa1[3] = "Chá";
                    break;
                case 2:
                    casa2[3] = "Chá";
                    break;
                case 3:
                    casa3[3] = "Chá";
                    break;
                case 4:
                    casa4[3] = "Chá";
                    break;
                case 5:
                    casa5[3] = "Chá";
                    break;
            }
            switch (solution.getIntVal(sco)) {
                case 1:
                    casa1[3] = "Suco de Laranja";
                    break;
                case 2:
                    casa2[3] = "Suco de Laranja";
                    break;
                case 3:
                    casa3[3] = "Suco de Laranja";
                    break;
                case 4:
                    casa4[3] = "Suco de Laranja";
                    break;
                case 5:
                    casa5[3] = "Suco de Laranja";
                    break;
            }
            switch (solution.getIntVal(cof)) {
                case 1:
                    casa1[3] = "Café";
                    break;
                case 2:
                    casa2[3] = "Café";
                    break;
                case 3:
                    casa3[3] = "Café";
                    break;
                case 4:
                    casa4[3] = "Café";
                    break;
                case 5:
                    casa5[3] = "Café";
                    break;
            }
            switch (solution.getIntVal(let)) {
                case 1:
                    casa1[3] = "Leite";
                    break;
                case 2:
                    casa2[3] = "Leite";
                    break;
                case 3:
                    casa3[3] = "Leite";
                    break;
                case 4:
                    casa4[3] = "Leite";
                    break;
                case 5:
                    casa5[3] = "Leite";
                    break;
            }
            switch (solution.getIntVal(aga)) {
                case 1:
                    casa1[3] = "Água";
                    break;
                case 2:
                    casa2[3] = "Água";
                    break;
                case 3:
                    casa3[3] = "Água";
                    break;
                case 4:
                    casa4[3] = "Água";
                    break;
                case 5:
                    casa5[3] = "Água";
                    break;
            }
                        switch (solution.getIntVal(kool)) {
                case 1:
                    casa1[4] = "Kool";
                    break;
                case 2:
                    casa2[4] = "Kool";
                    break;
                case 3:
                    casa3[4] = "Kool";
                    break;
                case 4:
                    casa4[4] = "Kool";
                    break;
                case 5:
                    casa5[4] = "Kool";
                    break;
            }
            switch (solution.getIntVal(chesterfield)) {
                case 1:
                    casa1[4] = "Chesterfield";
                    break;
                case 2:
                    casa2[4] = "Chesterfield";
                    break;
                case 3:
                    casa3[4] = "Chesterfield";
                    break;
                case 4:
                    casa4[4] = "Chesterfield";
                    break;
                case 5:
                    casa5[4] = "Chesterfield";
                    break;
            }
            switch (solution.getIntVal(winston)) {
                case 1:
                    casa1[4] = "Winston";
                    break;
                case 2:
                    casa2[4] = "Winston";
                    break;
                case 3:
                    casa3[4] = "Winston";
                    break;
                case 4:
                    casa4[4] = "Winston";
                    break;
                case 5:
                    casa5[4] = "Winston";
                    break;
            }
            switch (solution.getIntVal(luckstryke)) {
                case 1:
                    casa1[4] = "Lucky Strike";
                    break;
                case 2:
                    casa2[4] = "Lucky Strike";
                    break;
                case 3:
                    casa3[4] = "Lucky Strike";
                    break;
                case 4:
                    casa4[4] = "Lucky Strike";
                    break;
                case 5:
                    casa5[4] = "Lucky Strike";
                    break;
            }
            switch (solution.getIntVal(parliament)) {
                case 1:
                    casa1[4] = "Parliament";
                    break;
                case 2:
                    casa2[4] = "Parliament";
                    break;
                case 3:
                    casa3[4] = "Parliament";
                    break;
                case 4:
                    casa4[4] = "Parliament";
                    break;
                case 5:
                    casa5[4] = "Parliament";
                    break;
            }
            String c1 = " ";
            for (int i = 0; i < casa1.length; i++) {
                c1 = c1 + casa1[i] + "-";
            }
            System.out.println(c1);

            String c2 = " ";
            for (int i = 0; i < casa2.length; i++) {
                c2 = c2 + casa2[i] + "-";
            }
            System.out.println(c2);

            String c3 = " ";
            for (int i = 0; i < casa3.length; i++) {
                c3 = c3 + casa3[i] + "-";
            }
            System.out.println(c3);

            String c4 = " ";
            for (int i = 0; i < casa4.length; i++) {
                c4 = c4 + casa4[i] + "-";
            }
            System.out.println(c4);

            String c5 = " ";
            for (int i = 0; i < casa5.length; i++) {
                c5 = c5 + casa5[i] + "-";
            }
            System.out.println(c5);
        } else {
            System.out.println("Nao encontrou solucao");
        }
    }
}
