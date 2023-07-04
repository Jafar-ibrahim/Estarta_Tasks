public class Heater {
    private int temperature;

    public Heater() {
        this.temperature = 15;
    }
    public void cooler(){
        temperature-=5;
    }
    public void warmer(){
        temperature+=5;
    }
    public int getTemperature(){
        return temperature;
    }

    public static void main(String[] args) {
        Heater h1 = new Heater();
        System.out.println(h1.getTemperature());
        h1.cooler();
        System.out.println(h1.getTemperature());

    }
}
