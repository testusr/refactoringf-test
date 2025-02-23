package ssoft.dummy.beans;

public class MyBeanA {
    private String aString;
    private boolean aBoolean;
    private int aInt;
    private long aLong;

    public int aMethodWithoutParameters() {
        return aInt;
    }

    public int aMethodWithParameters(int a, int b) {
        return a + b;
    }

    public int aMethodWithInternalRefAndParameters(int a, int b) {
        return a + b + aInt;
    }

    public String getaString() {
        return aString;
    }

    public void setaString(String aString) {
        this.aString = aString;
    }

    public boolean isaBoolean() {
        return aBoolean;
    }

    public void setaBoolean(boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    public int getaInt() {
        return aInt;
    }

    public void setaInt(int aInt) {
        this.aInt = aInt;
    }

    public long getaLong() {
        return aLong;
    }

    public void setaLong(long aLong) {
        this.aLong = aLong;
    }
}
