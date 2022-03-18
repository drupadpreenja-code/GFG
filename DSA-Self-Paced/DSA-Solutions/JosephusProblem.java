public class JosephusProblem {
    
    /**
     * Josephus Problem
     * @param totalPerson
     * @param killPos
     * @return
     */
    public static Integer getAlive(Integer totalPerson, Integer killPos){
        
        if(totalPerson == 1){
            return 0; 
        }
        return (getAlive(totalPerson - 1, killPos) + killPos) % totalPerson;
    }
}
