public class indexele {
    public static void main(String[] args) {
        int ind=5;
        String str="Justin putin";
        //to print charecters from the intex to end
        for (int i = ind; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
        System.out.println(str.substring(ind));
    }
}
