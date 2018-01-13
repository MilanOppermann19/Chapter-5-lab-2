//:Milan Oppermann
public interface ProbabilityCalc
{
    /**
     * This uses the current Probability object (this) and a second Probability object
     * to calculate P(p1 OR p2) = p1 + p2 - (p1 AND p2)  where p1 AND p2 is the "overlap"
     */
    double ProbabilityOR(Probability p2, double overlap);
    
    /**
     * This uses the current Probability object (this) and a second Probability object
     * to calculate P(p1 AND p2) = p1 * p2
     */  
    double ProbabilityAND(Probability p2);
}