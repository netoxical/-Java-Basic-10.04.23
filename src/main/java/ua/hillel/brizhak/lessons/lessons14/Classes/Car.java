package ua.hillel.brizhak.lessons.lessons14.Classes;

public class Car {
    private String modelName;
    private Engine engine;

    public Car(String modelName, double volume) {
        this.modelName = modelName;
        this.engine = new Engine(volume);
    }

    public Car(String modelName) {
        this.modelName = modelName;
    }

    private void demo() {

        class localClass {
            int x;
            int y;
            int z;
            void localClassMethod() {
                System.out.println("local class");
            }
        }
    }




    class Engine extends OtherClass implements Runnable {
        double Volume;

        public Engine(double volume) {
            Volume = volume;
        }

        void start() {
            System.out.println("Start");
        }
        void stop() {
            System.out.println("Stop");
        }

        @Override
        public void run() {

        }
    }

    static class Wheel {

        static double staticObemTisk = 20;
        double ObemTisk;

        void demoNonStaticMethod() {
            System.out.println("asdasdasdasd");
        }

        static void demoStaticMethod() {
            System.out.println("123151251244");
        }


    }



}
