package projeto1.model.entidade;

public class Carro {
    
    private String nomeModelo;
    private String nomeFabricante;
    private float cavalos;

    public Carro(String nomeModelo, String nomeFabricante, float cavalos) {
        this.nomeModelo = nomeModelo;
        this.nomeFabricante = nomeFabricante;
        this.cavalos = cavalos;
    }

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public String getNomeFabricante() {
        return nomeFabricante;
    }

    public void setNomeFabricante(String nomeFabricante) {
        this.nomeFabricante = nomeFabricante;
    }

    public float getCavalos() {
        return cavalos;
    }

    public void setCavalos(float cavalos) {
        this.cavalos = cavalos;
    }

    @Override
    public String toString() {
        return "CarroModel{" + "nomeModelo=" + nomeModelo + ", nomeFabricante=" + nomeFabricante + ", cavalos=" + cavalos + '}';
    }
    
}
