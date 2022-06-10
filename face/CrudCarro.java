package projeto1.face;

import java.util.Collection;
import projeto1.model.entidade.Carro;

public interface CrudCarro {
    int cadastrarCarro(Carro carro);
    int atualizarCarro(Carro carro);
    int removerCarro(Carro carro);
    Collection<Carro> listarCarro();
}
