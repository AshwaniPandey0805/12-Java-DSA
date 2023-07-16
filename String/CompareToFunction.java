package DSA.String;

public class CompareToFunction {
    public static void main(String[] args) {
        String frutis[] = {"apple", "mango", "banana"};

        String largest = frutis[0];

        for(int i = 1; i<frutis.length; i++){
            if(largest.compareTo(frutis[i]) < 0){
                largest = frutis[i];
            }
        }

        System.out.println(largest);
    }
    
}
