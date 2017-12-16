
    public class Director {
        public void construct(Builder builder) {
            builder.buildProcessor();
            builder.buildMemory();
            builder.buildStorage();
            builder.buildBar();
        }
    }

