//Runtime: 1 ms, faster than 86.99% of Java online submissions for Kids With the Greatest Number of Candies.
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> solucao = new ArrayList<>();
        //Vamos fazer um for para percorrer a array candies. Esse for vai ser responsável por armazenar o maior valor da array.
        int maiorValor=0;
        for(int i=0;i<candies.length;i++){
            if (candies[i]>maiorValor){
                maiorValor=candies[i];
            }
        }
            
        //Agora, criamos mais um for-loop, onde iremos percorrer a array fazendo o somatorio dos extra candies, e ver se ainda bate com o maior valor.E então, adicionamos na ArrayList solução; :D
        for(int i=0;i<candies.length;i++){
            int somatorio = candies[i] + extraCandies;
            if (somatorio>=maiorValor){
                solucao.add(true);
            }else{
                solucao.add(false);
            }
        }
        return solucao;
    }
}
