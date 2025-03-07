package tools;

public class advcalc1 extends calc1 {   // we are extending from calc class so it should be in same package/folder, otherwise we have
    // to import tools.calc  for extending the calc to avdcalc.
    public int multi(int n1, int n2){
        return n1*n2;
    }

    public int div(int n1, int n2){
        return n1/n2;
    }
}
