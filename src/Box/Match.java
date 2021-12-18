package Box;

import java.util.Random;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run(){
        if(isCheck()){
            while (this.f1.health > 0 && this.f2.health > 0){
                System.out.println("=====YENI ROUND=====");
                if(whoFirst()){
                    this.f2.health = this.f1.hit(f2);
                    if(isWin()){
                        break;
                    }
                }
                this.f1.health = this.f2.hit(f1);
                if(isWin()){
                    break;
                }
                System.out.println(this.f1.name + " Saglık: " + this.f1.health);
                System.out.println(this.f2.name + " Saglık: " + this.f2.health);
            }
        }else{
            System.out.println("Sporcuların sikletleri uyuşmuyor...");
        }
    }

    boolean isCheck(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin(){
        if(this.f1.health == 0){
            System.out.println(this.f2.name + " kazandı!");
            return true;
        }
        if(this.f2.health == 0){
            System.out.println(this.f1.name + " kazandı!");
            return true;
        }
        return false;
    }

    boolean whoFirst(){
        Random ran = new Random();
        int x = ran.nextInt(2); //Generate 0 or 1
        if(x == f1.first){
            return true;
        }
        return false;
    }



}
