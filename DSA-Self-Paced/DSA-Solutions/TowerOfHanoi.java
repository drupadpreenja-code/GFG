public class TowerOfHanoi {
    
    /**
     * Classic Problem - Tower of Hanoi
     * @param number
     */
    public static void towerOfHanoi(Integer number){
        printSteps(number, "A", "B", "C");
    }

    /**
     * This method will be called recursively and prints all the steps
     * @param number - Number on the Ring
     * @param first - First pillar
     * @param middle - Middle Pillar
     * @param last - Last Pillar
     */
    private static void printSteps(Integer number, String first, String middle, String last){

        if(number == 1){
            System.out.println("Move 1 from " + first + " to " + last);
            return;
        }
        printSteps(number - 1, first, last, middle);
        System.out.println("Move " + number + " from " + first + " to " + last);
        printSteps(number - 1, middle, first, last);
    }
}
