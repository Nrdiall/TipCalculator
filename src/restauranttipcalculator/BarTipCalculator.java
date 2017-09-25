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
public class BarTipCalculator implements TipCalculator {
    private double billTotal;
    private int numOfDrinks;
    QualityOfService quality;

    public BarTipCalculator(double billTotal, int numOfDrinks, QualityOfService quality) {
        this.billTotal = billTotal;
        this.numOfDrinks = numOfDrinks;
        this.quality = quality;
    }
    @Override
    public double getTip() {
        double tipPerDrink = 0;
        double tipPercent = 0;
        switch(quality){
            case BAD:
                tipPerDrink = .5;
                tipPercent = .05;
                break;
            case GOOD:
                tipPerDrink = 1;
                tipPercent = .1;
                break;
            case EXCELLENT:
                tipPerDrink = 2;
                tipPercent = .2;
                break;
        }
        return (billTotal * tipPercent)+(tipPerDrink*numOfDrinks);
    }
}
