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

// should be converted to :
//package ssoft.dummy.beans;
//
//public record MyBeanA(String aString,
//  boolean aBoolean,
//  int aInt,
//  long aLong) {
//
//    public int aMethodWithoutParameters() {
//        return aInt;
//    }
//
//    public int aMethodWithParameters(int a, int b) {
//        return a + b;
//    }
//
//    public int aMethodWithInternalRefAndParameters(int a, int b) {
//        return a + b + aInt;
//    }
//
//    public Builder toBuilder() {
//        return new Builder(this);
//    }
//
//    public static Builder builder() {
//        return new Builder();
//    }
//
//    public static final class Builder {
//        private String aString;
//        private boolean aBoolean;
//        private int aInt;
//        private long aLong;
//
//        private Builder() {}
//
//        private Builder(MyBeanA record) {
//            this.aString = record.aString;
//            this.aBoolean = record.aBoolean;
//            this.aInt = record.aInt;
//            this.aLong = record.aLong;
//        }
//
//        public Builder withAString(String aString) {
//            this.aString = aString;
//            return this;
//        }
//
//        public Builder withABoolean(boolean aBoolean) {
//            this.aBoolean = aBoolean;
//            return this;
//        }
//
//        public Builder withAInt(int aInt) {
//            this.aInt = aInt;
//            return this;
//        }
//
//        public Builder withALong(long aLong) {
//            this.aLong = aLong;
//            return this;
//        }
//
//        public MyBeanA build() {
//            return new MyBeanA(aString, aBoolean, aInt, aLong);
//        }
//    }
//}
