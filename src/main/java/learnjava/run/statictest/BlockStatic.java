package learnjava.run.statictest;

public class BlockStatic {
    private static String name;
    static {
        name = "dieu";
        System.out.println(name);
    }

    public BlockStatic(String name) {
        this.name = name;
    }
    public BlockStatic() {
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        BlockStatic.name = name;
    }

    @Override
    public String toString() {
        return "BlockStatic{}" + getName();
    }
}
