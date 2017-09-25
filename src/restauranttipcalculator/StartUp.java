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
public class StartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TipCalculator rest = new RestaurantTipCalculator(40, QualityOfService.EXCELLENT);
        System.out.println(rest.getTip());
        TipCalculator rest2 = new LuggageTipCalculator(6, QualityOfService.GOOD);
        System.out.println(rest2.getTip());
        TipCalculator rest3 = new BarTipCalculator(40,3,QualityOfService.EXCELLENT);
        System.out.println(rest3.getTip());
    }
    
}
