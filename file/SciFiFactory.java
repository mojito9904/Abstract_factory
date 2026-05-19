public class SciFiFactory extends GameFactory{

    @Override
    public Enemy createEnemy(){
        return new Alien();
    }

    @Override
    public Weapon createWeapon(){
        return new LaserGun();
    }
    
}
