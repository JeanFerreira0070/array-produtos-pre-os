package projeto.alura.aula;

import java.util.ArrayList;

public class MainProduto {
    public static void main(String[] args) {
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        Produto produto1 = new Produto("arroz", 1.99);
        Produto produto2 = new Produto("feijao", 2.99);
        Produto produto3 = new Produto("macarrao", 5.99);
        Produto produto4 = new Produto("sabonete", 8.99);
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);
        listaDeProdutos.add(produto4);
        System.out.println(listaDeProdutos);
        double somaprecos = 0;
        for (projeto.alura.aula.Produto Produto : listaDeProdutos){
            somaprecos += Produto.getPreco();
        }

        double media = somaprecos / listaDeProdutos.size();
        System.out.println("o preco médio dos produtos é : R$" + media);





        }


    }

