package FactoryStrategy;

public class OperationExp implements Strategy {

    @Override
    public int doOperation(int n1, int n2) {
        return (int) Math.pow(n1, n2);
    }
    
}
