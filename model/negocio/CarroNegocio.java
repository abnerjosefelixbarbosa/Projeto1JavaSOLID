package projeto1.model.negocio;

import java.util.Collection;
import projeto1.strategy.CarroStrategy;
import projeto1.model.entidade.Carro;
import projeto1.face.CrudCarro;
import projeto1.model.repository.CarroRepository;

public class CarroNegocio implements CrudCarro {

    private CarroStrategy carroStrategy;

    public CarroNegocio() {
        carroStrategy = new CarroStrategy(new CarroRepository());
    }
    
    @Override
    public int cadastrarCarro(Carro carro) {   
        boolean nomeModelo = carro.getNomeModelo().isEmpty();
        boolean nomeFabricante = carro.getNomeFabricante().isEmpty();
        boolean cavalos = carro.getCavalos() == 0;
        if (nomeModelo) {
            return 1;
        } else if (nomeFabricante) {
            return 2;
        } else if (cavalos) {
            return 3;
        } else {
            return carroStrategy.cadastrarCarro(carro);
        }
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
