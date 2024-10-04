package exercise;

// BEGIN
public class NegativeRadiusException  extends Exception {
    public String ex;

    public NegativeRadiusException( String ex) {
        super(ex);
        this.ex = ex;
    }
}

// END
