public abstract class Expression {
    
    public abstract Object evaluate();

}

class Number extends Expression {

    Integer value;

    public Number(Integer value){
        this.value = value;
    }

    public Integer evaluate(){
        return value;
    }

}

class Bool extends Expression {

    Boolean value;

    public Bool(Boolean value){
        this.value = value;
    }

    public Boolean evaluate(){
        return value;
    }

}

class Addition extends Expression {

    Expression expr1;
    Expression expr2;

    public Addition(Expression expr1, Expression expr2){
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    public Integer evaluate(){
        return expr1.evaluate() + expr2.evaluate();
    }

}