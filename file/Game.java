public class Game {
    

    private Enemy enemy;
    private Weapon weapon;

    public Game(GameFactory factory){
        enemy=factory.createEnemy();
        weapon=factory.createWeapon();
    }

    public void play(){
        enemy.attack();
        weapon.use();
    }
}
