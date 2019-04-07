// João Marcos Mendes Costa
// RA: 318112368
// João Pedro Coelho Jácome
// RA: 318135934

package estacionamento;

public class Veiculo {
    private String placa;
    private String modelo ;
    private long horaChegada;
    private long horaSaida;
    
            
    public Veiculo() {
    }
    
    public String getPlaca(){
        return this.placa;
    }
    
    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public long getHoraChegada(){
        return this.horaChegada;
    }
    
    public void setHoraChegada(long horaChegada){
        this.horaChegada = horaChegada;
    }

    public long getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(long horaSaida) {
        this.horaSaida = horaSaida;
    }
}
