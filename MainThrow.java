public class MainThrow{
    public static void main(String[] args) {
        int numo = 10;
        int deno = 0;
        int result;

        if(deno==0){
            throw new ArithmeticException("Can't Divided");
        }

        result = numo/deno;
        System.out.println("Result : "+result);
    }
}
