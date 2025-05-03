package string;

public class frequencyOfAllCharacter {
    public static void main(String[] args) {
//        String s="hello world";
//        char [] arr=s.toCharArray();
//        for(int i=0; i<s.length(); i++){
//            char c='1';
//            if(arr[i] == '1'){
//                continue;
//            }
//            for(int j=i+1; j<s.length(); j++){
//                if(arr[j] == arr[i]){
//                    arr[j]='1';
//                    c++;
//                }
//            }
//            System.out.println(arr[i] + " " + c);
//        }

//        String s="hello world";
//        int [] arr=new int[128];
//        for(int i=0; i<s.length(); i++){
//            int ascciValue=s.charAt(i);
//            arr[ascciValue]++;
//        }
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]>=1){
//                System.out.println((char)i + " " + arr[i] );
//            }
//        }

        String s="good morning";
        int [] arr=new int[128];
        for(int i=0; i<s.length(); i++){
            int ascciValues=s.charAt(i);
            arr[ascciValues]++;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] >=1){
                System.out.println((char)i + " " + arr[i]);
            }
        }

    }
}
