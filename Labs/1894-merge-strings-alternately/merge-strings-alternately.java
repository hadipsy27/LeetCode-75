class Solution {
    public String mergeAlternately(String word1, String word2) {
        List<String> array1 = new ArrayList();
        List<String> array2 = new ArrayList();

        for (String w1 : word1.split("")) {
            array1.add(w1);
        }
        for(String w2 : word2.split("")){
            array2.add(w2);
        }

        Integer count = 0;
        Integer min = Math.min(array1.size(), array2.size());
        Integer max = Math.max(array1.size(), array2.size());
        String[] array3 = new String[array1.size()+array2.size()];

        for(int i = 0; i < max; i++){
            if(i<min){
                array3[count++] = array1.get(i);
                array3[count++] = array2.get(i);
            } else {
                if(array1.size()==min){
                    array3[count++] = array2.get(i);
                } else {
                    array3[count++] = array1.get(i);
                }
            }
        }

        return String.join("" , array3);

    }
}