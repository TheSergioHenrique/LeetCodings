//Runtime: 4 ms, faster than 14.84% of Java online submissions for Find Pivot Index. Dessa vez não foi bom sniff. refaço depois.
class Solution {
    public int pivotIndex(int[] nums) {
        //Realizamos uma soma de todos os valores logo no inicio para a array só ser lida uma vez.
        int somaTotal = IntStream.of(nums).sum();
        int esquerdaDoPivot=0;
        int direitaDoPivot=0;
        
        for(int i=0; i <nums.length; i++){
            //Esse processo vai calcular quanto se tem na direita excluindo o possivel pivô e a esquerda. Ele manda o pivô para a esquerda se não bater. Se bater, ele retorna o indice. Caso contrário, ele retornará -1.
            direitaDoPivot = somaTotal - nums[i] - esquerdaDoPivot;
            if (esquerdaDoPivot == direitaDoPivot){
                return i;
            }
            esquerdaDoPivot += nums[i];
        }
        //voila!
        return -1;
    }
}
