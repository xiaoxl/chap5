
/**
 * Created by xiao on 1/12/2015.
 */
public class AgotCards extends Cards{
    private int uniqueType; // 0--non-unique,  1--unique, 2--infinity;
    private String[] trait;
    private String[] keywords;

    public int enterplay(){
        return 1;
    }

    public int leaveplay(){
        return 1;
    }

    public int getUniqueType(){
        return uniqueType;
    }

    public String[] getTrait(){
        return trait;
    }

    public String[] getKeywords(){
        return keywords;
    }
}
