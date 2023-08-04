class Solution {
    public List<String> fizzBuzz(int n) {
        //Criamos aqui uma lista(E.D) de Strings que será preenchida no for abaixo. Por conta de ser uma lista, isso pode ser feito sem problemas, diferentemente de uma array.
         List<String> fizzBuzzResposta = new ArrayList<String>();

         //Lá vem bronca, laço FOR for the win!   
         for(int i = 1; i<= n; i++){
             boolean divisivelpor3=(i % 3 == 0);
             boolean divisivelpor5=(i % 5 == 0);
             if(divisivelpor3 && divisivelpor5){
                 fizzBuzzResposta.add("FizzBuzz");
             }else if(divisivelpor3){
                 fizzBuzzResposta.add("Fizz");
             }else if(divisivelpor5){
                 fizzBuzzResposta.add("Buzz");
             }else{
                 fizzBuzzResposta.add(String.valueOf(i));
             }
         }
        return fizzBuzzResposta;
    }
}
