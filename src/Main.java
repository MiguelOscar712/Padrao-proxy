package mercadinhoproxy;

public class Main {

    public static void main(String[] args) {

        Estoque estoque1 =
                new EstoqueProxy("gerente");

        estoque1.visualizarEstoque();

        System.out.println();

        Estoque estoque2 =
                new EstoqueProxy("funcionario");

        estoque2.visualizarEstoque();
    }
}