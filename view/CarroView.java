package projeto1.view;

import java.util.Collection;
import projeto1.strategy.CarroStrategy;
import projeto1.controller.CarroController;
import projeto1.face.CrudCarro;
import projeto1.model.entidade.Carro;

public class CarroView implements CrudCarro {
    
    private CarroStrategy carroStrategy;

    public CarroView() {
        carroStrategy = new CarroStrategy(new CarroController());
    }

    @Override
    public int cadastrarCarro(Carro carro) {
        return carroStrategy.cadastrarCarro(carro);
    }

    @Override
    public int atualizarCarro(Carro carro) {
        return 0;
    }

    @Override
    public int removerCarro(Carro carro) {
        return 0;
    }

    @Override
    public Collection<Carro> listarCarro() {
        return carroStrategy.listarCarro();
    }

}
