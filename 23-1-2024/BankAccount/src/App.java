public class App {
    public static void main(String[] args) throws Exception {
        Account a1 = new Account("230001", "Tan", 0.0);
        Account a2 = new SavingAccount("231001", "Bobby", 0.0, 0.0);
        Account a3 = new SavingAccount("232001", "OOO", 0.0, 0.5);

        int[] x = {1,2,3,4,5,6};
        for(int i = 0; i<x.length; i++) {
            System.out.println(x[i]);
        }

        Account[] as = {a1, a2, a3};
        for(int i = 0; i<as.length; i++) {
            System.out.println(as[i]);
        }

    }
}
