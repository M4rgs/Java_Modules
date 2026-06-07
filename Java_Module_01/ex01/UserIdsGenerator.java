import java.util.UUID;

public class UserIdsGenerator{
    private UserIdsGenerator() {};
    private static UserIdsGenerator instant = null;
    private static int id = 0;


    public static Integer generateId(){
        return id++;
    }

    public static UserIdsGenerator getInstance(){
        if (instant != null)
            return new UserIdsGenerator();
        return instant;
    }

    
}