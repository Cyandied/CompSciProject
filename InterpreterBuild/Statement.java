import java.util.ArrayList;

public abstract class Statement {

    public abstract void execute();

}

class VarDeclaration extends Statement {

    String name;
    Expression expr;

    public VarDeclaration(String name, Expression expr) {
        this.name = name;
        this.expr = expr;
    }

    public void execute() {
        Main.variables.put(name, expr.evaluate());
        // Do something
    }

}

class If extends Statement {

    Expression logic;
    ArrayList<Statement> statement_true;
    ArrayList<Statement> statement_false;

    public If(Expression logic, ArrayList<Statement> statement_true, ArrayList<Statement> statement_false) {
        this.logic=logic;
        this.statement_true = statement_true;
        this.statement_false = statement_false;
    }

    public void execute(){

        if(logic.evaluate() == 1){
            for(Statement statement : statement_true){
                statement.execute();
            }
        }
        else {
            for(Statement statement : statement_false){
                statement.execute();
            }
        }

    }

}
