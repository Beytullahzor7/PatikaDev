public class Car {

    String type;
    String model;
    String color;
    int speed;
    int speedLimit;

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
        this.speedLimit = 180;
        System.out.println("Parametreli contructor oluşturuldu...");
    }

    void increaseSpeed(int increase){
            this.speed+=increase;
    }

    void decreaseSpeed(int decrease){
        if (speed > 0){
            this.speed-=decrease;
        }
    }

    void printSpeed(){
        System.out.println(this.model + " Speed: " + this.speed);
    }

    void printInfo(){
        System.out.println("Model \t:" + this.model);
        System.out.println("Speed \t:" + this.speed);
    }
}
