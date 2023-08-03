public class House extends Building{

    private double capacity;

    public House(){

    }

    public House(double capacity){
        this.capacity = capacity;
    }

    public double getCapacity() {
        return this.capacity;
    }

    @Override
    public void print(){
        System.out.println("I am House");
    }

    //overLoad
    public void print(String str){
        System.out.println(str);
    }

}
