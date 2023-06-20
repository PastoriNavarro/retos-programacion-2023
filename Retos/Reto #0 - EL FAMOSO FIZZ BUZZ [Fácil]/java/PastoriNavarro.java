public class FizzBuzz {

    public static void main(String[] args) {

        //Sacar números del 1 al 100, ambos incluidos
        for (int i = 1; i <= 100; i++){

            //Si el número es múltipli de 3 se imprime "Fizz" en lugar del número
            if(i % 3 == 0){
                System.out.println("Fizz");

                //i el número es múltiplo de 5 se imprimer "Buzz" en lugar del número
            } else if (i % 5 == 0) {
                System.out.println("Buzz");

                //Si el número es múltiplo de los 2 se imprime "FizzBuzz" en lugar del número
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");

                //Si no es mñultiplo de ninguno se imprime el número
            }else {
                System.out.println(i);
            }
        }
    }

}
