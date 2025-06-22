package Aug_Ex_11082024.Interface_Example;

    public class WagonR implements Engine{

        void drive(){
            startEngine();
            stopEngine();
        }

        @Override
        public void startEngine() {
            System.out.println("Wagon R i starting");
        }

        @Override
        public void stopEngine() {
            System.out.println("Wagon R i Stopping");
        }
}
