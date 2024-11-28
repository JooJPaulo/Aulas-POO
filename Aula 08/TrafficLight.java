public class TrafficLight {
    public enum TrafficLight {
        RED(30), GREEN(60), YELLOW(10);

        private final int duration;

        TrafficLight(int duration) {
            this.duration = duration;
        }

        public int getDuration() {
            return duration;
        }
    }

    public static void main(String[] args) {
        for (TrafficLight light : TrafficLight.values()) {
            System.out.println(light + " light duration: " + light.getDuration() + " seconds");
        }
    }
}
