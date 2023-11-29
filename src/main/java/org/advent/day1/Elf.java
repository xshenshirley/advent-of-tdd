package org.advent.day1;

/**
 * Elf that is assigned calories
 */
public class Elf implements Comparable<Elf> {

    private int totalCalories = 0;

    /**
     * Calories carried by the Elf
     * @return total calories
     */
    public int getTotalCalories() {
        return totalCalories;
    }

    public int addTotalCalories(int calories) {
        return totalCalories += calories;
    }

    @Override
    public int compareTo(Elf elfToCompare) {
        
       return elfToCompare.totalCalories - totalCalories;
    }

}
