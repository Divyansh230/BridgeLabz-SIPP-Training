class ReverseString{
    public static String reveString(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Hello, World!";
        String reversedStr = reveString(str);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
    }
}