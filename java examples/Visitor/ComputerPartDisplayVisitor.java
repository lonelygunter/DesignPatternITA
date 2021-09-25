package Visitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Visito computer");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Visito monitor");
        
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Visito mouse");
        
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Visito keyboard");
        
    }
    
}
