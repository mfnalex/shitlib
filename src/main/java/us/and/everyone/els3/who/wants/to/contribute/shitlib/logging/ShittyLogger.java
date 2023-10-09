package us.and.everyone.els3.who.wants.to.contribute.shitlib.logging;

public class ShittyLogger {

    private final String name;

    protected ShittyLogger(String clazz) {
        this.name = "[ShitLib] [" + clazz + "] ";
    }

    public static ShittyLogger getLoggerForThisClazz() {
        return new ShittyLogger(new LinkageError().getStackTrace()[1].getClassName());
    }

    public void log(String message) {
        System.out.println(name + " " + message);
    }

}
