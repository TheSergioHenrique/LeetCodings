class Solution {
    public void moveZeroes(int[] nums) {
        //Runtime: 2 ms, faster than 84.41% of Java online submissions for Move Zeroes.
        //Mova os valores 0 de uma array para o final dela, mantendo a ordem relativa dos elementos que não são zero.
        //Uma solução adequada poderia surgir se pudessemos saber a length da array, e com isso, percorrer seus valores, com um ponteiro no valor que não seja zero. Caso encontremos um zero nesse processo, podemos ignorar esse elemento. Com isso, fazemos um laço while para,no fim do for incrementarmos os zero faltantes.
        //Vamos lá.
        if (nums.length==1){
            return;
        }
        int indiceNaoZero = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[indiceNaoZero] = nums[i];
                indiceNaoZero++;
            }
        }
        
        while(indiceNaoZero<nums.length){
            nums[indiceNaoZero] = 0;
            indiceNaoZero++;
        }
        
    }
}
