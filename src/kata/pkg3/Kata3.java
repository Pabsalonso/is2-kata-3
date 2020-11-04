package kata.pkg3;

public class Kata3 {

    public static void main(String[] args) {
        Histogram histogram= new Histogram<String>();
        histogram.increment("gmail.com");
        histogram.increment("ulpgc.es");
        histogram.increment("hotmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");

        new HistogramDisplay("Histograma-Version2",histogram).execute();
    }
    
}
