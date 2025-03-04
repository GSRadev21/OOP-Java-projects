public class Mothorcyicle extends Vehicle {

        public String make;
        public String model;
        public int year;
        public int engineCC;
        public boolean hasSideCar;

        public Mothorcyicle(String make, String model, int year, int engineCC, boolean hasSideCar) {
            super(make, model, year);
            this.engineCC = engineCC;
            this.hasSideCar = hasSideCar;
        }

        @Override
        public void start(){
            super.start();
        }

        @Override
        public void stop(){
            super.stop();
        }
}
