class Solution {
    public List<String> letterCombinations(String digits) {
        //TAVA DANDO ERRADO PQ EU NAO SABIA ESCREVER ISSO. 
        if (digits.isEmpty()) return Collections.emptyList();


        //Criamos uma array de Strings com os resultados de cada digito do telefone.
        String[] letrasTelefone = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        //Agora criamos uma lista para os resultados.
        List<String> resultados = new ArrayList<>();
        //chamamos o método backtrack(algoritmo de backtracking)!
        backtrack("", digits, letrasTelefone, resultados);
        return resultados;
    }

    //magia negra.. Mentira, vou estudar um pouco mais e comento o passo a passo. Mas se trata de um algoritmo recursivo, que deixa a complexidade infinitamente maior!
    private void backtrack(String combinacao, String nextDigits, String[] letrasTelefone, List<String> resultados){
        if (nextDigits.isEmpty()) {
            resultados.add(combinacao);
        } else {
            String letras = letrasTelefone[nextDigits.charAt(0) - '2']; 
            for (char letra : letras.toCharArray()) {
                backtrack(combinacao+letra, nextDigits.substring(1),letrasTelefone, resultados);
            }
        }
    }
}
