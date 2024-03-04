//Runtime: 2 ms, faster than 98.92% of Java online submissions for Reverse Vowels of a String.
class Solution {
    public String reverseVowels(String s) {
        char[] resultadoVogais = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while(i < j){
            //vamos rodar duas leituras ao mesmo tempo. Essa complexidade com certeza não deveria ser a ideal.
            if(!TestarVogal(resultadoVogais[i])){
                i++;
                continue;
            }
            if(!TestarVogal(resultadoVogais[j])){
                j--;
                continue;
            }
            char temp = resultadoVogais[i];
            resultadoVogais[i++] = resultadoVogais[j];
            resultadoVogais[j--] = temp;
        }
        return new String(resultadoVogais);
    }
    
    private static boolean TestarVogal(char c) {  
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'  
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';  
    }  
}
