/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restauranttipcalculator;

/**
 *
 * @author L117student
 */
public class LuggageTipCalculator implements TipCalculator {
    QualityOfService quality;
    private int numOfBags;

    public LuggageTipCalculator(int numOfBags, QualityOfService quality ) {
        this.quality = quality;
        this.numOfBags = numOfBags;
    }
    
    

    @Override
    public double getTip() {
        double tipPerBag = 0;
        switch(quality){
            case BAD:
                tipPerBag = .5;
                break;
            case GOOD:
                tipPerBag = 1;
                break;
            case EXCELLENT:
                tipPerBag = 2;
                break;
        }
        return numOfBags * tipPerBag;
    }
}
