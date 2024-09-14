public class logic {
    public void str(String s1){
        int len=s1.length();
        String line=s1.toLowerCase();
        int i;
        int v=0;
        int c=0;
        char ch;
        for(i=0;i<len;i++){
            ch=line.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                v=v+1;
            }
            else if(Character.isLetter(ch)){
                c=c+1;
            }
        }
        System.out.println("Vowels are: "+v);
        System.out.println("Consonants are: "+c);
    }
}