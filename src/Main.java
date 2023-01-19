public class Main {

        public static void main(String[] args) {
            double height = 1.76;
            double weight = 72;
            double index = weight / (height * height);
            if (index < 16){
                System.out.println(" Значительный дефицит массы тела ");
            }
            if (index > 16 && index < 18.5){
                System.out.println(" Дефицит массы тела");
            }
            if (index > 18.5 && index < 25){
                System.out.println(" Норма");
            }
            if (index > 25 && index < 30){
                System.out.println(" Лишний вес ");
            }
            if (index > 30 && index < 35){
                System.out.println(" Ожирение первой степени ");
            }
            if (index > 35 && index < 40){
                System.out.println(" Ожирение второй степени ");
            }
            if (index>40){
                System.out.println(" Ожирение третьей степени");
            }
        }
    }

