import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {

        /*
         * int [] num = {1,3,6,0,2};
         * //Arrays.sort(num);
         * //Arrays.fill(num,4);
         * 
         * for (int nums : num) {
         * 
         * System.out.println(nums);
         * 
         * }
         * 
         * System.out.println(num.length);
         * 
         */
        /*
         * String[] names = { "Jan", "Alvert", "Marbebe", "Rays" };
         * ArrayList name = new ArrayList<>();
         * String [] addName = {"newName1","newName2"};
         * 
         * for (int i = 0; i < names.length; i++) {
         * 
         * 
         * 
         * 
         * }
         * 
         * 
         * System.out.println(name);
         * System.out.println();
         */

        /*
         * Stack<String> stackFinal = new Stack<String>();
         * 
         * System.out.println(stackFinal.empty());
         * 
         * String [] item = {"Item1","Item2","Item3","Item4"};
         * int numItem = 0;
         * 
         * do{
         * 
         * stackFinal.push(item[numItem]);
         * numItem++;
         * }while(item.length != numItem);
         * 
         * ArrayList<String> popValue = new ArrayList<String>();
         * Stack<String> stackRes = new Stack<String>();
         * 
         * boolean stop = true;
         * do{
         * 
         * 
         * 
         * do{
         * 
         * stackRes.push(stackFinal.pop());
         * 
         * }while (!stackFinal.empty());
         * 
         * 
         * 
         * do{
         * 
         * popValue.add(stackRes.pop());
         * 
         * }while(!stackRes.empty());
         * 
         * stackFinal.push("NewFirstItem");
         * for (String element : popValue) {
         * 
         * stackFinal.push(element);
         * stop = false;
         * }
         * System.out.println(popValue);
         * 
         * 
         * 
         * }while (stop);
         * 
         * 
         * 
         * 
         * System.out.println(stackFinal);
         */

        /*int rawnum[] = { 1, 2, 3, 4, 5 };
        int fnum[] = new int[6];
        int num = 0;
        int lnum = 0;
     
        
        for (int i = 0; i < fnum.length; i++) {

            
            lnum++;
            fnum[i] = lnum;

            if (i ==2) {
                
                 
                
                fnum[i] = 99;
                num = rawnum[i];
                
            } else if (i >= 3) {

                
                fnum[i] = num;
                num++;
            }

           
        }

        System.out.println();

        for (int i : fnum) {
            
            System.out.println(i);
        }
 */
    }
}
