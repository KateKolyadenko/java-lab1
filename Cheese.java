//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.PrintStream;

public class Cheese extends Food {
    private String size;
    public Cheese() {
        super("Cheese");
    }

    public void setParam(String param) {
        this.size = param;
    }

    public void consume() {
        PrintStream var10000 = System.out;
        String var10001 = String.valueOf(this);
        var10000.println(var10001 + " " + this.size + " was eaten");
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String name) {
        this.size = name;
    }
}

