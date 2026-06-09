package mercadinhoproxy;

public class CaixaTesteMercadinho {

    public static void main(String[] args) {


        System.out.println(" CAIXA DE TESTE - PROXY");


        Estoque gerente =
                new EstoqueProxy("gerente");

        gerente.visualizarEstoque();

        System.out.println();

        Estoque funcionario =
                new EstoqueProxy("funcionario");

        funcionario.visualizarEstoque();

        System.out.println();

        System.out.println("TESTES FINALIZADOS");
    }
}