public class ConcreteBuilder {
    private final int param1;
    private final double param2;
    private final String param3;

    public ConcreteBuilder(int param1, double param2, String param3) {
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private int param1;
        private double param2;
        private String param3;
        public Builder() {

        }

        public Builder setParam1(int param1){
            this.param1 = param1;
            return this;
        }

        public Builder setParam2(double param2) {
            this.param2 = param2;
            return this;
        }

        public Builder setParam3(String param3) {
            this.param3 = param3;
            return this;
        }

        public ConcreteBuilder build(){
            return new ConcreteBuilder(this.param1, this.param2, this.param3);
        }
    }
}
