package lab02;

public class lab02_cw5 {
    public static void main(String[] args) {
        Petla();
    }
        public static void Petla() {
            for (int i = 20; i >= 0; i--) {
                if (i == 19 || i == 15 || i == 9 || i == 6 || i == 2){
                    continue;
                }
                else System.out.println(i);
            }

        }
}