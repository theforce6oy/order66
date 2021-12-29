package game.polymorphism;

public class Monster {
	
	private String name;
	private int hp;
	private int atk;
	
public Monster(String name, int hp, int atk) {
	
	this.name = name;
	this.hp = hp;
	this.atk = atk;
}
public void doBattle(int atk) {
	
	this.hp = hp - atk;
	if(hp<=0) {
	    hp=0;
	    System.out.println(name+"이(가) 죽었습니다.");
    return;
    }
	System.out.println(name+"의 남은체력:"+hp);
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getHp() {
	return hp;
}
public void setHp(int hp) {
	this.hp = hp;
}
public int getAtk() {
	return atk;
}
public void setAtk(int atk) {
	this.atk = atk;
}
  
}
