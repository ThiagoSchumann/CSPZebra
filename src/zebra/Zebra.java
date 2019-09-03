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
        IntVar ing = model.intVar("Inglês", dominio);
        IntVar esp = model.intVar("Espanhol", dominio);
        IntVar nor = model.intVar("Noruegês", dominio);
        IntVar ucr = model.intVar("Ucraniano", dominio);
        IntVar jap = model.intVar("Japonês", dominio);
        IntVar vrm = model.intVar("Vermelha", dominio);
        IntVar amr = model.intVar("Amarela", dominio);
        IntVar vrd = model.intVar("Verde", dominio);
        IntVar azl = model.intVar("Axul", dominio);
        IntVar mrf = model.intVar("Marfim", dominio);
        IntVar dog = model.intVar("Cachorro", dominio);
        IntVar cmj = model.intVar("Caramujo", dominio);
        IntVar cvl = model.intVar("Cavalo", dominio);
        IntVar rps = model.intVar("Raposa", dominio);
        IntVar zbr = model.intVar("Zebra", dominio);
        IntVar cha = model.intVar("Chá", dominio);
        IntVar sco = model.intVar("Suco de Laranja", dominio);
        IntVar cof = model.intVar("Café", dominio);
        IntVar let = model.intVar("Leite", dominio);
        IntVar aga = model.intVar("Água", dominio);
        IntVar kool = model.intVar("Kool", dominio);
        IntVar chesterfield = model.intVar("Chesterfield", dominio);
        IntVar winston = model.intVar("Winsron", dominio);
        IntVar luckstryke = model.intVar("Lucky Strike", dominio);
        IntVar parliament = model.intVar("Parliament", dominio);

        // TODO: adicionar as demais variaveis
        // Restricoes
        // O metodo 'model.arithm' cria uma constraint aritmetica (ver documentacao)
        // O metodo 'model.post' adiciona a constraint criada no model do CSP
        model.post(model.allDifferent(ing, esp, nor, ucr, jap));
        model.post(model.allDifferent(vrm, amr, vrd, azl, mrf));
        model.post(model.allDifferent(dog, cmj, cvl, rps, zbr));
        model.post(model.allDifferent(cha, sco, cof, let, aga));
        model.post(model.allDifferent(kool, chesterfield, winston, luckstryke, parliament));
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
            imprimirOrganizado("cor", solution, vrm, amr, vrd, azl, mrf);
            imprimirOrganizado("nacionalidade", solution, ing, esp, nor, ucr, jap);
            imprimirOrganizado("bebida", solution, cha, sco, cof, let, aga);
            imprimirOrganizado("cigarro", solution, kool, chesterfield, winston, luckstryke, parliament);
            imprimirOrganizado("animal", solution, dog, cmj, cvl, rps, zbr);
        } else {
            System.out.println("Nao encontrou solucao");
        }
    }

    private static void imprimirOrganizado(String caracteristica, Solution solution, IntVar... variaveis) {
        System.out.print(String.format("%-15s", caracteristica)); // adiciona espaços de alinhamento
        for (int i = 0; i < variaveis.length; i++) {
            for (IntVar var : variaveis) {
                int valor = solution.getIntVal(var);
                if (valor == (i + 1)) {
                    System.out.print(String.format("%-15s", var.getName()));
                }
            }
        }
        System.out.println();
    }
}
