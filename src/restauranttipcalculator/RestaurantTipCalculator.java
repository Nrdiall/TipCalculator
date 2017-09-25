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
public class RestaurantTipCalculator implements TipCalculator {
    private double billTotal;
    QualityOfService quality;

    public RestaurantTipCalculator(double billTotal, QualityOfService quality) {
        this.billTotal = billTotal;
        this.quality = quality;
    }

    @Override
    public double getTip() {
        double tipPercent = 0;
        switch(quality){
            case BAD:
                tipPercent = .05;
                break;
            case GOOD:
                tipPercent = .1;
                break;
            case EXCELLENT:
                tipPercent = .2;
                break;
        }
        return billTotal * tipPercent;
    }
    
    
    
}
