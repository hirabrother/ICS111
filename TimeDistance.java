//Toru Hirano, lab section 6

import java.util.Scanner;

enum Modes {
        car(30), foot(3), bicycle(10), scooter(20), skateboard(5);

        private int speed;

        // getter method
        public int getSpeed() {
                return this.speed;
        }
        
        private Modes(int speed) {
                this.speed = speed;
        }
}

public class TimeDistance {

        public static String execute(Modes mode, float dist) {
                String output = "";
                switch (mode) {
                case car:
                        output = calculate(dist, mode.getSpeed());
                        break;
                case foot:
                        output = calculate(dist, mode.getSpeed());
                        break;
                case bicycle:
                        output = calculate(dist, mode.getSpeed());
                        break;
                case scooter:
                        output = calculate(dist, mode.getSpeed());
                        break;
                case skateboard:
                        output = calculate(dist, mode.getSpeed());
                        break;
                }
                return output;
        }

        public static String calculate(float dist, int speed) {
      // using speed and distance calculate time into hour and minutes including RoundOff function.
                float val = (float) (dist / (speed * 1.0));
                int hour = (int) (Math.floor(val));
                int minute = (int) Math.round(((val - hour) * 60));

                String time = String.valueOf(hour) + ":" + String.valueOf(minute);
                time = "It takes " + time + " to go " + String.valueOf(dist) + " miles at "
                                + speed + " mph";

                return time;
        }

        public static void main(String[] args) {

                int ch;
                float dist;
                Scanner scan = new Scanner(System.in);

                try {
                        System.out.println("Enter the distance: ");
                        dist = scan.nextFloat();

                        System.out.println("Enter 1 for driving, 2 for walking, 3 for bicycle, 4 for scooter, 5 for scateboard: ");
                        ch = scan.nextInt() - 1;

                        Modes modes = null;

                        switch (ch) {
                        case 0:
                                modes = Modes.car;
                                break;
                        case 1:
                                modes = Modes.foot;
                                break;
                        case 2:
                                modes = Modes.bicycle;
                                break;
                        case 3:
                                modes = Modes.scooter;
                                break;
                        case 4:
                                modes = Modes.skateboard;
                                break;
                        }

                        String output = TimeDistance.execute(modes,dist); 
                        System.out.println(output);

                } catch (Exception e) {
                        System.out.println("Exception occured : " + e.fillInStackTrace().toString());
                }
                scan.close();
        }

}
