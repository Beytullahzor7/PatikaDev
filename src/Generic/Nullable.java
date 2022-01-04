package Generic;

public class Nullable <T> {
    private final T value;

    public Nullable(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public boolean isNull(){
        return this.getValue() == null;
    }

    public void run(){
        if(isNull()){
            System.out.println("Bu değişkene değer atamadınız.  (null)");
        }
        else{
            System.out.println(this.value);
        }
    }
}
