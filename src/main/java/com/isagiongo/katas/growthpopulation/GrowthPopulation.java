package com.isagiongo.katas.growthpopulation;

public class GrowthPopulation {

    public static Integer countYears(int popStart, double percentIncrease, int quantPeopleIncrease, int popUltrapass){
        Integer years = 0;
        double percentConvert = percentIncrease /100;
        while(popStart < popUltrapass ){
            popStart += popStart * percentConvert + quantPeopleIncrease;
            years++;
        }
        return years;
    }
}
