public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        this.ligada = true;
    }
    public void desligar(){
        this.ligada = false;
    }
    public void aumentarVolume(){
        this.volume++;
        System.out.println("Aumentando volume da TV para: " + volume);
    }
    public void diminuirVolume(){
        this.volume--;
        System.out.println("Diminuindo volume da TV para: " + volume);
    }
    public void aumentarCanal(){
        this.canal++;
        System.out.println("Aumentando canal da TV para: " + canal);
    }
    public void diminuirCanal(){
        this.canal--;
        System.out.println("Diminuindo canal da TV para: " + canal);
    }
    public void mudarCanal(int canal){
        this.canal = canal;
        System.out.println("Mudando canal da TV para: " + canal);
    }
}
