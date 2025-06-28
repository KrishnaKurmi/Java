public class SubstringRemover {
    public static String removeSubString(String str1, String str2){
        StringBuilder sb = new StringBuilder(1);
        int len1=str1.length();
        int len2=str2.length();
        for(int i=0;i<len1;){
            if(i+len2<=len1 && str1.substring(i, i+len2).equals(str2)){
                i+=len2;
            }
            else{
                sb.append(str1.charAt(i));
                i++;
            }
        }
        str1=sb.toString();
        return str1;
    }
    public static void main(String[] args) {
        String str="abcdddefghddxyz";
        System.out.println(str);
        System.out.println("------------------------------");
        System.out.println(removeSubString(str, "dd"));
    }
}
