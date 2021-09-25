package Visitor;

public class Computer implements ComputerPart {
    ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[] {new Keyboard(), new Mouse(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor cpv) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(cpv);
        }
        cpv.visit(this);
    }
    
}
