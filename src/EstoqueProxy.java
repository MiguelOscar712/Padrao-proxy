package mercadinhoproxy;

public class EstoqueProxy implements Estoque {

    private String cargo;
    private EstoqueReal estoqueReal;

    public EstoqueProxy(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void visualizarEstoque() {

        if (cargo.equalsIgnoreCase("gerente")) {

            if (estoqueReal == null) {
                estoqueReal = new EstoqueReal();
            }

            estoqueReal.visualizarEstoque();

        } else {

            System.out.println(
                    "Acesso negado. Apenas gerentes podem visualizar o estoque."
            );
        }
    }
}