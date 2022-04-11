package homework;

public class Lesson1 {
    static public void main(String[] args){
    printThreeWords();//Задание1
    checkSumSign();//Задание2
    printColor();//Задание3
    compareNumbers();//Задание4
    }
        public static void printThreeWords() {
        System.out.println("Метод PrintThreeWords:");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.println("---------------------------------");

        }
            public  static void checkSumSign(){
                System.out.println("Метод checkSumSign:");
            int a=-10,b=5;
            if (a+b>=0) {
                System.out.println("Сумма положительная");
                System.out.println("Ответ="+(a+b));
            }
            else{
                System.out.println("Сумма отрицательная ");
                System.out.println("Ответ="+(a+b));
            }
                System.out.println("---------------------------------");
            }
                public  static void printColor(){
                int value=0;
                    System.out.println("Метод printColor:");
                if (value<=0){
                    System.out.println("Красный");
                    System.out.println("value="+value);
                }
                else {
                    if (value>0 && value<=100){
                        System.out.println("Желтый");
                        System.out.println("value="+value);
                    }
                    else {
                        if (value>100){
                            System.out.println("Зеленый");
                            System.out.println("value="+value);
                        }
                    }
                }
                    System.out.println("---------------------------------");
                }
                    public  static void compareNumbers(){
                    int a=4,b=5;
                        System.out.println("Метод compareNumbers:");
                    if(a>=b){
                        System.out.println("a>=b");
                    }
                    else {
                        System.out.println("a<=b");
                    }
                        System.out.println("---------------------------------");
                    }
    
}
