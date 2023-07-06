import java.util.Random ;  // импортируем генератор рандомных чисел
public class Main {
    public static void main(String[] args) {

        String result1 = walk(generateRandomAge(), 15);   //даем значение переменным
        String result2= walk(15, -20);
        String result3 = walk(33, 27);
        String result4 = walk(40, 35);
        String result5 = walk(23, -15);


        System.out.println(result1);   //вывыодим
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);


    }
    //возрващаемый метод
    public static String walk(int age, int temperature){
        if((age>=20 && age<=45) && (temperature>=-20 && temperature<=30)) {
            return "Можно идти гулять";

        }
        else if ((age<=20) && (temperature>=0 && temperature<=28)){
                return  "Можно идти гулять";
            }

        else if ((age>=45) && (temperature>=-10 && temperature<=25)){
                return "Можно идти гулять" ;
            }

        else{
                return  "Оставайтесь дома" ;
            }





        }
        public static int generateRandomAge(){
       Random randomNum = new Random();
       return randomNum.nextInt(80);

           // return Math.random();
        }

    }






