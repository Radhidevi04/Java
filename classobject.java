
class Calu{
    public int mul (int n , int o){
        int c = n * o;
        return c;
    }
    public int add(int d ,int e){
        int f = d + e;
        return f;
    }
    public int sub(int w , int y){
        int z = w - y;
        return z;
    }
}
    public class classobject {
        public static void main(String[] args) {
            
        
    int a = 10;
    int b = 20;
    Calu sum = new Calu();
    int result =  sum.mul(500,20);
    int result2 = sum.add(100,300);
    int result3 = sum.sub(300, 150);
    System.out.println(result);
    System.out.println(result2);
    System.out.println(result3);
        }
}
