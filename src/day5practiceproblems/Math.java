package day5practiceproblems;

/**
 * Defining Generic Interface
 */
interface Math<T extends Number> {
    int powerOf(T t);


/**
* Power Of Five
 */
class PowerOfTwo<T extends Number> implements Math<T>{

    public int powerOf(T i) {
        return i.intValue()*i.intValue();
    }
}

    public static void main(String[] args) {
        
        PowerOfTwo<Float>pFive = new PowerOfTwo<Float>();
        System.out.println("The 3 power is : "+pFive.powerOf(3f));
    }
}
