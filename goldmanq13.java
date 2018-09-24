public class goldmanq13 {
    static String winner(String erica, String bob){
        char[] arr1 = erica.toCharArray();
        char[] arr2 = bob.toCharArray();

        int ericaScore = 0;
        int bobScore = 0;

        int numskipe = 0;
        int numeasye = 0;
        int nummede = 0;
        int numharde = 0;

        int numskipb = 0;
        int numeasyb = 0;
        int nummedb = 0;
        int numhardb = 0;

        for(int i=0;i<arr1.length;i++){
            if(arr1[i] == 'S' ||arr1[i] == 's') {
                numskipe++;
                ericaScore += 0;
            }
            else if (arr1[i] == 'E' ||arr1[i] == 'e') {
                numeasye++;
                ericaScore += 1;
            }
            else if (arr1[i] == 'M' ||arr1[i] == 'm') {
                nummede++;
                ericaScore += 3;
            }
            else if (arr1[i] == 'H' ||arr1[i] == 'h') {
                numharde++;
                ericaScore += 5;
            }
        }
        for(int i=0;i<arr2.length;i++){
            if(arr2[i] == 'S' ||arr2[i] == 's') {
                numskipb++;
                bobScore += 0;
            }
            else if (arr2[i] == 'E') {
                numeasyb++;
                bobScore += 1;
            }
            else if (arr2[i] == 'M' ||arr2[i] == 'm') {
                nummedb++;
                bobScore += 3;
            }
            else if (arr2[i] == 'H' ||arr2[i] == 'h') {
                numhardb++;
                bobScore += 5;
            }
        }

        String result = null;

        if(bobScore==ericaScore && (numeasyb==numeasye)&&(numskipb==numskipe)&&(nummedb==nummede)&&(numhardb==numharde))
            result = "Tie";
        else if(bobScore==ericaScore && ((numeasyb>numeasye)||(numskipb>numskipe)||(nummedb>nummede)||(numhardb>numharde))){
            result = "Bob";
        }
        else if(bobScore==ericaScore && ((numeasyb<numeasye)||(numskipb<numskipe)||(nummedb<nummede)||(numhardb<numharde))){
            result = "Erica";
        }
        else if(ericaScore > bobScore)
            result = "Erica";
        else if(bobScore > ericaScore)
            result = "Bob";


        return result;
    }
}
