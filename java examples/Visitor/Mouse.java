package Visitor;

public class Mouse implements ComputerPart{

    @Override
    public void accept(ComputerPartVisitor cpv) {
        cpv.visit(this);
    }
    
}
