public class Player
{
    private String name;
    private int score;
    private int health;
    private int attackPower;

    public Player(String name)
    {
        this.name = name;
        score = 0;
        health = 100;
        attackPower = 1;
    }

    public static boolean healthHigher(Player user, int val)
    {
        return (user.health > val || user.powered() > val);
    }

    public int powered()
    {
        return health * attackPower;
    }
}
