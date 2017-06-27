public class Solution {

    //The function transforms from a character to a number
    public static Integer[] transformation(String A){
        String str = "AKQJd98765432";
        char[] arraystr = str.toCharArray();
        char[] arrayA = A.toCharArray();
            System.out.println(arrayA);
            System.out.println("*************");

        Integer[] arrayres = new Integer[13];
        for(int i = 0; i <= arrayA.length-1; i++){

                if (arrayA[i] == arraystr[0]) {
                    arrayres[i] = 14;
                } else if (arrayA[i] == arraystr[1]) {
                    arrayres[i] = 13;
                } else if (arrayA[i] == arraystr[2]) {
                    arrayres[i] = 12;
                } else if (arrayA[i] == arraystr[3]) {
                    arrayres[i] = 11;
                } else if (arrayA[i] == arraystr[4]) {
                    arrayres[i] = 10;
                } else if (arrayA[i] == arraystr[5]) {
                    arrayres[i] = 9;
                } else if (arrayA[i] == arraystr[6]) {
                    arrayres[i] = 8;
                } else if (arrayA[i] == arraystr[7]) {
                    arrayres[i] = 7;
                } else if (arrayA[i] == arraystr[8]) {
                    arrayres[i] = 6;
                } else if (arrayA[i] == arraystr[9]) {
                    arrayres[i] = 5;
                } else if (arrayA[i] == arraystr[10]) {
                    arrayres[i] = 4;
                } else if (arrayA[i] == arraystr[11]) {
                    arrayres[i] = 3;
                } else if (arrayA[i] == arraystr[12]) {
                    arrayres[i] = 2;
                }

        }
        return arrayres;
    }

    //The function checks the numbers
    public static int solution(String A, String B){
        Integer[] arrayA = transformation(A);
        for(int i = 0; i <= 5; i++){
            System.out.println(arrayA[i]);
        }
        System.out.println("////////////////////");
        Integer[] arrayB = transformation(B);
        for(int i = 0; i <= 5; i++){
            System.out.println(arrayB[i]);
        }
        int res = 0;
        int res1 = 0;
        int res2 = 0;
        for(int i = 0; i <= 5; i++){
            if(arrayA[i] > arrayB[i]){
                res += 1;
            }else if(arrayA[i] == arrayB[i]){
                res1 += 1;
            }else if(arrayA[i] < arrayB[i]){
                res2 += 1;
            }
        }
        System.out.println("////////////////////");
        System.out.println("A > B = " + res);
        System.out.println("A == B = " + res1);
        System.out.println("A < B = " + res2);

        return res;


    }

    public static void main(String[] args) {
        int res = solution("A586QK","JJ653K");
        System.out.println("Result = " + res);
    }
}
