package projeto1.view;


import java.util.Collection;
import projeto1.strategy.CarroStrategy;
import projeto1.model.entidade.Carro;
import projeto1.view.CarroView;



public class Main {
    
    private CarroStrategy carroStrategy;

    public Main() {
        carroStrategy = new CarroStrategy(new CarroView());
    }
    
    public void cadastrarCarro() {
        String nomeModelo1 = "a";
        String nomeFabricante1 = "a";
        float cavalos1 = (float) 1.5;
        Carro c1 = new Carro(nomeModelo1, nomeFabricante1, cavalos1);
        int res1 = carroStrategy.cadastrarCarro(c1);
        System.out.println(res1);
        String nomeModelo2 = "b";
        String nomeFabricante2 = "b";
        float cavalos2 = (float) 2.0;
        Carro c2 = new Carro(nomeModelo2, nomeFabricante2, cavalos2);
        int res2 = carroStrategy.cadastrarCarro(c2);
        System.out.println(res2);
    }
    
    public void listarCarro() {
        Collection<Carro> carros = carroStrategy.listarCarro();
        carros.forEach(carro -> {
            System.out.println(carro.toString());
        });
    }
    
    public static void main(String[] args) {
        Main m = new Main();
        m.cadastrarCarro();
        m.listarCarro();
    }
}
