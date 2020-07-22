public class ExceptionTypesOne {
    public static void main(String[] args) {
        try{
            int a[] = new int[2];
            System.out.println("I am trying to access element 3" + a[3]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }finally {
            System.out.println("Try catch finished, I am in finally block");
        }
    }
}
