package projeto1.controller;

import java.util.Collection;
import projeto1.strategy.CarroStrategy;
import projeto1.model.entidade.Carro;
import projeto1.face.CrudCarro;
import projeto1.model.negocio.CarroNegocio;

public class CarroController implements CrudCarro {
    
    private CarroStrategy carroStrategy;

    public CarroController() {
        carroStrategy = new CarroStrategy(new CarroNegocio());
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
