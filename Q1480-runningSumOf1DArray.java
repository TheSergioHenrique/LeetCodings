class Solution {
    public int[] runningSum(int[] nums) {
        //Basicamente queremos rodar um programa que crie uma nova array a partir da original. Essa nova array pega o primeiro valor da primeira, e joga na segunda. pega o segundo valor da primeira, e soma com o valor da primeira da segunda(confuso, deculpa a sintáxe XD), e por aí vai. O laço FOR é responsável por esse funcionamento. Questão simples e divertida!
        int[] arrayResultados= new int[nums.length];
        int numSuporte= 0;
        for(int i=0; i<nums.length;i++){
            numSuporte+=nums[i];
            arrayResultados[i]=numSuporte;
        }
        return arrayResultados;
    }
}
