package projeto1.model.repository;

import java.util.Collection;
import java.util.ArrayList;
import projeto1.model.entidade.Carro;
import projeto1.face.CrudCarro;

public class CarroRepository implements CrudCarro {

    private Collection<Carro> carros;

    public CarroRepository() {
        carros = new ArrayList<>();
    }

    @Override
    public int cadastrarCarro(Carro carro) {
        carros.add(carro);
        return 4;
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
        return carros;
    }
   
}