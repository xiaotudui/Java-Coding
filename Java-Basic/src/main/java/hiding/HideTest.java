package hiding;

class Hide{
    String name;
}

public class HideTest {
    //anywhere
    public String s1 = "public";
    //not a package but a subclass
    protected String s2 = "protected";
    //a package
    String s3 = "default";
    private String s4 = "private";
}
