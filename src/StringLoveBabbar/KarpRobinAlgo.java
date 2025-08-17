package StringLoveBabbar;

public class KarpRobinAlgo {
    final static int MOD = 101;
    public static void main(String[] args) {
//        String text1="Piyush";
//        String text2="RahulPiyushSaksham";
//        System.out.println(search(text2,text1));
        long hash = 'a'*(long)Math.pow(101,2);
        long newHash=(hash-'b')/101;
        System.out.println(newHash);
    }

    public static int search(String text, String pattern){
        int patternLength = pattern.length();
        long textHash=calculateHash(text.substring(0,patternLength));
        long patternHash=calculateHash(pattern);
        for(int i=0;i<=text.length()-patternLength;i++){
            if(textHash==patternHash){
                if(text.substring(i,i+patternLength).equals(pattern))
                    return i;
            }else if(i<text.length()-patternLength){
                textHash=updateHash(textHash, text.charAt(i),text.charAt(i+patternLength),patternLength);
            }
        }
        return -1;
    }
    public static long calculateHash(String str){
        long hash=0;
        for(int i=0;i<str.length();i++){
            hash+=str.charAt(i)*(long)Math.pow(MOD,i);
        }
        return hash;
    }
    public static long updateHash(long prevHash, char oldChar, char newChar, int patternLength){
        long newHash = (prevHash-oldChar)/MOD;
        newHash=newHash+newChar * (long)Math.pow(MOD,patternLength-1);
        return newHash;
    }
}
