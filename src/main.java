//package src;
//using namespace std;

class Character{
    String nama;
    int health;
    String weapon;
    int attackP;
    int mana;

    // membuat constructor
    Character(String nama, int health, String weapon, int attackp, int mana){  
        this.nama = nama;
        this.health = health; 
        this.weapon = weapon;
        this.attackP = attackp;
        this.mana = mana;
        print();
    }
    void attack(){
        this.mana -= 5; 
        System.out.println(this.nama+" menyerang si sotong");
        System.out.println("sotong terkena demage sebanyak "+this.attackP );
    }
    void damage(int attackP){
        System.out.println("ucup terkena demage sebanyak" + attackP);
        this.health -= attackP;
    }
    void print(){
        System.out.println("nama: "+nama);  
        System.out.println("health: "+ health);
        System.out.println("weapon: "+weapon);
        System.out.println("attack power: " +attackP);
        System.out.println("mana : " +mana);
    }
}
public class main{
    public static void main(String[] args) {
        Character character1 = new Character("ucup",100,"pedang excalibur",5,100);
        character1.attack();
        character1.damage(10);
        character1.print();
    }
}