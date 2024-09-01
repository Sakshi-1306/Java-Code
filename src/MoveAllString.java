public class MoveAllString {
    public static void MoveAllX(String str, int index, int count,String newString){
        if(index == str.length()){
            for(int i=0; i<count; i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char CurrentChar = str.charAt(index);
        if(CurrentChar == 'x'){
            count++;
            MoveAllX(str,index+1,count,newString);
        }
        else{
            newString += CurrentChar;
            MoveAllX(str,index+1,count,newString);
        }

    }
    public static void main(String[] args){
        String str = "abxchexxxofx";
        MoveAllX(str,0,0,"");
    }
}
