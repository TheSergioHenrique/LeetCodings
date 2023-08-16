class Solution {
    public int removeDuplicates(int[] nums) {
        int tamanho = 0;
        //tamanho da nova array 100% atualizada 2024 + DLC(Risos)
        //Abaixo, Loop para correr por todos os elementos da array.
        for(int i=0;i<nums.length;i++){
            /*Caso o elemento atual seja igual ao próximo, ignoramos. Temos de certificar que não
            iremos cair em uma situação de out of bounds, por isso temos a verificação do nums.length -1.*/
            if (i < nums.length -1 && nums[i] == nums[i+1]){
                continue;//Vamos deixar um continue aqui para deixar o código legível :>
            }else{
                //A clausula de Else é responsável por extrair os valores duplicados.
            nums[tamanho] = nums[i];
            tamanho++;
            }
        }return tamanho;
    }
}
