/**
 * Write a description of class Chinken here.
 *
 * @author (Ben Callaghan)
 * @version (V1.06)
 */
public class Chicken
{
    private boolean isAlive;
    private boolean isHappy;
    private String chickenName;
    private int numHearts;
    private double seeds;

    public Chicken(){
        this("NANCY");
    }

    public Chicken(String name){
        isAlive = true;
        isHappy = true;
        chickenName = name;
        numHearts = 4;
        seeds = 0.10; //kg

    }

    public void setName(String name){
        chickenName = name;
    }

    public String getName(){
        return chickenName;    
    }

    public void setHealth(String health){
        if(health.toUpperCase() == "ALIVE"){
            isAlive = true;
        } else {
            isAlive = false;
        }
    }

    public String getHealth(){
        String health = "DEAD";
        if(isAlive){
            health = "ALIVE";
        }
        return health;    
    }

    public void setMood(String mood){
        if(mood.toUpperCase() == "HAPPY"){
            isHappy = true;
        } else {
            isHappy = false;
        }

    }

    public String getMood(){
        String mood = "UNHAPPY";
        if(isHappy){
            mood = "HAPPY";
        }
        return mood;    
    }

    
    public void Feed(double amount){
        //A chicken with more than 2kg of seed will DIE
        //numHearts++
        //Dead chickens can't be fed

        if(this.isAlive){
            if(amount < 2.00){
                if(this.seeds < 2.00){
                    numHearts++;
                    seeds = amount + seeds;
                }else {
                    isAlive = false;
                    numHearts = 0;
                    seeds = 0.00;
                }
            } else {
                isAlive = false;
                numHearts = 0;
                seeds = 0.00;
            }
        }
    }

    
    public void Hit(){
        //numHearts--;
        //if (numheats ==0) DEATH
        // chicken becomes UNHAPPY
        numHearts--;
        isHappy = false;
        if(numHearts == 0){
            isAlive = false;
            seeds = 0.00;
        }
    }

    
    public int getEggs(){
        // 1 egg requires 0.25 kg of seed. Dead chickens can't lay eggs.

        // if chicken is HAPPY you gget twice the number of eggs

        // Laying an egg makes the chickeen UNHAPPY
        if(this.seeds > 0.24){
            if(isAlive && !isHappy){
                this.seeds = this.seeds - 0.25;
                return 1;
            } else if(isAlive && isHappy){
                this.seeds = seeds - 0.25;
                isHappy = false;
                return 2;
            }
        } else {
            isAlive = false;
        }
        return 0;
    }

    
    public void Play(Chicken chic){
        //A chicken is able to play with another chicken ... this makes both chickens HAPPy
        //A chicken can't play with Dead chickens or ITSelf
        
        if(isAlive && !isHappy && chic.isAlive && !chic.isHappy && this != chic){
            isHappy = true;
            chic.isHappy = true;
        } else if(isAlive && isHappy && chic.isAlive && !chic.isHappy && this != chic){
            isHappy = true;
            chic.isHappy = true;
        } else if(isAlive && !isHappy && chic.isAlive && chic.isHappy && this != chic){
            isHappy = true;
            chic.isHappy = true;
        } 
        
    }
    
    public String toString(){
        //NACY HAPPY ALIVE 4 HEARTS 0.10 KG OF SEED

        String mood =  "UNHAPPY";
        if(isHappy){
            mood = "HAPPY";
        }

        String health = "DEAD";
        if(isAlive){
            health = "ALIVE";
        }

        String output = String.format("%-8s %8s %6s %4d HEARTS \t %.2f kg of seed",
                chickenName, mood, health, numHearts, seeds);

        return output;
    }

}