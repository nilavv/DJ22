public class decimalToBinary {
        public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        int a=23;
        System.out.print("The binary value for the decimal is "+ toBinary(a));
    }

    public static String toBinary(int a){

        if(a ==0){
            return "";
        }

        toBinary(a/2);
        sb.append(+a%2);
        return sb.toString();
    }
}
