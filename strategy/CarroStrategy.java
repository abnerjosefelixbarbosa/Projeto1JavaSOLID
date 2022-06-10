package projeto1.strategy;

import java.util.Collection;
import projeto1.face.CrudCarro;
import projeto1.model.entidade.Carro;

public class CarroStrategy {
    
    private CrudCarro crudCarro;

    public CarroStrategy(CrudCarro crudCarro) {
        this.crudCarro = crudCarro;
    }
    
    public int cadastrarCarro(Carro carro) {        
        return crudCarro.cadastrarCarro(carro);        
    }
    
    public Collection<Carro> listarCarro() {
        return crudCarro.listarCarro();
    }
}
