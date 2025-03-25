public class Main {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        System.out.println("A Smart TV está ligada? \n" + (smartTv.ligada ? "Sim" : "Não"));
        System.out.println("Em qual canal está? " + smartTv.canal);
        System.out.println("Qual o volume da TV? " + smartTv.volume);
        smartTv.ligar();
        System.out.println("Novo status -> TV ligada? " + (smartTv.ligada ? "Sim" : "Não"));
        smartTv.aumentarVolume();
        System.out.println("Qual o volume da TV? " + smartTv.volume);
        smartTv.diminuirVolume();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.mudarCanal(7);
        smartTv.desligar();
        System.out.println("Novo status -> TV ligada? " + (smartTv.ligada ? "Sim" : "Não"));
    }
}