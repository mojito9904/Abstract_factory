public class MedievalFactory extends GameFactory{

    @Override
    public Enemy createEnemy(){
        return new Orc();
    }
    
    @Override
    public Weapon createWeapon(){
        return new Sword();
    }
    
}
