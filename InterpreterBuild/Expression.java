public abstract class Expression<ReturnType> {
    
    public abstract ReturnType evaluate();

}

class Number extends Expression<Integer> {

    Integer value;

    public Number(Integer value){
        this.value = value;
    }

    public Integer evaluate(){
        return value;
    }

}

class Bool extends Expression<Boolean> {

    Boolean value;

    public Bool(Boolean value){
        this.value = value;
    }

    public Boolean evaluate(){
        return value;
    }

}

