public abstract class Expression {
    
    public abstract Integer evaluate();

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

    Integer value;

    public Bool(Boolean value){
        if(value){
            this.value = 1;
        }
        else {
            this.value = 0;
        }
    }

    public Integer evaluate(){
        return value;
    }

}