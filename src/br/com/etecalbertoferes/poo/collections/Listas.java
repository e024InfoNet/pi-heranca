package br.com.etecalbertoferes.poo.collections;

import br.com.etecalbertoferes.poo.model.Aluno;

import java.util.*;

public class Listas {
    public static void main(String[] args) {
        Aluno a1 = new Aluno(1, "Jose",
                "jose@etec.sp.gov.br",
                "Rua 1, 230 - Centro");

        Aluno a2 = new Aluno(2, "Joao",
                "joao@etec.sp.gov.br",
                "Rua 2, 309 - Centro");

        Aluno a3 = new Aluno(3, "Josias",
                "josias@etec.sp.gov.br",
                "Rua 1, 450 - Centro");

        List<Aluno> alunos = new ArrayList<>();

        alunos.add(a1);
        alunos.addAll(Arrays.asList(a2, a3));

        Map<String, String> estados = new HashMap<>();
        estados.put("SP", "São Paulo");
        estados.put("RJ", "Rio de Janeiro");
        estados.put("PE", "Pernambuco");

        //System.out.println(estados.get("PE"));

        for(Map.Entry<String, String> estado: estados.entrySet()) {
            System.out.println(String
                    .format("key: %s - value: %s",
                    estado.getKey(), estado.getValue()));
        }

        Set<Integer> setList = new HashSet<>();
        setList.add(8);
        setList.add(7);


    }
}
