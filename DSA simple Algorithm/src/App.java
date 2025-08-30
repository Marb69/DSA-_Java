import java.util.Stack;
public class App {
    public static void main(String[] args) throws Exception {
      
       
    int num1 = 1;
    int num2 = 0;

    data Data = new data();
    for(int i = 0; i<18; i++){

        int newFibo = num1 + num2; //1

        System.out.println(newFibo);//1
        num2 = num1; // num2= 0
        num1 = newFibo; //num1 = 1
    }

     Data.data(num1, num2);
    
          
    }
}
