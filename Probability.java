public class Probability implements ProbabilityCalc, Comparable <Probability>
{

    
    private int sampleSpace;
    private int sample;
    private double probab;
    private double favorable;
    
    public Probability(int fav, int samplw) {
        this.favorable = fav;
        this.sampleSpace = sampleSpace;
        probab = ((double) favorable);
    }
    
    public double probabilityOR(Probability p2, double overlap){
        return 00;
    }
    
    public double probabilityAND(Probability p2){
        return this.probab * p2.probab;
    }
    
    public void getProbability() {
        this.probab = this.sample(this.sample + this.favorable);
    }
    
    public int compareTo(Probability ob) {
        if(this.probab > other.probab){
            return 1;
        }
        else if(this.probab < other.probab){
            return -1;
        }
        else{
            return 0;
        }
    }
}