package mercadinhoproxy;

public class EstoqueReal implements Estoque {

    @Override
    public void visualizarEstoque() {

        System.out.println("ESTOQUE");
        System.out.println("Arroz");
        System.out.println("Feijão");
        System.out.println("Macarrão");
    }
}