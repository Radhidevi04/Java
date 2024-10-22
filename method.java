class sample
{
    public void music(){
        System.err.println("Music");
    }
    public String Answer(int mark){
        if(mark>50){
            return "Pass";
        }
        else{
            return "Fail";
        }
    }

}
public class method {
    public static void main(String args[]){
        sample sam = new sample();
        sam.music();
        String str = sam.Answer(51);
        System.out.println(str);

    }
    
}
