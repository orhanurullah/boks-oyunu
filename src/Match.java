public class Match {

    Fighter f1;
    Fighter f2;

    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight , int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run(){
        if(isCheck()){
            int random = (int)Math.round(Math.random());
            while(this.f1.health > 0 && this.f2.health > 0){
                System.out.println("*******Raund*********");
                if(random == 0){
                    this.f2.health = this.f1.hit(f2);
                    if(isWin()){
                        break;
                    }
                    this.f1.health = f2.hit(f1);
                }else{
                    this.f1.health = this.f2.hit(f1);
                    if(isWin()){
                        break;
                    }
                    this.f2.health = f1.hit(f2);
                }
                if(isWin()){
                    break;
                }
            }
        }else{
            System.out.println("Dövüşçüler uygun siklette değiller.");
        }
    }

    public Fighter starterFighter(){
        int random = (int)Math.round(Math.random());
        if(random == 1){
            return this.f1;
        }else{
            return this.f2;
        }
    }
    public boolean isCheck(){
        return (this.f1.weight >= minWeight && this.f1.weight < maxWeight) &&
                (this.f2.weight >= minWeight && this.f2.weight < maxWeight);
    }

    public boolean isWin(){
        if(this.f1.health == 0){
            System.out.println(this.f2.name + " kazandı. ");
            return true;
        }

        if(this.f2.health == 0){
            System.out.println(this.f1.name  + " kazandı. ");
            return true;
        }
        return false;
    }
}
