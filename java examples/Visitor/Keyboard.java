package Visitor;

public class Keyboard implements ComputerPart{

    @Override
    public void accept(ComputerPartVisitor cpv) {
        cpv.visit(this);
    }
    
}
