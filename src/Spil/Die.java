package Spil;

public class Die {

    private final int MAX = 6 ; // maximum face value
    private  int faceValue ; // current value showing on the die.


    public int roll() // Rolls the die and returns the result.
    {
        faceValue = (int) (Math.random() * MAX ) + 1; // a random number between 1 and 6
        return faceValue ;
    }

    public void setFaceValue ( int value )// Face value mutator
    {
        faceValue = value ;
    }

    public int getFaceValue () // Face value accessor
    {
        return faceValue ;
    }

    public String toString ()
    {
        String result = Integer.toString(faceValue);
        return result;
    }

}
