import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws InvalidPasswordException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your password: ");
        boolean checkLenght = false;
        boolean checkUppercase = false;
        boolean checkNums = false;
        String password = sc.nextLine();

        if(password.length() > 8){
        } else {

            checkLenght = true;

            for(int i = 0; i < password.length(); i++){

                checkNums = password.charAt(i) >= '0' && password.charAt(i) <= '9';
                if(checkNums){
                    break;
                }
            }
            for(int i = 0; i < password.length(); i++){

                checkUppercase = password.charAt(i) >= 'A' && password.charAt(i) <= 'Z';
                if(checkUppercase){
                    break;
                }
            }
        }

        if(checkLenght && checkUppercase && checkNums){
            System.out.println("Your password is correct");
        } else {

            throw new InvalidPasswordException();
        }
    }
}