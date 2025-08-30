
public class data {


    int count = 2;
    
    public void data(int num1,int num2){

      if(count<19){

        int newFibo = num1 + num2;
        System.out.println(newFibo);
        num2 = num1;
        num1 = num2;
        count++;
        data(num1, num2);
      }

   
       
    }
}
